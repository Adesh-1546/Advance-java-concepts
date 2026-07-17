package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudent {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "postgres";
        String pass = "password";

        String query = "INSERT INTO student (id, name) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, 20);
            ps.setString(2, "Rohit");

            int rows = ps.executeUpdate();
            System.out.println("Inserted: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
Inserted: 1
*/
