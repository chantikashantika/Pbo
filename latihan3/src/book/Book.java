/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

/**
 *
 * @author Lenovo
 */
public class Book {
    private int id;
    private String authorName;
    private String title;
    
    public Book(String title, String authorName){
        this.title = title;
        this.authorName = authorName;
    }
    public Book(){
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
   
    public String getAuthorName(){
        return authorName = authorName;
    }
    
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(){
        this.title = title;
    }
    
    
    
    
}
