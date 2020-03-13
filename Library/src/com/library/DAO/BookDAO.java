package com.library.DAO;

import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;

public class BookDAO {
	private static BookDAO instance = null;
	private List<Book> books;
	
	private BookDAO() {
		books = new ArrayList<Book>();
	}
	
	public static BookDAO getInstance() {
		if(instance == null)
			instance = new BookDAO();
		return instance;
	}
	
	public List<Book> getBooks(){
		return books;
	}
}
