/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.library;

/**
 *
 * @author hung.tran
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LMSImpl {

	static List<BookDetails> books = new ArrayList<BookDetails>();
	static Map<Integer, ArrayList<BookIssueDetails>> hm = new HashMap<Integer, ArrayList<BookIssueDetails>>();

	public static void main(String[] args) {
		addIssueDetails();
		System.out.println("Library Management System");
		System.out.println("Press 1 to add Book");
		System.out.println("Press 2 to issue a book");
		System.out.println("Press 3 to return a book");
		System.out.println("Press 4 to print the book details");
		System.out.println("Press 5 to print complete issue detais");
		System.out.println("Press 6 to exit");
		Scanner c = new Scanner(System.in);
		int choice = c.nextInt();
		do {
			switch (choice) {
			case 1:
				addBook();
				break;
			case 2:
				issueBook();
				break;
			case 3:
				returnBook();
				break;
			case 4:
				printBookDetails();
				break;
			case 5:
				printCompleteIssueDetails();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid input");
				break;
			}
			c = new Scanner(System.in);
			choice = c.nextInt();
		} while (choice > 0 && choice < 6);
	}

	private static void printCompleteIssueDetails() {
		for (Map.Entry<Integer, ArrayList<BookIssueDetails>> entry : hm
				.entrySet()) {

			for (BookIssueDetails b : entry.getValue()) {
				System.out.println(entry.getKey() + "  " + b.getBookNumber()
						+ "  " + b.getName() + "  " + b.getNoOfBookIssued()
						+ "  " + b.getIssueDate() + "  " + b.getReturnDate());
			}
		}
	}

	private static void printBookDetails() {
		for (BookDetails b : books) {
			System.out.print(b.getBookNumber() + "  " + b.getBookName() + "  " + b.getPrice() + "\n");
		}
	}

	private static void returnBook() {
		System.out.println("Enter studentId & bookId");
		Scanner c = new Scanner(System.in);
		int id = c.nextInt();
		int bookId = c.nextInt();
		List<BookIssueDetails> bd = hm.get(id);
		for (BookIssueDetails b : bd) {
			if (b.getBookNumber() == bookId) {
				Date issueDate = b.getIssueDate();
				Date todayDate = new Date();

				long diff = todayDate.getTime() - issueDate.getTime();

				long diffDays = diff / (24 * 60 * 60 * 1000);

				if (diffDays > 10) {
					int fine = (int) (diffDays - 10);
					fine = fine * 10 - 1;
					System.out.println("Total Fine " + fine + " Rs.");
				}
			}
		}

	}

	private static void addIssueDetails() {
		BookIssueDetails bd1 = new BookIssueDetails(1,"abc",1,new Date("04/04/2015"));
		BookIssueDetails bd2 = new BookIssueDetails(2,"xyz",1,new Date("02/09/2019"));
		BookIssueDetails bd3 = new BookIssueDetails(3,"mn",1,new Date());
		BookIssueDetails bd4 = new BookIssueDetails(4,"u",1,new Date());
		ArrayList<BookIssueDetails> list1 = new ArrayList<BookIssueDetails>();
		ArrayList<BookIssueDetails> list2 = new ArrayList<BookIssueDetails>();
		ArrayList<BookIssueDetails> list3 = new ArrayList<BookIssueDetails>();
		ArrayList<BookIssueDetails> list4 = new ArrayList<BookIssueDetails>();
		
		list1.add(bd1);
		list2.add(bd2);
		list3.add(bd3);
		list4.add(bd4);
		hm.put(100, list1);
		hm.put(101, list2);
		hm.put(103, list3);
		hm.put(104, list4);
		
	}

	private static void issueBook() {
		System.out.println("Enter Student Id,Booknumber, name and price");
		Scanner c = new Scanner(System.in);
		int studentId = c.nextInt();
		Scanner c1 = new Scanner(System.in);
		int bookNumber = c1.nextInt();
		Scanner c2 = new Scanner(System.in);
		String name = c2.nextLine();
		Scanner c3 = new Scanner(System.in);
		String issueDate = c3.nextLine();
		BookIssueDetails newIssuedBook = new BookIssueDetails();
		newIssuedBook.setName(name);
		newIssuedBook.setBookNumer(bookNumber);
		
		ArrayList<BookIssueDetails> l=new ArrayList<BookIssueDetails>();
		

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

		try {

			Date date = formatter.parse(issueDate);
			newIssuedBook.setIssueDate(date);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		
		List<BookIssueDetails> list = hm.get(studentId);
		for (BookIssueDetails b : list) {
			int value = b.getNoOfBookIssued();
			newIssuedBook.setNoOfBookIssued(++value);
			l.add(newIssuedBook);
			if (value > 2)
				System.out.println("You already issued max(2) books");
			else
				hm.put(studentId, l);
		}
	}

	private static void addBook() {
            String name;
		System.out.println("Enter Booknumber, name and price");
		Scanner c = new Scanner(System.in);
                System.out.print("Enter Name: ");
		name = c.nextLine();
                System.out.print("Enter Book Number: ");
		int bookNumber = c.nextInt();
                System.out.print("Enter Price: ");
		float price = c.nextFloat();

		BookDetails book = new BookDetails(bookNumber, name, price);
		books.add(book);

	}

}

