package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfig {
    public static String url = "jdbc:postgresql://test.chxdvrntu7bg.us-east-2.rds.amazonaws.com:5432/testing?currentSchema=pets";
    public static String username = "postgres";
    public static String password = "password";

    public static Connection cc;

    public static Connection getInstance(){
        if(cc == null){
            try{
                cc = DriverManager.getConnection(url, username, password);
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return cc;
    }


}
