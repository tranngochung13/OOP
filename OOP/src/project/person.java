/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class person {
    Scanner scNumber = new Scanner(System.in);
    Scanner scWord = new Scanner(System.in);
    ArrayList<Integer> id = new ArrayList<>();
    protected String name;
    protected String gender;
    protected String email;
    protected int phone;
    protected String address;
    
    public abstract void printInfo();
}