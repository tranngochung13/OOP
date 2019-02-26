/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

/**
 *
 * @author co.ho
 */
public class Book {
    public String name;
    public Author author;
    public int YearOfPublisher;
    public float price;
    public String status; 
    public Publisher publisher;
    
    //  Khai bao construct    
    public Book(){}
    
    public Book(String name, Author author, int YearOfPublisher,
                float price, String status, Publisher publisher  ){
        this.name = name;
        this.author = author;
        this.YearOfPublisher = YearOfPublisher;
        this.price = price;
        this.status = status;
        this.publisher = publisher;   
    }
    //    set
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public void setYearOfPublisher(int YearOfPublisher ){
        this.YearOfPublisher = YearOfPublisher;
    }
    public void setPrice(float a){
        this.price = price;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setPublisher(Publisher publisher){
        this.publisher = publisher;
    }
    // get
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }

    public int getYearOfPublisher() {
        return YearOfPublisher;
    }
    public float getPrice(){
        return price;
    }
    public String getStatus(){
        return status;
    }
   public Publisher getPublisher(){
       return publisher;
   }
   //Function   
   public void addBook(){
       
   }
   public void deleteBook(){
       
   }
   public void updateBook(){
       
   }
   public void displayBookDetail(){
       
   }
   public void search(String name){
       
   }
   
    
   }
    
    

