
package com.example.XmlConfiguration.com.example.XmlConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.Book;
import com.example.demo.Library;

@ImportResource({"Book.xml","Library.xml"})

@SpringBootApplication
public class XmlConfigurationApplication {

	public static void main(String[] args) 
	{
		
		Book book1 = new Book("manoj","the mystery");
		Book book2 = new Book("Rahul","the mystery");
		
		List<Book> books = new ArrayList();
		books.add(book1);
		
		books.add(book2);
		List<Book> books2=books.stream().filter(a->a.getName().startsWith("M")).collect(Collectors.toList());
		books2.forEach(System.out::println);
		
		Map<String,Book> map = new HashMap();
		map.put("one", book1);
		map.put("two", book2);
		
		for(Entry<String, Book> entry : map.entrySet()) {
			entry.
		}
		
		
	}

}
