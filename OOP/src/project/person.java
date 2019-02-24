/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class person {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    ArrayList<Integer> id = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> gender = new ArrayList<>();
    ArrayList<String> email = new ArrayList<>();
    ArrayList<Integer> phone = new ArrayList<>();
    ArrayList<String> address = new ArrayList<>();
    
    public abstract void inputInfo();
    public abstract void printInfo();
}