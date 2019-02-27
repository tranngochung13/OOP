/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginCntl extends UserList {

private UserList theUserList;




public boolean authenticate(String username, String password){

    validUsers = new ArrayList();
    validUsers.add(username);
    //theUserList.getValidUsers();     //code breaks on this line
    System.out.println("validUsers has been initialized");
    validPasswords = new ArrayList();
    //validPasswords = theUserList.getValidPasswords();
    for (int i = 0; i < validUsers.size(); i++) {
        if (validUsers.get(i).equals(username) && validPasswords.get(i).equals(password)) {
            System.out.println("Success");
            return true;
        }
    }
    return false;

    //return true;

}
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

        LoginCntl login = new LoginCntl();
        login.authenticate(username, password);
    }
}
