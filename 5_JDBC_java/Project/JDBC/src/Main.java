import javax.swing.plaf.nimbus.State;
import javax.xml.stream.events.StartElement;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
        1. Import the Package
        2. load and register the Driver
        3. Create Connection
        4. Create Statement
        5. Execute the Statement
        6. Process the Result
        7. Close the driver
         */

        //Load And Register the driver
        String url = "jdbc:postgresql://localhost:5432/demo";
        String name = "postgres";
        String pass = "0809";
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, name, pass);
        System.out.println("Connection Establish");

        //Create a Statement
        Statement statement = connection.createStatement();
        String query = "select sname from student where sid=211";

        //Execute the Statement
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();

        //Process the Result
        String sname = resultSet.getString("sname");
        System.out.println("Name of a student is "+sname);

        //Close the connection
        connection.close();
        System.out.println("Connection is closed ");

    }
}