/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import com.mysql.jbdc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database{
    private static Connection connection;
    public static Connection DBConnection(){
        String dbUrl = "jdbc:mysql://localhost:3306/db_praktikum";
        String user = "root";
        String password = "";
        
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = (Connection) DriverManager.getConnection(dbUrl, user, password);
        }catch (SQLExcption exc){
            System.out.println("Koneksi erorr : " + exc.getMessage());
          }
        return connection;
    }
    public static void closeConnection(){
       try{
           connection.close();
       } catch (SQLEcxceptionnn exc){
           System.out.println("FAILED TO CLOSE DATABASES CONNECTION : "+ exc.getMessage());
       }
    }
}




/**
 *
 * @author Lenovo
 */
public class Database {
    
}
