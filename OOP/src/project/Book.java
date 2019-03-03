/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Thiet Bi So
 */
public class Book {
    Scanner scNumber = new Scanner(System.in);
    Scanner scWord = new Scanner(System.in);
    String name;
    int year;
    int price;
    String status;
    ArrayList<Integer> ls = new ArrayList<>();
    ArrayList<Book> names = new ArrayList<>();
    public void inputData(Book b){
//        String check = ("y");
//        do {
            System.out.print("input name: ");
            b.name = scWord.nextLine();
//          System.out.print("input author: ");
//          ls.add(scNumber.nextInt());
            System.out.print("input year of publisher: ");
            b.year = scNumber.nextInt();
            System.out.print("input price: ");
            b.price = scNumber.nextInt();
            System.out.print("input status: ");
            b.status = scWord.nextLine();
//          System.out.print("input publisher: ");
//          ls.add(scNumber.nextInt());
//            System.out.print("Input 'y' to continue: ");
//            check = scNumber.next();
//        } while(check.equalsIgnoreCase("y"));
    }
    public void printData(){
        System.out.println("ID\t\tBookName\tYear of publisher\tPrice\t\tStatus");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(ls.get(i)+"\t\t"+names.get(i).name+"\t\t\t"+names.get(i).year+"\t\t"+names.get(i).price+"\t\t"+names.get(i).status);
        }
	}
    public int findByID(int id){
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i)==id){
                System.out.println("tim thay gia tri co id la: ");
                System.out.println(ls.get(i)+"\t\t"+names.get(i).name+"\t\t\t"+names.get(i).year+"\t\t"+names.get(i).price+"\t\t"+names.get(i).status);
                return i;
            }
        } 
        return -1;
    }
    public void deleteByID(int id){
        int pos = findByID(id);
        if (pos>=0){
                System.out.println("Đã xóa gia tri co id la "+ls.get(pos));
                ls.remove(pos);
        }else{
                System.out.println("not found");
        }
    }
    public void find(){
        System.out.println("input id find");
        int idFind = scNumber.nextInt();
        //findByID(idFind); 
        int find = findByID(idFind); 
        if (find<0){
            System.out.println("not found");
        }else
            System.out.println("found pos "+find);
    }
    public void delete(){
        System.out.println("input id delete");
        int idDel = scNumber.nextInt();
        deleteByID(idDel);
    }
    public void menu(){   
        Book b = new Book();
        boolean checkInput = true;
        System.out.println("");
        System.out.println("1. Input book");
        System.out.println("2. Show book");
        System.out.println("3. Find");
        System.out.println("4. delete");
        int choice;
        do {
            try {
                do{
                    System.out.print("Please choice: ");
                    choice = scNumber.nextInt(); 
                    checkInput = true;
                    switch(choice){
                        case 1: 
                            inputData(b); 
                            names.add(b);
                            ls.add(names.size());
                            menu();
                            break;
                        case 2: 
                            printData(); 
                            menu();
                            break;
                        case 3: 
                            find();
                            menu();
                            break;
                        case 4: 
                            delete();
                            menu();
                            break;
                    }
                }while(choice<1 || choice>3);
                System.out.print("Please choice from 1 - 3: ");
            } catch (Exception e) {
                checkInput = false;
                scNumber.nextLine();
            }
            
        } while (!checkInput);		
    }
    public static void main(String[] args) {
        test t = new test();
        t.menu();
    }
}
