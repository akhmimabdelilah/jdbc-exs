package q2;

import connexion.Connexion;
import dao.IDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import beans.DevData;

public class ExoJDBC implements IDao<DevData> {
    @Override
    public List<DevData> nbMaxScript() {
        List<DevData> devdata = new ArrayList<>();
        String db = "tp1";

        try {
            String req = "SELECT Developpeur, jour, max(NbScripts) FROM DevData group by jour";

            Statement st = Connexion.getConnection().createStatement();
            System.out.println("Success d'insertion de donnees");
            ResultSet rs = st.executeQuery(req);
            DevData devdata = null;
            if (rs.next()) {
            
                devdata.add( new DevData(
                        rs.getDeveloppeur("ALAMI"),
                        rs.getJour("lundi"),
                        rs.getNbScripts(1));
                    );
            }

        } catch (SQLException ex) {
            System.out.println("Erreur d'ajout d'un client:" + ex.getMessage());
        }
        return devdata;
    }

    @Override
    public List<DevData> triDeveloper() {
        String db = "tp1";

        try {
            String req = "SELECT Developpeur, jour, max(NbScripts) FROM DevData group by jour";

            Statement st = Connexion.getConnection().createStatement();
            System.out.println("Success d'insertion de donnees");
            ResultSet rs = st.executeQuery(req);
            DevData devdata = null;
            if (rs.next()) {
                devdata = new DevData(
                        rs.getDeveloppeur("ALAMI"),
                        rs.getJour("lundi"),
                        rs.getNbScripts(1));
            }

        } catch (SQLException ex) {
            System.out.println("Erreur d'ajout d'un client:" + ex.getMessage());
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        try {
            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/tp1";

            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection(url, user, password);
            cn.createStatement();
            nbMaxScript();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
