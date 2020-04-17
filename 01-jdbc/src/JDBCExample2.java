
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCExample2 {

    public static void main(String[] args) {

        System.out.println("MySQL JDBC Connection Testing ~");

        List<Person> result = new ArrayList<>();

        String SQL_SELECT = "Select * from person";

        // auto close connection and preparedStatement
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT))
        {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int city=resultSet.getInt("city");

                Person person=new Person(id,name,city);

                result.add(person);

            }
            for (Person p:result ) {
                System.out.println(p.getId());
                System.out.println(p.getName());
                System.out.println(p.getCity());
                System.out.println("=================================");
            }
//            result.forEach(x -> System.out.println(x));

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
