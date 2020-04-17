package preparestatement;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.Arrays;

public class BatchUpdate {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/testse", "root", "");


            PreparedStatement psDDL = conn.prepareStatement("create view t7 as select * from paye");
            PreparedStatement psInsert = conn.prepareStatement("insert into paye(payename) VALUES (?)");
            PreparedStatement psUpdate = conn.prepareStatement("update paye set payename=? where id=?");








                // optional, for transaction
            // commit all or rollback all, if any errors
            conn.setAutoCommit(false); // default true

            psDDL.execute();

            // Run list of insert commands
            psInsert.setString(1, "hashtom");
            psInsert.addBatch();

            psInsert.setString(1, "nohom");
            psInsert.addBatch();

            psInsert.setString(1, "dahom");
            psInsert.addBatch();

            int[] rows = psInsert.executeBatch();

            System.out.println(Arrays.toString(rows));

            // Run list of update commands
            psUpdate.setString(1,"11om");
            psUpdate.setInt(2,3);
            psUpdate.addBatch();

            psUpdate.setString(1,"11om");
            psUpdate.setInt(2,3);
            psUpdate.addBatch();

            int[] rows2 = psUpdate.executeBatch();

            System.out.println(Arrays.toString(rows2));

            conn.commit();

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";

    private static final String SQL_UPDATE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";

    private static final String SQL_CREATE = "CREATE TABLE EMPLOYEE"
            + "("
            + " ID INT NOT NULL AUTO_INCREMENT,"
            + " NAME VARCHAR(100) NOT NULL,"
            + " SALARY DECIMAL(15, 2) NOT NULL,"
            + " CREATED_DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,"
            + " PRIMARY KEY (ID)"
            + ")";

}
