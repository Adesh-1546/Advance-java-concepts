package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableStatementExample {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "password";

        //  Calling function
        String sql = "{ ? = call get_student_name(?) }";

        try (Connection con = DriverManager.getConnection(url, username, password);
             CallableStatement cs = con.prepareCall(sql)) {

            //  Register OUT parameter
            cs.registerOutParameter(1, Types.VARCHAR);

            //  Set IN parameter
            cs.setInt(2, 1);

            //  Execute
            cs.execute();

            //  Get result
            String result = cs.getString(1);

            System.out.println("Student Name: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Expected Output:

Student Name: Adesh
*/
