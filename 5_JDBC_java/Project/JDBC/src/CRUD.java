import java.sql.*;

public class CRUD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String name = "postgres";
        String pass = "0809";

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(url,name,pass);

        //Inserting query
        //String query = "insert into student values(5,'john',90)";


        //UPdate the query
        //String query = "update student set sname='max' where sid=5";

        //Delete Query
        String query = "delete from student where sid=210";


        Statement statement = connection.createStatement();

        boolean execute = statement.execute(query);

        //It returns true when the first execute the object here we do count operation
        //It returns False when you are the updating,inserting and delete the query


        System.out.println(execute);


        connection.close();

    }
}
