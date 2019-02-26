/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.util.Scanner;

/**
 *
 * @author co.ho
 */
class Publisher {
    public String name;
    public String address;
    public int phone;
    
    //   Construct mac dinh 
    public Publisher(){}
    
    //   Construct
    public Publisher(String name, String address, int phone){
        this.name =name;
        this.address = address;
        this.phone = phone;
    }
    // ham set   
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    // ham get
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getPhone(){
        return phone;
    }
    
    public String toString(){
        return "Name: "+ name + "\n" + "Address:"+ address + "\n" + "Phone: "+phone;
    }
   
    public static void main(String[] args) {
        //   Khoi tao 3 doi tuong     
        Publisher m1,m2,m3;
        
        // Lenh de nhap gia tri tu ban phim        
        Scanner input= new Scanner(System.in);
        
        //   Khoi tao bien phai theo thu tu cua cac thuoc tinh trong constructor    
        
        
        //  Khai bao bien n (name) co kieu la String    
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();
        
        //  Khai bao bien a (address) co kieu la String   
        String address1 = input.nextLine();
        String address2 = input.nextLine();
        String address3 = input.nextLine();
        
        //  Khai bao bien p (phone) co kieu la int      
        int phone1 = input.nextInt();
        int phone2 = input.nextInt();
        int phone3 = input.nextInt();
        
        //  Cac gia tri cua m1     
        m1 = new Publisher(name1,address1,phone1);
        m2 = new Publisher(name2,address2,phone2);
        m3 = new Publisher(name3,address3,phone3);
        
         //  Hien thicac gia tri cua m1 len man hinh   
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        
         //  Khai bao bien d co kieu la String (bien dung de sua)     
//        String d = input.nextLine();
        
         // Dat bien d vao doi duong m1, dat vao thuoc tinh Address     
//        m1.setAddress(d);
        
         //  Hien thi ket qua cua doi tuong m1    
        System.out.println(m1);
        
        
        // thu tu nhap se la: name, name, name
        //                    address,  address, address,
        //                    phone, phone, phone

        
    }
    
}
