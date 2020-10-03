/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_des_depenses;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author hamid
 */
public class Gestion_des_depenses extends Application {

    public static Stage stage=null;

    @Override
    public void start(Stage primaryStage) {
        try {
            AnchorPane anchorPane=FXMLLoader.load(getClass().getResource("../Dashbord/Dashbord.fxml"));
            Scene scene=new Scene(anchorPane);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.TRANSPARENT);
            stage=primaryStage;
            primaryStage.show();
        } catch (IOException ex) {  
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
