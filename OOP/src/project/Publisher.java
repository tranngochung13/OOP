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
    public static void main(String[] args) {
        Publisher a = new Publisher();
        a.setName("HUng");
        a.getName();
        a.display();
    }
}
