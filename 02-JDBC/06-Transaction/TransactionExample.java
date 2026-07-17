package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "password";

        String withdrawQuery = "UPDATE account SET balance = balance - ? WHERE id = ?";
        String depositQuery = "UPDATE account SET balance = balance + ? WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            //  Step 1: Disable auto-commit
            con.setAutoCommit(false);

            try (PreparedStatement withdraw = con.prepareStatement(withdrawQuery);
                 PreparedStatement deposit = con.prepareStatement(depositQuery)) {

                //  Withdraw from account 1
                withdraw.setInt(1, 500);
                withdraw.setInt(2, 1);
                withdraw.executeUpdate();

                //  Deposit into account 2
                deposit.setInt(1, 500);
                deposit.setInt(2, 2);
                deposit.executeUpdate();

                //  Step 2: Commit transaction
                con.commit();

                System.out.println("Transaction successful!");

            } catch (SQLException e) {

                //  Step 3: Rollback if error occurs
                con.rollback();
                System.out.println("Transaction failed! Rolled back.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
Expected Output:

Transaction successful!

 If any error occurs:
Transaction failed! Rolled back.
*/

/*
Before running -> 
create Account table: 

CREATE TABLE account (
    id INT PRIMARY KEY,
    balance INT
);

INSERT INTO account VALUES (1, 1000), (2, 1000);
*/
