package com.library.model;

public class Book {
	private int id;
	private String title;
	private int authorId;

	public Book() {
		super();
	}

	public Book(int id, String title, int authorId) {
		super();
		this.id = id;
		this.title = title;
		this.authorId = authorId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return title;
	}

	public void setName(String name) {
		this.title = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authorId=" + authorId + "]";
	}

}
