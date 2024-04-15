package com.java.interview.libary.app;

import java.util.List;

public interface LibaryService {
	
	public List<Book> getAllBooks();
	public Book findBookById(int id);
	public int deleteBook(int id);
	public Book addBook(Book book);

}
