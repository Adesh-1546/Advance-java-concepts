package JDBC;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HikariCPExample {

    public static void main(String[] args) {

        //  Step 1: Configure HikariCP
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/testdb");
        config.setUsername("postgres");
        config.setPassword("password");

        config.setMaximumPoolSize(10);

        //  Step 2: Create DataSource
        HikariDataSource dataSource = new HikariDataSource(config);

        String query = "SELECT * FROM student";

        try (Connection con = dataSource.getConnection();
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

        //  Step 3: Close pool
        dataSource.close();
    }
}

/*
Expected Output:
1 - Adesh
2 - Rahul
...
*/
