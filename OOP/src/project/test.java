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
public class test {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    ArrayList<Integer> ls = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Author> author = new ArrayList<>();
    ArrayList<Integer> yearOfPublisher = new ArrayList<>();
    ArrayList<Float> price = new ArrayList<>();
    ArrayList<String> status = new ArrayList<>();
    ArrayList<Publisher> publisher = new ArrayList<>();
    public void inputData(){
	String check = ("y");
	do {
            System.out.print("Name: ");
            name.add(sc1.nextLine());
//          System.out.print("input author: ");
//          ls.add(sc.nextInt());
            System.out.print("Year of publisher: ");
            yearOfPublisher.add(sc.nextInt());
            System.out.print("Price: ");
            price.add(sc.nextFloat());
            System.out.print("Status: ");
            status.add(sc1.nextLine());
//          System.out.print("input publisher: ");
//          ls.add(sc.nextInt());
            ls.add(price.size());
            System.out.print("Type 'y' to continue: ");
            check = sc.next();
	} while(check.equalsIgnoreCase("y"));
    }
    public void printData(){
	for (int i = 0; i < ls.size(); i++) {
            System.out.println("ID\t\tBookName\tYear of publisher\tPrice\t\tStatus");
            System.out.println(ls.get(i)+"\t\t"+name.get(i)+"\t\t\t"+yearOfPublisher.get(i)+"\t\t"+price.get(i)+"\t"+status.get(i)+"\n");
        }
    }
    public int findByID(int id){
	for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i)==id){
		System.out.println("tim thay gia tri phan tu "+ls.get(i));
                System.out.println("=>"+name.get(i));
                System.out.println("=>"+yearOfPublisher.get(i));
                System.out.println("=>"+price.get(i));
                System.out.println("=>"+status.get(i));
                return i;
            }
	} 
        return -1;
    }
    public void deleteByID(int id){
	int pos = findByID(id);
	if (pos>=0){
            System.out.println("Đã xóa gia tri phan tu "+ls.get(pos));
            ls.remove(pos);
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
	System.out.println("1. Input book");
	System.out.println("2. Show book");
	System.out.println("3. Find");
	System.out.println("4. delete");
	Scanner sc = new Scanner(System.in);
	System.out.print("Please choice: ");
	int choice = sc.nextInt();
        System.out.println("");
	switch(choice){
            case 1: 
                inputData(); 
                menu();
            case 2: 
                printData(); 
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
    public static void main(String[] args) {
        test t = new test();
        t.menu();
    }
}
