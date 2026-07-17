package JDBC;

import java.sql.*;

public class ReadStudent {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "postgres";
        String pass = "password";

        String query = "SELECT * FROM student";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " + rs.getString("name")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
