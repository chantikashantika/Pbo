/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;
 
import book.config.Database;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;


    
}

/**
 *
 * @author Lenovo
 */
public class BookServicelmpl implements BookService{
    
    private Connection connection = Database.DBConnection();
    private PreparedStatement statement;
    
@Override
public void addBook(Book book){
    try{
        String query = "INSERT INTO book VALUES (0, 1, 2)";
        statement = (Prepared S)
        
    }
    
}
