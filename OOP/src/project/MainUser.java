/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author hung.tran
 */
import java.util.Scanner;
public class MainUser  
{

    public static void main(String[] args) 
    {

      Scanner input = new Scanner (System.in);  

      String username;
      String password;


      System.out.println("Welcome to your Social network site!");
      System.out.println("\nEnter your username and password to login to your account.");    

      System.out.println("Username: ");
        username = input.nextLine();

      System.out.println("Password: ");
        password = input.nextLine();

        UserAccount login = new UserAccount(username, password);

        if(login.checkPassword())
            System.out.println("You are logged in!");
        else
            System.out.println("The username and password you entered are incorrect.");
    }


}
