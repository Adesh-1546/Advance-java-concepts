package JDBC;

import java.sql.*;

public class SelectExample {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "password";

        String query = "SELECT * FROM student WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, 2);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " + rs.getString("name")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
Expected Output:
2 - Rahul
*/
