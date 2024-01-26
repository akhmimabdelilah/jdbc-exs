package q3;

import connexion.Connexion;
import dao.IDao;
import service.DevDataService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import beans.DevData;

// public class ExoJDBC implements IDao<DevData> {
public class ExoJDBC {
    
    public static void main(String[] args) throws Exception {
        try {
            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/tp1";

            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection(url, user, password);
            cn.createStatement();
            // nbMaxScript();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
