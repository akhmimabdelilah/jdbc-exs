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

      String url = "jdbc:mysql://localhost:3306/tar";
      String db = "tar";

      // String sql = "CREATE DATABASE " + db ;
      String sql =
        // "SET SQL_MODE = \"NO_AUTO_VALUE_ON_ZERO\";" +
        // "START TRANSACTION;" +
        // "SET time_zone = \"+00:00\";" +
        "CREATE TABLE `client` (`id` int(11) NOT NULL, `nom` varchar(50) NOT NULL, `prenom` varchar(50) NOT NULL, `date` date NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;" +
        "INSERT INTO `client` (id, `nom`, `prenom`, `date`) VALUES (1, 'aaa', 'aaa', '2023-09-06');" +
        "ALTER TABLE `client` ADD PRIMARY KEY (`id`);" +
        "ALTER TABLE `client` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;" +
        "COMMIT;";

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
