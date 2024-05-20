import java.sql.*;

public class ConDri {
    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                // Establish connection
                String url = "jdbc:mysql://localhost:3306/school";
                String username = "root";
                String password = "root";
                connection = DriverManager.getConnection(url, username, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
