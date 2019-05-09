/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.*;
import java.util.TimeZone;

/**
 *
 * @author Asus
 */
public class App {

    private Connection conn;
    private static App makeConnection = new App();

    

    private App() {
        String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
        String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
        String DB_USERNAME = "marwen";
        String DB_PASSWORD = "marwen";
        
        try {

            TimeZone t = TimeZone.getTimeZone("CET");
            TimeZone.setDefault(t);
            //Register the JDBC driver
            Class.forName(DB_DRIVER);
            //Open the connection
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            if(conn != null) System.out.println ("Connected to Database!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
    public static App getApp(){
        return makeConnection;
    }
    public Connection getConn() {
        return conn;
    }
    
    public static void main(String[] args) {
        
    }

}
