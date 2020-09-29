package Section_1.Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Payer_les_depenses implements Initializable {


    @FXML
    private JFXTextField nom_prenomDIC;

    @FXML
    private JFXTextField adress_DIC;

    @FXML
    private JFXTextField numtlfDIC;

    @FXML
    private JFXTextField numfacsDIC;

    @FXML
    private JFXTextField nom_prenomDCE;

    @FXML
    private JFXTextField nom_compan;

    @FXML
    private JFXTextField Agir_pour;

    @FXML
    private JFXTextField adress_DEC;

    @FXML
    private JFXTextField n_tlfDEC;

    @FXML
    private JFXTextField n_fackssDEC;

    @FXML
    private JFXTextField R_compte_banc;

    @FXML
    private JFXTextArea theme_commend;

    @FXML
    private JFXTextField infos;

    @FXML
    private JFXTextField quant;

    @FXML
    private JFXTextField prix;

    @FXML
    private JFXTextField unity;

    @FXML
    private JFXTextField Pc_naftal;

    @FXML
    private JFXTextField tva_c;

    @FXML
    private JFXButton remove;

    @FXML
    private JFXButton update;

    @FXML
    private JFXButton add;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> id;

    @FXML
    private TableColumn<?, ?> Infost;

    @FXML
    private TableColumn<?, ?> unityt;

    @FXML
    private TableColumn<?, ?> quantt;

    @FXML
    private TableColumn<?, ?> prixt;

    @FXML
    private TableColumn<?, ?> mantantt;

    @FXML
    private Label price_tva;

    @FXML
    private Label price_total;

    @FXML
    private Label price;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    void Next(MouseEvent event) {

    }
}
