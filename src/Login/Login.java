package Login;

import DB.DB;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Login implements Initializable {

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton login;

    @FXML
    private Label st;

    @FXML
    private JFXButton exit;

    @FXML
    private JFXButton reduire;

    Stage stage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        exit.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
            Platform.exit();
        });
        reduire.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
            stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            stage.setIconified(true);

        });
        login.addEventFilter(MouseEvent.MOUSE_CLICKED, eventFilter->{


            PreparedStatement ps1;
            ResultSetImpl rs1 ;
            Connection con ;
            PreparedStatement ps2;
            ResultSetImpl rs2 ;

            PreparedStatement ps3;
            ResultSetImpl rs3 ;


            try{
                con = (Connection) DB.getConnection();
                String sql1 = "SELECT * FROM `users` WHERE username='"+username.getText()+"' and password='"+password.getText()+"' and role='user'";
                ps1 =(PreparedStatement) con.prepareStatement(sql1);
                rs1 = (ResultSetImpl) ps1.executeQuery();
                try {
                    if(rs1.next()){
                        Parent Root= FXMLLoader.load(getClass().getResource("../Dashbord/Dashbord.fxml"));
                        Scene vent= new Scene(Root);
                        Stage admin= (Stage)login.getScene().getWindow();
                        admin.setScene(vent);
                        admin.show();
                    }else{

                        st.setText("Il y a une erreur dans la case Username ou Password ");

                    }
                } catch (SQLException | IOException e) {
                }
            }catch(ClassNotFoundException|SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        });
    }
}
