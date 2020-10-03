/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashbord;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import gestion_des_depenses.Gestion_des_depenses;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hamid
 */

public class DashbordController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    AnchorPane parent;

    @FXML
    AnchorPane ports;

    @FXML
    private JFXButton exit;

    @FXML
    private JFXButton FullScreen;

    @FXML
    private FontAwesomeIconView max;

    @FXML
    private JFXButton reduire;

    @FXML
    private VBox vbox;

    @FXML
    void princ(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        for (Node n : vbox.getChildren()) {
            n.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
                switch (n.getAccessibleText()) {

                    case "port_1":

                        try {
                            ports.toFront();
                            ports.getChildren().clear();
                            AnchorPane door = FXMLLoader.load(getClass().getResource("../Payer_depenses/FXML/Payer_les_depenses.fxml"));
                            ports.getChildren().add(door);
                            break;
                        } catch (IOException ex) {

                        }
                        break;
                    case "port_2":
                        try {
                            ports.toFront();
                            ports.getChildren().clear();
                            AnchorPane door = FXMLLoader.load(getClass().getResource("../User_Dashboard/FXML/Outiles.fxml"));

                            ports.getChildren().add(door);

                            break;
                        } catch (IOException ex) {

                        }

                    case "port_3":
                        try {

                            ports.getChildren().clear();
                            Parent parent=FXMLLoader.load(getClass().getResource("../section_3/FXML/Provision.fxml"));
                            ports.getChildren().add(parent);

                        } catch (Exception ex) {
                        }

                    case "port_4":
                        try {
                            //ports.toFront();
                            ports.getChildren().clear();
                            AnchorPane door = FXMLLoader.load(getClass().getResource("../section_4/FXML/Accessoires.fxml"));
                            ports.getChildren().add(door);
                            break;
                        } catch (IOException ex) {

                        }

                    case "port_5":
                        try {
                            ports.toFront();
                            ports.getChildren().clear();
                            AnchorPane door = FXMLLoader.load(getClass().getResource("../section_5/FXML/Nourriture.fxml"));
                            ports.getChildren().add(door);
                            break;
                        } catch (IOException ex) {

                        }


                    case "port_6":
                        try {
                            ports.toFront();
                            ports.getChildren().clear();
                            AnchorPane door = FXMLLoader.load(getClass().getResource("../section_6/FXML/Maitenance.fxml"));
                            ports.getChildren().add(door);
                            break;
                        } catch (IOException ex) {

                        }
                }
            });
        }

        makeStageDrageable();

        exit.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
            Platform.exit();
        });
        reduire.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            stage.setIconified(true);
        });
        FullScreen.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            if (!stage.isFullScreen()) {
                stage.setFullScreen(true);
                max.setIcon(FontAwesomeIcon.LAPTOP);
            } else {
                stage.setFullScreen(false);
                max.setIcon(FontAwesomeIcon.CLONE);
            }
        });
    }

    @FXML
    public void princ(Event e) {

    }



    private void makeStageDrageable() {
        parent.setOnMousePressed((MouseEvent event) -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        parent.setOnMouseDragged((MouseEvent event) -> {
            Gestion_des_depenses.stage.setX(event.getScreenX() - xOffset);
            Gestion_des_depenses.stage.setY(event.getScreenY() - yOffset);
            Gestion_des_depenses.stage.setOpacity(0.7f);
        });
        parent.setOnDragDone((e) -> {
            Gestion_des_depenses.stage.setOpacity(1.0f);
        });
        parent.setOnMouseReleased((e) -> {
            Gestion_des_depenses.stage.setOpacity(1.0f);
        });
    }
    Double xOffset;
    Double yOffset;
}
