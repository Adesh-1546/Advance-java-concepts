package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "password";

        String query = "INSERT INTO student (id, name) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(query)) {

            //  Setting parameters
            ps.setInt(1, 2);
            ps.setString(2, "Rahul");

            int rows = ps.executeUpdate();

            System.out.println("Rows inserted: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
Expected Output:
Rows inserted: 1
*/
