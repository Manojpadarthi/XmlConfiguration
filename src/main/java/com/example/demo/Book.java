package com.example.demo;



public class Book {
	
	
	
	private String name;
	private String author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String authour) {
		this.author = authour;
	}
	public Book() {
	
	}
	public Book(String string, String string2) {
		name=string;
		author=string2;
	}
	

}
