package ma.dentagest;

import ma.dentagest.config.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try (Connection cn = DatabaseConnection.getConnection();
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM patient")) {
            rs.next();
            System.out.println("Connexion OK. Patients : " + rs.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}