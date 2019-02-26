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
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    ArrayList<Integer> id = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> phone = new ArrayList<>();
    ArrayList<String> address = new ArrayList<>();
    public void setName(String names){
        name.add(sc.nextLine());
    }
    public String getName(){
        for (int i = 0; i < name.size(); i++) {
            return name.get(i);
        }
        return null;
    }
    public void display(){
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
    }
    
    public void inputInfo(){
        String check = ("y");
        do {
            System.out.print("Name: ");
            name.add(sc.nextLine());
            System.out.print("Phone: ");
            phone.add(sc1.nextInt());
            System.out.print("Address: ");
            address.add(sc2.nextLine());
            id.add(name.size());
            System.out.print("Input 'y' to continue: ");
            check = sc3.next();
        } while(check.equalsIgnoreCase("y"));
    }
    
    public void printInfo(){
        System.out.println("ID\t\tAuthorName\t\tPhone\t\tAddress");
        for (int i = 0; i < id.size(); i++) {
            System.out.println(id.get(i)+"\t\t"+name.get(i)+"\t\t\t"+phone.get(i)+"\t"+address.get(i));
        }
    }
    public int findByID(int ID){
        for (int i = 0; i < id.size(); i++) {
            if (id.get(i)==ID){
                System.out.print("tim thay gia tri co id la: ");
                System.out.print(id.get(i)+", NamePublisher: "+name.get(i)+", Phone: "+phone.get(i)+", Address: "+address.get(i)+"\n");
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
        int idFind = sc.nextInt();
        findByID(idFind); 
        int find = findByID(idFind); 
        if (find<0){
            System.out.println("not found");
        }else
            System.out.println("found pos "+find);
    }
    public void delete(){
        System.out.println("input id delete");
        int idDel = sc.nextInt();
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
