package com.zqc.pattern.flyweight.pool;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
        System.out.println(connection);
    }
}
