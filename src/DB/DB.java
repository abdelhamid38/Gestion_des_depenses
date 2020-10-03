package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    static String url="jdbc:mysql://localhost/gestion_des_depenses";
    static String username="root";
    static String password ="";
    static Connection con=null;
    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        con =  DriverManager.getConnection(url, username,password);
        if(con==null){
            return null;
        }else{
            return con;
        }
    }
}