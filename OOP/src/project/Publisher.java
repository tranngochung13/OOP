/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thiet Bi So
 */
class Publisher {
    Scanner scNumber = new Scanner(System.in);
    Scanner scWord = new Scanner(System.in);
    ArrayList<Integer> id = new ArrayList<>();
    ArrayList<Publisher> names = new ArrayList<>();
    public String name;
    public int phone;
    public String address;
    public void setName(String names){
        
    }
    public Publisher getName(){
        for (int i = 0; i < names.size(); i++) {
            return names.get(i);
        }
        return null;
    }
    public void display(){
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
    
    public void inputInfo(){
        Publisher p = new Publisher();
        String check = ("y");
        do {
            System.out.print("Name: ");
            p.name = scWord.nextLine();
            System.out.print("Phone: ");
            p.phone = scNumber.nextInt();
            System.out.print("Address: ");
            p.address = scWord.nextLine();
            names.add(p);
            id.add(names.size());
            System.out.print("Input 'y' to continue: ");
            check = scWord.next();
        } while(check.equalsIgnoreCase("y"));
    }
    
    public void printInfo(){
        System.out.println("ID\t\tAuthorName\t\tPhone\t\tAddress");
        for (int i = 0; i < id.size(); i++) {
            System.out.println(id.get(i)+"\t\t"+names.get(i).name+"\t\t\t"+names.get(i).phone+"\t"+names.get(i).address);
        }
    }
    public int findByID(int ID){
        for (int i = 0; i < id.size(); i++) {
            if (id.get(i)==ID){
                System.out.print("tim thay gia tri co id la: ");
                System.out.print(id.get(i)+", NamePublisher: "+names.get(i).name+", Phone: "+names.get(i).phone+", Address: "+names.get(i).address+"\n");
                return i;
            }
        } 
        return -1;
    }
    public void deleteByID(int ID){
        int pos = findByID(ID);
        if (pos>=0){
                System.out.println("Đã xóa gia tri co id la "+id.get(pos));
                id.remove(pos);
        }else{
                System.out.println("not found");
        }
    }
    public void find(){
        System.out.println("input id find");
        int idFind = scNumber.nextInt();
        findByID(idFind); 
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
        System.out.println("");
        System.out.println("1. Type information Publisher");
        System.out.println("2. Show Publisher");
        System.out.println("3. Find Publisher");
        System.out.println("4. Delete Publisher");
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("Please choice: ");
        choice = sc.nextInt();
        System.out.println("");
        switch(choice){
        case 1: 
            inputInfo(); 
            menu();
        case 2: 
            printInfo(); 
            menu();
        case 3: 
            find();
            menu();
        case 4: 
            delete();
            menu();
        default: 
            System.out.print("Please choice from 1 - 4: ");
            choice = sc.nextInt();
        }		
    }
}
