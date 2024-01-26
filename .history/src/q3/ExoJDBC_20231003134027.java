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
import java.util.Scanner;

import beans.DevData;

// public class ExoJDBC implements IDao<DevData> {
public class ExoJDBC {
    public void metaInfo() {

    }
    
    public static void main(String[] args) throws Exception {
        try {
            
            Connexion.getConnection().createStatement();
           
            metaInfo();
            // nbMaxScript();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
