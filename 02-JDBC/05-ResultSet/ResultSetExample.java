package JDBC;

import java.sql.*;

public class ResultSetExample {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "password";

        String query = "SELECT * FROM student";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("Fetching data...");

            // Iterating ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
Expected Output:

Fetching data...
ID: 1, Name: Adesh
ID: 2, Name: Rahul
...
*/
