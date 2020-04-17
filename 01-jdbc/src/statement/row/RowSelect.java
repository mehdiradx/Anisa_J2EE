package statement.row;

import model.Employee;

import java.math.BigDecimal;
import java.sql.*;

public class RowSelect {

    public static void main(String[] args) {



        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/testse2", "root", "");
            Statement statement = conn.createStatement();


            ResultSet resultSet = statement.executeQuery("select * from paye");

            while (resultSet.next()) {

                long id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                System.out.println("id is:"+id+" name is:"+name);
                System.out.println("-------------------------------------");


            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
