/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author hung.tran
 */
public class Main {
    Book b = new Book();
    Author a = new Author();
    Publisher p = new Publisher();
    int aa;
    String bb;
    
    public void menu(){
        System.out.println("----------------------------------");
        System.out.println("-         1. Book                -");
        System.out.println("-         2. Author              -");
        System.out.println("-         3. Publisher           -");
        System.out.println("----------------------------------");
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
        System.out.print("Please choice: ");
        choice = sc.nextInt();
        System.out.println("");
            switch(choice){
        case 1: 
            System.out.print("---------------Book---------------");
            b.menu();
            menu();
        case 2: 
            System.out.print("--------------Author--------------");
            a.menu();
            menu();
        case 3: 
            System.out.print("------------Publisher-------------");
            p.menu();
            menu();
        }
        }while(choice<1 || choice>3);
        System.out.print("Please choice from 1 - 3: ");
        
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.menu();
    }
}
