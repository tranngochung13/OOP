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
public class Book extends Author{
    Scanner scNumber = new Scanner(System.in);
    Scanner scWord = new Scanner(System.in);
    ArrayList<Integer> id = new ArrayList<>();
    ArrayList<Book> names = new ArrayList<>();
    String name;
    int year;
    int price;
    String status;
    Author author;
    
    public static boolean checkNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int sz = str.length();
        for (int i = 0; i < sz; i++) {
            if (!Character.isDigit(str.charAt(i)) ) {
                return false;
            }
        }
        return true;
    }
    
    public void inputData(Book b){
        System.out.print("input name: ");
        b.name = scWord.nextLine();
        System.out.print("input author: ");
        String au = scWord.nextLine();
        for (int i = 0; i < 1000; i++) {
            if (names.get(i).author.name == au) {
                b.author.name = au;
                break;
            }
        }
        System.out.print("input year of publisher: ");
        b.year = scNumber.nextInt();
        System.out.print("input price: ");
        b.price = scNumber.nextInt();
        System.out.print("input status: ");
        b.status = scWord.nextLine();
//      System.out.print("input publisher: ");
//      ls.add(scNumber.nextInt());
//      System.out.print("Input 'y' to continue: ");
//      check = scNumber.next();
    }
    
    public void printData(){
        System.out.println("ID\t\tBookName\tYear of publisher\tPrice\t\tStatus");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(id.get(i)+"\t\t"+names.get(i).name+"\t\t\t"+names.get(i).year+"\t\t"+names.get(i).price+"\t\t"+names.get(i).status+names.get(i).author.name);
        }
    }
    
    public int findByID(int idFind){
        for (int i = 0; i < id.size(); i++) {
            if (id.get(i)==idFind){
                System.out.println("tim thay gia tri co id la: ");
                System.out.println(id.get(i)+"\t\t"+names.get(i).name+"\t\t\t"+names.get(i).year+"\t\t"+names.get(i).price+"\t\t"+names.get(i).status);
                return i;
            }
        } 
        return -1;
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
    
    public void deleteByID(int idDel){
        int pos = findByID(idDel);
        if (pos>=0){
                System.out.println("Đã xóa gia tri co id la "+id.get(pos));
                id.remove(pos);
        }else{
                System.out.println("not found");
        }
    }
    
    public void delete(){
        int idDel;
        boolean checkInput = true;
        do {
            try {
                System.out.println("input id delete");
                idDel = scNumber.nextInt();
                deleteByID(idDel);
            } catch (Exception e) {
                checkInput = false;
                scNumber.nextLine();
            }
        } while (!checkInput);
    }
    
    public void menu(){   
        Book b = new Book();
        System.out.println("");
        System.out.println("1. Input book");
        System.out.println("2. Show book");
        System.out.println("3. Find");
        System.out.println("4. delete");
        int choice;
        boolean checkInput = true;
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
                            id.add(names.size());
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
