
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) {

    }
    private static final String URL = "jdbc:mysql://localhost:3306/car_servise";
    private static final String USER = "root";
    private static final String PASS = "115201615";
    private static Connection connection;

    public static Connection FullConnected  () {
        try {
            // return  DriverManager.getConnection(URL, USER, PASS);
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            // return null;
            e.printStackTrace();
        }
        return connection;
    }
}
