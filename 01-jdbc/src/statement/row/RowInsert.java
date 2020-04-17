package statement.row;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;

public class RowInsert {

    public static void main(String[] args) {

        // auto close connection and statement
        try  {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/testse2", "root", "");
            Statement statement = conn.createStatement();


            int row = statement.executeUpdate("insert into paye(name) VALUE ('sheshom')");

            ResultSet set=statement.getGeneratedKeys();
            while (set.next())
                System.out.println(set.getRowId(1));
//                System.out.println(set.getInt("id"));

            // rows affected
            System.out.println(row);

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String generateInsert(String name, BigDecimal salary) {

        return "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) " +
                "VALUES ('" + name + "','" + salary + "','" + LocalDateTime.now() + "')";

    }


}
