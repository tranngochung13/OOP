/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tests {
    public static void main (String[ ] args){
	boolean checkInput = true; // biến này để kiểm tra user nhập hợp lệ hay không
        int id = 0;
        Scanner sc = new Scanner(System.in); // Khởi tạo luồng nhập từ bàn phím
        do {
            try {
                System.out.print("Hay nhap ID: ");
                id = sc.nextInt(); // Ở bước này nếu user nhập chữ thì sẽ gây ra ngọai lệ,luồng thực thi chương trình
                                    // sẽ nhảy vào khối catch ở dưới
                checkInput = true;
                switch(id){
                    case 1: 
                        System.out.println("da "+id);
                        break;
                    case 2: 
                        System.out.println("la "+id);
                        break;
                    case 3: 
                        System.out.println("so "+id);
                        break;
                    case 4: 
                        System.out.println("nhap "+id);
                        break;
                }
            } catch (Exception e) {
                checkInput = false;
                sc.nextLine(); // Dòng này để đọc ký tự Enter lúc nhập, thực ra Enter sẽ gồm 2 ký tự trở về đầu dòng và
                                // sinh dòng mới, bạn tra bảng mã Ascii sẽ rõ.
            }
            
        } while (!checkInput);
        System.out.println("ID là: " + id);
    }
}
