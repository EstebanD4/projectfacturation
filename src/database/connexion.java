package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexion {
private static Connection instance;
private static final String URL = "jdbc:mariadb://157.180.74.213:3306/Facturation";
private static final String USER = "root";
private static final String PASSWORD = "root";
private connexion(){}
    public static synchronized Connection getInstance() throws SQLException {
        if (instance == null || instance.isClosed()) {
            instance = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return instance;
    }
    public static synchronized void close() throws SQLException {
        if (instance != null && !instance.isClosed()) {
            instance.close();
        }
    }
}
