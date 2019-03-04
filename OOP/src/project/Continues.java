/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

public class Continues extends Main {
    private int number;
    
    public Continues(){
        
    }
    
    public Continues(int number){
        this.number = number;
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t\t\t\tDo you want to continues? ");
        System.out.println("\t\t\t\t1.  Continues main function");
	System.out.println("\t\t\t\t2.  Exit");
        do{
            System.out.print("\t\t\t\tEnter number: ");
            number = scanner.nextInt();
        }while(number < 1|| number > 2);
    }
    
    public void handlingInput(){				
	switch(number)
        {
            case 1:	
            {
                menu();
            }
            case 2:
            {
    		System.out.println("\n\n\t\t\t\t\tThanks you for use program!");
		System.exit(0);
            }
        }
    }
}