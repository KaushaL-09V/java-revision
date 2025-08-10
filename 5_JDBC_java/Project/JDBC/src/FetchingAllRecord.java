import java.sql.*;

import static java.lang.Class.forName;

public class FetchingAllRecord {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String name = "postgres";
        String pass = "0809";

        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, name, pass);

        Statement statement = connection.createStatement();

        String query = "select * from student ";

        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()){
            System.out.print(resultSet.getInt(1)+" - ");
            System.out.print(resultSet.getString(2)+" - ");
            System.out.println(resultSet.getInt(3)+" ");
        }

        connection.close();

    }
}
