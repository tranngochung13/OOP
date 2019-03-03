/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Administrator
 */
public class onlyInputNumber {

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
    public static void main(String[] args) {
        boolean check = checkNumber("12");
        System.out.println(check);
    }
}
