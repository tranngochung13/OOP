/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.library;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// sử dụng nextLine() => trả về kết quả một chuỗi
		System.out.println("Nhập vào họ và tên  : ");
		String name = input.nextLine();
		System.out.println("Họ tên bạn vừa nhập vào sử dụng method nextLine : "+name);
		// sử dụng next() =>
		//Trả về kết quả nội dung trước khoảng trắng
		System.out.println("Nhập vào họ và tên  : ");
		String fullname2 = input.next();
		System.out.println();
		System.out.println("Họ tên bạn vừa nhập vào sử dụng method next : "+fullname2);
	}
}
