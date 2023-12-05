package com.zqc.pattern.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {
    private Vector<Connection> pool;

    private String url =  "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";
    private int poolSize = 100;

    public ConnectionPool() {
        pool = new Vector<Connection>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                Connection conn = DriverManager.getConnection(url,username,password);
                pool.add(conn);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public synchronized Connection getConnection(){
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }

        return null;
    }

    public synchronized void release(Connection conn) {
        pool.add(conn);
    }
}
