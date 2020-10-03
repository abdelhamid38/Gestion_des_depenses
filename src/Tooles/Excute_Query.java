package Tooles;

import DB.DB;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;

import java.sql.Connection;

public class Excute_Query {

    public static int GetLastCommendID(){
        int id = 0;
        try {
            Connection connection=(Connection) DB.getConnection();
            String SQL="SELECT id from `dommende` ORDER BY id DESC LIMIT 1";
            PreparedStatement preparedStatement= (PreparedStatement) connection.prepareStatement(SQL);
            ResultSetImpl resultSet=(ResultSetImpl) preparedStatement.executeQuery();
            resultSet.next();
            id=resultSet.getInt(1);
        } catch (Exception e) {

        }
        return id;
    }
    public static int GetLastLangagementID(){
        int id = 0;
        try {
            Connection connection=(Connection) DB.getConnection();
            String SQL="SELECT id from `langagement` ORDER BY id DESC LIMIT 1";
            PreparedStatement preparedStatement= (PreparedStatement) connection.prepareStatement(SQL);
            ResultSetImpl resultSet=(ResultSetImpl) preparedStatement.executeQuery();
            resultSet.next();
            id=resultSet.getInt(1);
        } catch (Exception e) {

        }
        return id;
    }
    public static int GetLastDepensesID(){
        int id = 0;
        try {
            Connection connection=(Connection) DB.getConnection();
            String SQL="SELECT id from `depenses` ORDER BY id DESC LIMIT 1";
            PreparedStatement preparedStatement= (PreparedStatement) connection.prepareStatement(SQL);
            ResultSetImpl resultSet=(ResultSetImpl) preparedStatement.executeQuery();
            resultSet.next();
            id=resultSet.getInt(1);
        } catch (Exception e) {

        }
        return id;
    }
    public static int GetLastForniseurID(){
        int id = 0;
        try {
            Connection connection=(Connection) DB.getConnection();
            String SQL="SELECT id from forniseur ORDER BY id DESC LIMIT 1";
            PreparedStatement preparedStatement= (PreparedStatement) connection.prepareStatement(SQL);
            ResultSetImpl resultSet=(ResultSetImpl) preparedStatement.executeQuery();
            resultSet.next();
            id=resultSet.getInt(1);
        } catch (Exception e) {

        }
        return id;
    }
    public static int GetLastSocieteID(){
        int id = 0;
        try {
            Connection connection=(Connection) DB.getConnection();
            String SQL="SELECT id from societe ORDER BY id DESC LIMIT 1";
            PreparedStatement preparedStatement= (PreparedStatement) connection.prepareStatement(SQL);
            ResultSetImpl resultSet=(ResultSetImpl) preparedStatement.executeQuery();
            resultSet.next();
            id=resultSet.getInt(1);
        } catch (Exception e) {

        }
        return id;
    }
}
