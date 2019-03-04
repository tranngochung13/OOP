/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;
import oop.library.input;

/**
 *
 * @author Administrator
 */
public class onlyInputNumber {
Scanner scNumber = new Scanner(System.in);
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
 void input(){
     String a;
        System.out.println("Nhập a: ");
        a = scNumber.nextLine();
        boolean check = checkNumber(a);
        System.out.println(check);
 }
    public static void main(String[] args) {
        onlyInputNumber o = new onlyInputNumber();
        o.input();
    }
}
