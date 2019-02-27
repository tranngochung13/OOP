/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hung.tran
 */
public class UserList {
ArrayList<String> validUsers;
ArrayList<String> validPasswords;

public UserList(){
    validUsers = new ArrayList();
    validPasswords = new ArrayList();
    
    validUsers.add("user1");
    validUsers.add("user2");
    validUsers.add("user3");
    validUsers.add("user4");
    validUsers.add("user5");

    validPasswords.add("password1");
    validPasswords.add("password2");
    validPasswords.add("password3");
    validPasswords.add("password4");
    validPasswords.add("password5");
}

public ArrayList<String> getValidUsers(){
    return validUsers;
}

public ArrayList<String> getValidPasswords(){
    return validPasswords;
}

public void viewPerson() {
       for(int i = 0; i< validUsers.size();i++){
           System.out.println(validUsers.get(i)+"\t");
          
//        List_Product.get(i).getPrice();
       }
   }

    public static void main(String[] args) {
        UserList u = new UserList();
        u.viewPerson();
    }
}
