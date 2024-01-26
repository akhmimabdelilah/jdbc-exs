package q1;

import beans.DevData;
import connexion.Connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//import java.util.logging.Logger;
//import com.mysql.jdbc.Statement;

public class CreateDB {

  public static void main(String[] args) throws Exception {
    try {
      String user = "root";
      String password = "root";

      String url = "jdbc:mysql://localhost:3306/";
      // String url = "jdbc:mysql://localhost:3306/tar";
      String db = "tar";

      String sql = "CREATE DATABASE " + db;
      String req = "select * from DevData";

      Connection cn = DriverManager.getConnection(url, user, password);
      Statement st = cn.createStatement();
      ResultSet rs = st.executeQuery(req);
      DevData devdata = null;

      if (rs.next()) {
        devdata =
          new DevData(
            rs.getDeveloppeur("ALAMI"),
            rs.getJour("lundi"),
            rs.getNbScripts(1)
          );
      }
      // st.executeUpdate(sql);
      // st.close();
      // JOptionPane.showMessageDialog(
      //   null,
      //   db,
      //   " Database has been created successfully!",
      //   // "System Message",
      //   JOptionPane.INFORMATION_MESSAGE
      // );

      return devdata;

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
