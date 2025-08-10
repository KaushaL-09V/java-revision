import java.sql.*;
import java.util.Scanner;

public class PreaparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner sc = new Scanner(System.in);
        String url = "jdbc:postgresql://localhost:5432/demo";
        String name = "postgres";
        String pass = "0809";

        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, name, pass);

        System.out.println("Enter the sid: ");
        int sid = sc.nextInt();

        System.out.println("Enter the username: ");
        String sname = sc.next();

        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        String query = "insert into student values(?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setInt(1,sid);
        preparedStatement.setString(2,sname);
        preparedStatement.setInt(3,marks);

        boolean execute = preparedStatement.execute();

        System.out.println(execute);

        connection.close();
    }
}
