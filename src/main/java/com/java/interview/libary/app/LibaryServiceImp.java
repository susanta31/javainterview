package com.java.interview.libary.app;

import java.util.ArrayList;
import java.util.List;

public class LibaryServiceImp implements LibaryService{
	
	private static List<Book> bookList = new ArrayList<Book>();
	
	static {
		bookList.add(new Book(1, "Java", "James Gosling", 1988, true));
		bookList.add(new Book(2, "C++", "James Gosling", 1988, true));
		bookList.add(new Book(3, "Python", "James Gosling", 1988, true));
		bookList.add(new Book(4, "Android", "James Gosling", 1988, true));
	}
	
	@Override
	public List<Book> getAllBooks() {
		return bookList;
	}

	@Override
	public Book findBookById(int id) {
		Book book = bookList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return book;
	}

	@Override
	public int deleteBook(int id) {
		Book book = bookList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (book != null) {
			bookList.remove(book);
			return 1;
		}
		return 0;
	}

	@Override
	public Book addBook(Book book) {
		bookList.add(book);
		return book;
	}

}
