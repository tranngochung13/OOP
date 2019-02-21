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
public class BookDetails {
	private int bookNumber;
	private String bookName;
	private float price;
	private int count;

	public BookDetails(int bookNumber,String name,float price)
	{
		this.bookNumber=bookNumber;
		this.bookName=name;
		this.price=price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
