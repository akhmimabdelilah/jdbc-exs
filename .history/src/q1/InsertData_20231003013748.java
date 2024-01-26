package q1;

import connexion.Connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class InsertData {

    public class CreateTab {

        public static boolean create() {
            String db = "tp1";

            try {
                String req = "INSERT INTO `DevData` VALUES('ALAMI', 'Lundi', 1);\r\n" + //
                        "INSERT INTO `DevData` VALUES('WAFI', 'Mardi', 2);\r\n" + //
                        "INSERT INTO `DevData` VALUES('SLAMI', 'Jeudi', 1)";

                Statement st = Connexion.getConnection().createStatement();
                System.out.println("Succes d'ajout d'un table");
                JOptionPane.showMessageDialog(
                        null,
                        db,
                        " Table has been created successfully!",
                        // "System Message",
                        JOptionPane.INFORMATION_MESSAGE);

                if (st.executeUpdate(req) == 1)
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
                create();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
