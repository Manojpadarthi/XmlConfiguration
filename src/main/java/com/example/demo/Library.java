package com.example.demo;

import java.util.List;
import java.util.Map;

public class Library {

	private List<String> names;
	
	private Map<String,String> keyValue;
	
	private Book book;
	
	
	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public Map<String, String> getKeyValue() {
		return keyValue;
	}


	public void setKeyValue(Map<String, String> keyValue) {
		this.keyValue = keyValue;
	}


	public List<String> getNames() {
		return names;
	}


	public void setNames(List<String> names) {
		this.names = names;
	}


	public Library() {
		
	}

	
	
}
