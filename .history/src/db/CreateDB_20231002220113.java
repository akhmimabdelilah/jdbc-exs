package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

//import java.util.logging.Logger;
//import com.mysql.jdbc.Statement;

public class CreateDB {

  public static void main(String[] args) throws Exception {
    try {
      String user = "root";
      String password = "root";

      String url = "jdbc:mysql://localhost:3306/";
      String db = "tar";

      // String sql = "CREATE DATABASE " + db ;
      String sql = "\r\n" + //
          "CREATE TABLE `client` (\r\n" + //
          "  `id` int(11) NOT NULL,\r\n" + //
          "  `nom` varchar(50) NOT NULL,\r\n" + //
          "  `prenom` varchar(50) NOT NULL,\r\n" + //
          "  `date` date NOT NULL\r\n" + //
          ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;\r\n" + //
           ALTER TABLE `client` ADD PRIMARY KEY (`id`);

      Connection cn = DriverManager.getConnection(url, user, password);
      Statement st = cn.createStatement();

      st.executeUpdate(sql);
      st.close();
      JOptionPane.showMessageDialog(
        null,
        db,
        " Database has been created successfully!",
        // "System Message",
        JOptionPane.INFORMATION_MESSAGE
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
