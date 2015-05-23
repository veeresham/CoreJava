package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection
{
    public static Connection getConnection() throws Exception
    {
        Connection con = null;
        Class.forName("net.sf.log4jdbc.DriverSpy");
        con = DriverManager.getConnection("jdbc:log4jdbc:mysql://localhost:3306/test",
                "root", "");
        return con;
    }
}
