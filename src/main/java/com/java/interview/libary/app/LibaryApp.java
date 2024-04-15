package com.java.interview.libary.app;

public class LibaryApp {
	
	//Problem Statement:
	//Write a Java program to implement a simple library system. 
	//The library should have books with attributes such as title, 
	//author, publication year, and availability status. Users 
	//should be able to borrow and return books.

	public static void main(String[] arg) {
		
		// LibaryService
		LibaryService libaryService = new LibaryServiceImp();
		System.out.println("Find Book List : " + libaryService.getAllBooks());
		
		System.out.println("Delete Book : " + libaryService.deleteBook(1));
		System.out.println("Add Book : " + libaryService.addBook(new Book(5, "To Kill a Mockingbird", "Harper Lee", 2024, true)));
		
		System.out.println("Find Latest Book List : " + libaryService.getAllBooks());
		
	}
}
