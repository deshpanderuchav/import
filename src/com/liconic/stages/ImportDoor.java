package com.liconic.stages;

import com.liconic.binding.sys.Cmd;
import com.liconic.binding.sys.Sys;
import com.liconic.rest.client.ImportClient;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import org.apache.logging.log4j.Logger;

public class ImportDoor extends Stage {
    
    public static final String IMPORT_VIA_LEFT_BUFFER = "Import via Left Buffer";
    public static final String IMPORT_VIA_RIGHT_BUFFER = "Import via Right Buffer";
    
    private Scene scene;

    private BorderPane root;
    private HBox hBoxButton;

    private Button btnClose;

    private HBox hBoxInfo;
    private Label lbInfo;

    private HBox hBoxIndicator;
    private ProgressIndicator progressIndicator;
    private ImportStage importStage;

    private int CmdId = 0;

    private Logger log;
    private String WebServiceUri;
    
    private final String importType;

    public ImportDoor(ImportStage importStage, String WebServiceUri, Logger log, String importType) {

        this.importStage = importStage;
        this.log = log;
        this.WebServiceUri = WebServiceUri;
        this.importType = importType;

        log.info("Open ImportDoor window");

        initStyle(StageStyle.UTILITY);

        root = new BorderPane();

        hBoxButton = new HBox();
        hBoxButton.setAlignment(Pos.CENTER);

        btnClose = new Button("Ok");
        btnClose.setPrefWidth(60);
        btnClose.setDisable(true);

        hBoxButton.setPadding(new Insets(10, 0, 10, 0));
        hBoxButton.getChildren().add(btnClose);

        hBoxIndicator = new HBox();

        hBoxIndicator.setAlignment(Pos.CENTER);

        progressIndicator = new ProgressIndicator();

        hBoxIndicator.setPrefSize(100, 100);

        hBoxIndicator.getChildren().add(progressIndicator);

        hBoxInfo = new HBox();

        hBoxInfo.setAlignment(Pos.CENTER_LEFT);

        lbInfo = new Label("Buffer door can be opened");

        hBoxInfo.getChildren().add(lbInfo);

        root.setCenter(hBoxInfo);

        root.setLeft(hBoxIndicator);

        root.setBottom(hBoxButton);

        setOnShown(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                
                if(IMPORT_VIA_LEFT_BUFFER.equals(getImportType())){
                    RunDoorImport("Buffer1");
                }
                else if(IMPORT_VIA_RIGHT_BUFFER.equals(getImportType())){
                    RunDoorImport("Buffer2");                
            }
            }
        });

        scene = new Scene(root, 300, 150);
        
        setTitle(IMPORT_VIA_LEFT_BUFFER.equals(getImportType()) ? "Import via Left Buffer" :  "Import via Right Buffer");
        setScene(scene);

        btnClose.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                close();
            }
        });

        setOnHiding(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                if (IMPORT_VIA_LEFT_BUFFER.equals(getImportType())) {
                    importStage.setImportLeftDoor(null);
                } else if (IMPORT_VIA_RIGHT_BUFFER.equals(getImportType())) {
                    importStage.setImportRightDoor(null);
                }
            }
        });

    }

    public void RunDoorImport(String bufferName) {

        new Thread(new Runnable() {

            @Override
            public void run() {

                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {

                        try {

                            ImportClient importClient = new ImportClient(WebServiceUri, log);
                            Sys sys = importClient.runImportFromBuffer(bufferName);

                            Cmd cmd = sys.getCmds().getValue().getCmd().get(0);

                            if (cmd.getResult().getValue().equals("Error")) {

                                // Change Icon
                                lbInfo.setText(cmd.getValue().getValue());
                                lbInfo.setTextFill(Color.RED);

                                ImageView imageView = new ImageView(new Image("images/warning-icon.png"));

                                hBoxIndicator.getChildren().clear();
                                hBoxIndicator.getChildren().add(imageView);

                                btnClose.setDisable(false);

                            } else {

                                lbInfo.setText("Run Import command...");

                                CmdId = Integer.valueOf(cmd.getId());
                            }

                        } catch (Exception E) {

                            lbInfo.setText("Error: " + E.getMessage());

                            lbInfo.setTextFill(Color.RED);

                            ImageView imageView = new ImageView(new Image("images/warning-icon.png"));

                            hBoxIndicator.getChildren().clear();
                            hBoxIndicator.getChildren().add(imageView);

                            btnClose.setDisable(false);
                        }
                    }
                });
            }
        }).start();
    }

    public void SetCmdReply(int IdCmd, String CmdResult, String CmdValue) {

        if (IdCmd == CmdId) {

            new Thread(new Runnable() {

                @Override
                public void run() {

                    Platform.runLater(new Runnable() {

                        @Override
                        public void run() {

                            ImageView imageView;

                            lbInfo.setText(CmdValue);

                            if (CmdResult.equals("Error")) {

                                lbInfo.setTextFill(Color.RED);
                                imageView = new ImageView(new Image("images/warning-icon.png"));
                                hBoxIndicator.getChildren().clear();
                                hBoxIndicator.getChildren().add(imageView);
                                btnClose.setDisable(false);

                            } else if (CmdResult.equals("Ok")) {

                                btnClose.setDisable(false);
                                imageView = new ImageView(new Image("images/info-icon.png"));
                                hBoxIndicator.getChildren().clear();
                                hBoxIndicator.getChildren().add(imageView);
                                btnClose.setDisable(false);

                            }
                        }
                    });
                }
            }).start();
        }
    }
    
    private String getImportType() {
        return this.importType;
    }

}
