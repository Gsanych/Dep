package com.aimprosoft.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Date: 10/16/13
 * Time: 2:19 PM
 */
public class ConnectionManager {
    private static ConnectionManager instance = new ConnectionManager();

    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/Depart";
    String user = "root";
    String password = "1";

    private ConnectionManager() {}

    public Connection getConnection() {
        Connection c = null;
        try {
            Class.forName(driver);
            c = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return c;
    }

    public void releaseConnection(Connection connection) {
        try {
            if(connection != null)
                connection.close();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public static ConnectionManager getInstance() {
        return instance;
    }
}
