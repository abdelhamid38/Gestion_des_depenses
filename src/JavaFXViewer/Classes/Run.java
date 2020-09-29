package JavaFXViewer.Classes;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class Run {
    @SuppressWarnings("empty-statement")
    public static void main(String[]args){
       
        JasperPrint jasperPrint;
        try {
            Stage stage=null;
            jasperPrint = JasperFillManager.fillReport("src/JavaFXViewer/resourses/Report_Article.jasper", new HashMap(), new JREmptyDataSource());
            JRViewerFx fx=new JRViewerFx(jasperPrint, JRViewerFxMode.REPORT_VIEW,stage);
            
        } catch (JRException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
    }
}
