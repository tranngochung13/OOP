/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author co.ho
 */
public abstract class Person {
    protected String name;
    protected String gender;
    protected String email;
    protected String phone;
    protected String address;
    
    
    public Person(){}
    
    public Person(String name, String gender, String email, String phone, String address){
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    
    static ArrayList<Person> ar = new ArrayList<Person>();
public static void AddPerson(Person pr){
       Scanner input = new Scanner(System.in);
       System.out.println("How many person do you enter?");
       int quantity = input.nextInt();
       input.nextLine();
       for(int i=0;i<quantity;i++){
            
      
       System.out.println("\n\t\t******************************************************");
       System.out.println("\t\t********** PLEASE ENTER ADD PERSON*******************");
       System.out.println("\t\t******************************************************");
       
       System.out.println("Input Name");
         pr.name = input.nextLine();
       
        System.out.println("Input Gender");
         pr.gender = input.nextLine();
        
        System.out.println("Input Email");
         pr.email = input.nextLine();
        
        System.out.println("Input Phone");
         pr.phone = input.nextLine();
        
        System.out.println("Input Address");
         pr.address = input.nextLine();
         
        ar.add(pr);
       }
       
   }
    
    public static void viewPerson() {
       System.out.println("----------LIST PERSON-----------");
       System.out.println("Name \tgender \temail \tPhone \t Address");
       for(int i = 0; i< ar.size();i++){
           System.out.println(ar.get(i).name+"\t"+ar.get(i).gender+"\t"
                   +ar.get(i).email+"\t\t"+ar.get(i).phone+"\t\t"+ar.get(i).address);
          
//        List_Product.get(i).getPrice();
       }
   }
    
    
//     public String toString(){
//       return "Name: "+ getName() + "Gender: " + getGender() + "Email: " + getEmail() 
//               + "Phone: " + getPhone() +"Address: " + getAddress() ;
//           }
   
}
