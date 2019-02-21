/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author hung.tran
 */
public class user extends person {
    private String userName;
    private String password;
    public user(){
        
    }
    public user(String userName, String password){
        userName = this.userName;
        password = this.password;
    }
    public user(String userName, String password, String name, char gender, String email, int phone, String address){
        userName = this.userName;
        password = this.password;
        name = this.name;
        gender = this.gender;
        email = this.email;
        phone = this.phone;
        address = this.address;
    }
    public void addNewUser(){
        Scanner input = new Scanner(System.in);
        user a = new user();
        System.out.println("");
        System.out.print("\t\t\t\tEnter userName: ");
        a.userName = input.nextLine();
        System.out.println("\t\t\t\tUser: " +a.userName);
    }
    public static void main(String[] args) {
        user e = new user();
        e.addNewUser();
    }
}
