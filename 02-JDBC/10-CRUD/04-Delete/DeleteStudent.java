package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudent {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "postgres";
        String pass = "password";

        String query = "DELETE FROM student WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, 20);

            int rows = ps.executeUpdate();
            System.out.println("Deleted: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
Deleted: 1
*/
