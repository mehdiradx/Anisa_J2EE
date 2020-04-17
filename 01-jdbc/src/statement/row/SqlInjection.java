package statement.row;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by asus on 2019/09/21.
 */
public class SqlInjection {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/testse", "root", "");
            Statement statement = conn.createStatement();

            String id2="1 or 1=1";
//            Scanner scanner=new Scanner(System.in);
//            id=scanner.next();





            ResultSet resultSet = statement.executeQuery("select * from paye WHERE id="+id2);

            while (resultSet.next()) {

                long id = resultSet.getInt("id");
                String name = resultSet.getString("payename");
//                String family=resultSet.getString("FAMILY");

                System.out.println("id is:"+id+" name is:"+name);
//                System.out.println("id is:"+id+" name is:"+name+" family is:"+family);
                System.out.println("-------------------------------------");


            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }






    }



}
