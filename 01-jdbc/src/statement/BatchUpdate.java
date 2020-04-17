package statement;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Arrays;

public class BatchUpdate {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/testse2", "root", "");
            Statement statement = conn.createStatement();
            // optional, for transaction
            // commit all or rollback all, if any errors
            conn.setAutoCommit(false);

            // add list of SQL commands and run as a batch

            // drop table
//            statement.addBatch(SQL_DROP);
//
//            // create table
//            statement.addBatch(SQL_CREATE);

            // insert
            statement.addBatch("insert into paye (name) VALUE ('12om')");

            // insert
            statement.addBatch("insert into paye (name) VALUE ('11om')");

            // update
            statement.addBatch("update paye set name='aval' where id=4");

            int[] rows = statement.executeBatch();

            System.out.println(Arrays.toString(rows)); // [ 1, 1, 1]

            // commit everything
            conn.commit();

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
