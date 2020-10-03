package Section_1.Controllers;

import DB.DB;
import JavaFXViewer.Classes.JRViewerFx;
import JavaFXViewer.Classes.JRViewerFxMode;
import Tooles.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.*;
import com.mysql.jdbc.PreparedStatement;
import org.apache.tools.ant.taskdefs.Get;
import org.apache.velocity.runtime.directive.Parse;

import javax.swing.JOptionPane;
import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
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
    private JFXDatePicker date;
    @FXML
    private JFXTextField infos;
    @FXML
    private JFXTextField quant;
    @FXML
    private JFXTextField prix;
    @FXML
    private JFXTextField unity;
    @FXML
    private JFXTextField tva_c;
    @FXML
    private JFXButton add;
    @FXML
    private JFXButton update;
    @FXML
    private JFXButton remove;
    @FXML
    private TableView<Produits> table;
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
    ObservableList<Produits> data = FXCollections.observableArrayList();
    int i = 0;
    Connection connection;
    Double mantants = 0.0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        add.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {

                Double tva;

                i = i + 1;
                String infiT = infos.getText();
                String unityT = unity.getText();
                Double quantT = Double.parseDouble(quant.getText());
                Double prixT = Double.parseDouble(prix.getText());
                Double prix_tatal = quantT * prixT;
                tva = Double.parseDouble(tva_c.getText());
                mantants = mantants + prix_tatal;
                Double Tva = mantants * tva;
                data.add(new Produits(i, infiT, unityT, quantT, prixT, mantants));
                id.setCellValueFactory(new PropertyValueFactory<>("Id"));
                mantantt.setCellValueFactory(new PropertyValueFactory<>("mantant"));
                prixt.setCellValueFactory(new PropertyValueFactory<>("price"));
                quantt.setCellValueFactory(new PropertyValueFactory<>("quantity"));
                unityt.setCellValueFactory(new PropertyValueFactory<>("unity"));
                Infost.setCellValueFactory(new PropertyValueFactory<>("information"));
                table.setItems(data);
                unity.setText(null);
                quant.setText(null);
                prix.setText(null);
                infos.setText(null);
                price.setText(mantants + "");
                price_tva.setText("" + Tva + "");
                Double Allprice = mantants+Tva ;
                price_total.setText("" + Allprice + "");

        });

        //on action of button update
        update.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            Double tva;

            String infiT = infos.getText();
            String unityT = unity.getText();
            Double quantT = Double.parseDouble(quant.getText());
            Double prixT = Double.parseDouble(prix.getText());
            if (infiT == null || unityT == null || quantT == null || prixT == null) {

            } else {

                int index = table.getSelectionModel().getSelectedIndex();
                id.setCellValueFactory(new PropertyValueFactory<>("Id"));
                mantantt.setCellValueFactory(new PropertyValueFactory<>("mantant"));
                prixt.setCellValueFactory(new PropertyValueFactory<>("price"));
                quantt.setCellValueFactory(new PropertyValueFactory<>("quantity"));
                unityt.setCellValueFactory(new PropertyValueFactory<>("unity"));
                Infost.setCellValueFactory(new PropertyValueFactory<>("information"));
                tva = Double.parseDouble(tva_c.getText());
                Double prix_tatal = quantT * prixT;
                String mantantT = "" + prix_tatal + "";
                mantants = mantants + prix_tatal;
                String mantantTT = " " + mantants + "";
                Double Tva = mantants + mantants * tva;
                data.set(index, new Produits(index + 1, infiT, unityT, quantT, prixT));
                unity.setText(null);
                quant.setText(null);
                prix.setText(null);
                infos.setText(null);
                price.setText(mantantTT);
                price_tva.setText("" + Tva);
                Double Allprice = Tva ;
                price_total.setText("" + Allprice);
            }
        });
        remove.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler -> {

          if (table.getSelectionModel()==null){
              JOptionPane.showMessageDialog(null,"Please select value !");
          }else{
              int index = table.getSelectionModel().getSelectedIndex();
              Produits produits=data.get(index);
              Double all_price=Double.parseDouble(price_total.getText());
              price_total.setText(all_price-(produits.getPrice()*produits.getQuantity())-(produits.getPrice()*produits.getQuantity()*Double.parseDouble(tva_c.getText()))
                      +"");
              data.set(index, null);
              unity.setText(null);
              quant.setText(null);
              prix.setText(null);
              infos.setText(null);
          }

        });
    }
    @FXML
    void Next(MouseEvent event) {

        try {

            connection = (Connection) DB.getConnection();
            Forniseur forniseur=new Forniseur(Excute_Query.GetLastForniseurID(),nom_prenomDIC.getText(),adress_DIC.getText(),Integer.parseInt(numtlfDIC.getText()),Integer.parseInt(numfacsDIC.getText()));
            String SQL1 = "INSERT INTO `forniseur`(`nom_prenom`, `Adress`, `N°Tlf`, `N°fax`) VALUES (?,?,?,?)";
            com.mysql.jdbc.PreparedStatement ps1 = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement(SQL1);

            ps1.setString(1,forniseur.getNom_prenom_for());
            ps1.setString(2,forniseur.getForniseur_adress());
            ps1.setInt(3,forniseur.getN_tlf_for());
            ps1.setInt(4,forniseur.getN_fax_for());
            ps1.executeUpdate();

        } catch (ClassNotFoundException | SQLException | NumberFormatException ex) {

            System.out.println(ex.getMessage()+":forniseur");

        } finally {
            try {

                connection.close();

            } catch (SQLException ex){

            }
        }
        try {

            connection = (Connection) DB.getConnection();
            Societe societe=new Societe(Excute_Query.GetLastSocieteID(),nom_prenomDCE.getText(),nom_compan.getText(),adress_DEC.getText(),Integer.parseInt(n_tlfDEC.getText()),Integer.parseInt(n_fackssDEC.getText()),R_compte_banc.getText());
            String SQL2 = "INSERT INTO `societe`(`Derecteur`, `nom`, `Adress_Sos`, `N°tlf_sos`, `N°fax_sos`, `Compte_bancaire`) VALUES (?,?,?,?,?,?)";
            com.mysql.jdbc.PreparedStatement ps2 = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement(SQL2);

            ps2.setString(1,societe.getNom_derecteur());
            ps2.setString(2,societe.getNom_societe());
            ps2.setString(3,societe.getSociete_adress());
            ps2.setInt(4,societe.getN_tlf_Soc());
            ps2.setInt(5,societe.getN_fax_Soc());
            ps2.setString(6,societe.getDomptes_bancaire());

            ps2.executeUpdate();



        }catch (Exception ex){

            System.out.println(ex.getMessage()+"Sosciete");

        }finally {
            try {
                connection.close();
            }catch (Exception e){

            }
        }
        try {
            connection=(Connection) DB.getConnection();
            String SQL="INSERT INTO `langagement`(`id_port`) VALUES (?)";
            Langagement langagement=new Langagement(Excute_Query.GetLastLangagementID()+1,null,0,null,null,null,null,1);
            PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement(SQL);
            preparedStatement.setInt(1,langagement.getId_port());
            preparedStatement.executeUpdate();
        }catch (Exception ex){

            System.out.println(ex.getMessage()+":Langagement");

        }finally {
            try {
                connection.close();
            }catch (Exception e){

            }
        }
        try {

            connection=(Connection)DB.getConnection();
            String SQL="INSERT INTO `depenses`(`theme`, `Mantant_theme`, `id_lang`) VALUES (?,?,?)";
            Depenses depenses=new Depenses(1,theme_commend.getText(),Double.parseDouble(price_total.getText()),Excute_Query.GetLastLangagementID());
            PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement(SQL);
            preparedStatement.setString(1,depenses.getTheme());
            preparedStatement.setDouble(2,depenses.getMantant());
            preparedStatement.setInt(3,depenses.getId_lang());
            preparedStatement.executeUpdate();
        }catch (Exception ex){

            System.out.println(ex.getMessage()+":depenses");

        }finally {
            try {
                connection.close();
            }catch (Exception e){

            }
        }
        try {
            connection = (Connection) DB.getConnection();
            Commend commend = new Commend(Excute_Query.GetLastCommendID()+1,Agir_pour.getText(),theme_commend.getText(), Convert_date.Convert(date.getValue()),Double.parseDouble(price.getText()),Double.parseDouble(price_total.getText()));
            String SQL3 = "INSERT INTO `dommende`(`Agir_pour`, `Theme`, `date`, `Mantant`, `mantant_tatal`, `id_for`, `id_sos`,`id_depenses`) VALUES (?,?,?,?,?,?,?,?)";
            com.mysql.jdbc.PreparedStatement ps3 = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement(SQL3);

            ps3.setString(1,commend.getAgir_pour());
            ps3.setString(2,commend.getTheme());
            ps3.setDate(3,Convert_date.CovertToSqlDate(commend.getDate()));
            ps3.setDouble(4,commend.getMantant());
            ps3.setDouble(5,commend.getMantant_total());
            ps3.setInt(6,Excute_Query.GetLastForniseurID());
            ps3.setInt(7,Excute_Query.GetLastSocieteID());
            ps3.setInt(8,Excute_Query.GetLastDepensesID());

            ps3.executeUpdate();
        }catch (Exception ex){

            System.out.println(ex.getMessage()+":dommend");
        }finally {
            try {
                connection.close();
            }catch (Exception e){

            }
        }

        try{

            connection = (Connection) DB.getConnection();
            for (Produits produit : data) {
                String SQL4 = "INSERT INTO `produits`(`nom_produit`, `Unite`, `Quantite`, `Prix_unitaire`, `id_dommende`) VALUES (?,?,?,?,?)";
                PreparedStatement ps4 = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement(SQL4);
                ps4.setString(1, produit.getInformation());
                ps4.setString(2, produit.getUnity());
                ps4.setDouble(3, produit.getQuantity());
                ps4.setDouble(4, produit.getPrice());
                System.out.println(Excute_Query.GetLastCommendID()+":Last Id Commende");
                ps4.setInt(5,Excute_Query.GetLastCommendID());

                ps4.executeUpdate();

            }

        }catch(Exception ex){

            System.out.println(ex.getMessage()+":produits");

        }finally {
            try{
                connection.close();
            }catch (Exception ex){

            }
        }


        JasperPrint jasperPrint = null;
        try {
            com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DB.getConnection();
            com.mysql.jdbc.PreparedStatement ps;
            jasperPrint = JasperFillManager.fillReport("src/Section_1/Reports/Dommende_Report.jasper", new HashMap<>(), con);
            Stage stage = new Stage();
            new JRViewerFx(jasperPrint, JRViewerFxMode.REPORT_VIEW, stage);
        } catch (JRException e) {
            // TODO Auto-generated catch blo
            JOptionPane.showMessageDialog(null,e.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } catch (SQLException ex) {

        }

    }
}
