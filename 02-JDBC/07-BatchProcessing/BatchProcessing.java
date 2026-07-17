package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessingExample {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "password";

        String query = "INSERT INTO student (id, name) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(query)) {

            //  Disable auto-commit
            con.setAutoCommit(false);

            //  Adding multiple queries to batch
            ps.setInt(1, 3);
            ps.setString(2, "Amit");
            ps.addBatch();

            ps.setInt(1, 4);
            ps.setString(2, "Neha");
            ps.addBatch();

            ps.setInt(1, 5);
            ps.setString(2, "Priya");
            ps.addBatch();

            //  Execute batch
            int[] result = ps.executeBatch();

            //  Commit transaction
            con.commit();

            System.out.println("Batch executed successfully!");

            //  Print result
            for (int i : result) {
                System.out.println("Rows affected: " + i);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
Expected Output:

Batch executed successfully!
Rows affected: 1
Rows affected: 1
Rows affected: 1
*/
