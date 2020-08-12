package org.nf.sms.util;

// alt-enter

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() throws Exception {
        String user = "sa";
        String password = "sa";
        String dataBase = "STUDB";
        String host = "localhost:1434";
        String url = "jdbc:sqlserver://" + host + ";databaseName=" + dataBase + ";user=" + user + ";password=" + password;

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }
}