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
    @Override
    public void inputInfo(){
        String check = ("y");
        do {
            System.out.print("Name: ");
            name.add(sc1.nextLine());
            System.out.print("Gender: ");
            gender.add(sc.nextLine());
            System.out.print("Email: ");
            email.add(sc.nextLine());
            System.out.print("Phone: ");
            phone.add(sc1.nextInt());
            System.out.print("Address: ");
            address.add(sc.nextLine());
            id.add(name.size());
            System.out.print("Input 'y' to continue: ");
            check = sc.next();
        } while(check.equalsIgnoreCase("y"));
    }
    @Override
    public void printInfo(){
        for (int i = 0; i < id.size(); i++) {
            System.out.println("ID\t\tAuthorName\tGender\tEmail\t\tPhone\t\tAddress");
            System.out.println(id.get(i)+"\t\t"+name.get(i)+"\t\t\t"+gender.get(i)+"\t\t"+email.get(i)+"\t"+phone.get(i)+"\t"+address.get(i)+"\n");
        }
    }
    public static void main(String[] args) {
        Author a = new Author();
        a.inputInfo();
        a.printInfo();
    }
}
