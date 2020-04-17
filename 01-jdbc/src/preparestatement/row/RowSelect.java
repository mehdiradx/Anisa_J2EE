package preparestatement.row;


import model.Employee;

import java.math.BigDecimal;
import java.sql.*;

public class RowSelect {

    private static final String SQL_SELECT = "SELECT * FROM EMPLOYEE";

    public static void main(String[] args) {

        try  {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/testse2", "root", "");
            PreparedStatement preparedStatement = conn.prepareStatement("select * from paye WHERE id=?");


            System.out.println(preparedStatement.toString());


            preparedStatement.setString(1,"4 or 1=1");
            System.out.println(preparedStatement.toString());
            ResultSet resultSet = preparedStatement.executeQuery();

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
