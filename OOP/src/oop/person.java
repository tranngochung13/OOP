/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author hung.tran
 */
public abstract class person {
    protected String name;
    protected char gender;
    protected String email;
    protected int phone;
    protected String address;
    
    public person(){
        
    }
    
    public person(String name, char gender, String email, int phone, String address){
        name = this.name;
        gender = this.gender;
        email = this.email;
        phone = this.phone;
        address = this.address;
    }
}
