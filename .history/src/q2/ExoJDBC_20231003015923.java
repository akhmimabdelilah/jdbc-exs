package q2;

import connexion.Connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ExoJDBC {

    public static boolean nbMaxScript() {
        String db = "tp1";

        try {
            String req = "SELECT Developpeur, jour, max(NbScripts) FROM DevData group by jour";

            Statement st = Connexion.getConnection().createStatement();
            System.out.println("Success d'insertion de donnees");
                  rs = st.executeQuery(req);
          if (rs.next()){
            client = new DevData(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getDate("date"));
            

          
            return true;
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
