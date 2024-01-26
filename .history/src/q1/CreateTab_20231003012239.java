package q1;

import beans.DevData;
import connexion.Connexion;
import dao.IDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//import java.util.logging.Logger;
//import com.mysql.jdbc.Statement;

public class CreateTab {

  public static boolean create() {
    try {
      String req =
        "USE tp1;" +
        "CREATE TABLE `client` (`id` int(11) NOT NULL, `nom` varchar(50) NOT NULL, `prenom` varchar(50) NOT NULL, `date` date NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;" +
        "INSERT INTO `client` (id, nom, prenom, date) VALUES (1, 'aaa', 'aaa', '2023-09-06');" +
        "ALTER TABLE `client` ADD PRIMARY KEY (`id`);" +
        "ALTER TABLE `client` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;" +
        "COMMIT;";
      Statement st = Connexion.getConnection().createStatement();
      System.out.println("Succes d'ajout d'un table);

      if (st.executeUpdate(req) == 1) return true;
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
      String db = "tp1";

      Connection cn = DriverManager.getConnection(url, user, password);
      cn.createStatement();
      create();

      //   ResultSet rs = st.executeQuery(sql);
      //   DevData devdata = null;

      //   if (rs.next()) {
      //     devdata =
      //       new DevData(
      //         rs.getDeveloppeur("ALAMI"),
      //         rs.getJour("lundi"),
      //         rs.getNbScripts(1)
      //       );
      //   }
      // st.executeUpdate(sql);
      // st.close();
      JOptionPane.showMessageDialog(
        null,
        db,
        " Table has been created successfully!",
        // "System Message",
        JOptionPane.INFORMATION_MESSAGE
      );
      //   return devdata;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
