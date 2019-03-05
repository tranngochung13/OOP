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
public class Author extends person {
    ArrayList<person> names = new ArrayList<>();
    
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender ){
        this.gender = gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    public void setAddress(String address){
        this.address = address;
    }
    // get
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }

    public String getEmail() {
        return email;
    }
    public int getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
    
    public void inputInfo(Author a){
        System.out.print("Name: ");
        a.name = scWord.nextLine();
        System.out.print("Gender: ");
        a.gender = scWord.nextLine();
        System.out.print("Email: ");
        a.email = scWord.nextLine();
        System.out.print("Phone: ");
        a.phone = scNumber.nextInt();
        System.out.print("Address: ");
        a.address = scWord.nextLine();
    }
    @Override
    public void printInfo(){
        System.out.println("ID\tAuthorName\tGender\tEmail\t\tPhone\t\tAddress");
        for (int i = 0; i < id.size(); i++) {
            System.out.println(id.get(i)+"\t"+names.get(i).name+"\t\t"+names.get(i).gender+"\t"+names.get(i).email+"\t\t"+names.get(i).phone+"\t\t"+names.get(i).address);
        }
    }
    
    public Author update(Author obj) {
       System.out.println("\t\t\tInfor Employee \n\n");
       System.out.println("Old:" + obj.name + "Enter Full Name : ");
       String name = scWord.nextLine();
       setName(name);
       obj.name = getName();
       
       System.out.println("Old:" + obj.email + " => Enter Email : ");
       String email = scWord.nextLine();
       setEmail(email);
       obj.email = getEmail();

       System.out.println("Old:" + obj.phone + " => Enter Phone number: ");
       int phone = scNumber.nextInt();
       setPhone(phone);
       obj.phone = getPhone();

       System.out.println("Old:" + obj.address + " => Enter Address:");
       String add = scWord.nextLine();
       setAddress(add);
       obj.address = getAddress();

       return obj;
   }
    
    public int findByID(int ID){
        for (int i = 0; i < id.size(); i++) {
            if (id.get(i)==ID){
                System.out.print("tim thay gia tri co id la: ");
                System.out.println(id.get(i)+"\t"+names.get(i).name+"\t\t"+names.get(i).gender+"\t"+names.get(i).email+"\t\t"+names.get(i).phone+"\t\t"+names.get(i).address);
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
        Author a = new Author(); 
        
        
        
        System.out.println("");
        System.out.println("1. Type information Author");
        System.out.println("2. Show Author");
        System.out.println("3. Find Author");
        System.out.println("4. delete Author");
        System.out.println("5. Update");
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.print("Please choice: ");
            choice = sc.nextInt();
        }while(choice < 1 || choice > 5);
        System.out.println("");
        switch(choice){
        case 1: 
            inputInfo(a); 
            names.add(a);
            id.add(names.size());
            break;
        case 2: 
            printInfo(); 
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
        case 5:
            System.out.println("Enter ID u want update: ");
            int  idd = scNumber.nextInt();
            update((Author) names.get(idd - 1));
            System.out.println(names.get(idd - 1));
            break;
        }		
    }
    public static void main(String[] args) {
        Author a = new Author();
        a.menu();
    }
}
