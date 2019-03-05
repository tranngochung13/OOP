/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author hung.tran
 */
public class testWord {
    public boolean checkText(String str) {// chi cho nhap chu
       if (str == null || str.isEmpty()) {
           return true;
       }
       for (int i = 0; i < str.length(); i++) {
           if (Character.isDigit(str.charAt(i)) ) {
               return false;
           }
       }
       return true;      
   }
    public static void main(String[] args) {
        testWord t = new testWord();
        Scanner s = new Scanner(System.in);
        boolean checkInput = false;
        do{
            System.out.print("Nhập fullname: ");
            String name = s.nextLine();
            checkInput = t.checkText(name);
        }while(!checkInput);
        
    }
}
