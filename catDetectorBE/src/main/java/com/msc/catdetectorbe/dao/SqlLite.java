package com.msc.catdetectorbe.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.msc.catdetectorbe.Config;

final class SqlLite {

    private Connection connection;
    private String dm;

    public static final SqlLite instance = new SqlLite();

    private SqlLite() {
        createConnection();
    }

    private void createConnection() {
        if (connection != null) {
            return;
        }
        try {
            //org.mariadb.jdbc.Driver
            DriverManager.registerDriver(new org.sqlite.JDBC());
            dm = "jdbc:sqlite:" + Config.getInstance().getBddName();
            connection = DriverManager.getConnection(dm);
        } catch (SQLException ex) {
            Logger.getLogger(SqlLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Statement getStatement() {
        try {
            return connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SqlLite.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Connection getConnection() {
        return connection;
    }

}
