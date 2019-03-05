/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Author extends Person {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> obj = new ArrayList<String>();

    public Author() {
    }

    public Author(String name, String gender, String email, String phone, String address) {
        super(name, gender, email, phone, address);
    }

    public void nhap() {
        System.out.println("Enter a: ");
        String a = scanner.nextLine();
        obj.add(a);
        System.out.println("Ket qua: " + obj);

        System.out.println("Xoa: ");
        String b = scanner.nextLine();
        obj.remove(b);
        System.out.println("Ket qua: " + obj);

        System.out.println("Update: ");
        String c = scanner.nextLine();
        obj.set(obj.size() - 1, c);
        System.out.println("Ket qua: " + obj);
        
        System.out.println("Them ptu ms");
        tieptuc();

    }

    public void hienthi() {
//        obj.add("Ajeet");
//        obj.add("Harry");
//        obj.add("Chaitanya");
//        obj.add("Steve");
//        obj.add("Anuj");
//        obj.add("Leminho");
//        obj.add("Ledekim");
        /*hiển thị các danh sách  các phần tử của mảng */
        System.out.println("Add new Author:" + obj);

        //   Them phan tu Bale tai phan tu thu 2
        // => Luc nay phan tu Chaitanya se la phan tu thu 3
//        obj.add(2, "Bale");
        // xóa phần tử trong arraylist co ten la Leminho, phai trung ten
//        obj.remove("Leminho");
        System.out.println("Update Author:" + obj);

        // xóa phần tử thu 3 trong arraylist
//        obj.remove(3);
        System.out.println("Delete Author:" + obj);
    }

    public void tieptuc() {
        System.out.println("Continute? 1. Yes\t2.No ");
        int b = scanner.nextInt();
        if (b == 1) {
            nhap();
        } else {
            hienthi();
        }
    }

    public static void main(String args[]) {
        /*
             Tạo object arraylist có kiểu dữ liệu đối tượng là String
         */

        //đây là cách arraylist thêm các phần thử vào mảng
        //Them phan tu moi bang lenh obj.add("String");
        //System.out.println("Continute? 1. Yes\t2.No ");     
        Author a = new Author();
        a.nhap();
        
    }

}
