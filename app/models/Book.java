package models;

import javax.persistence.*;
import java.util.*;

import play.api.Mode;
import io.ebean.Model;
import javax.inject.*;

@Entity
public class Book extends Model {

	@Id
	public Integer id;
	
	public String title;
	public Integer price;
	public String author;
	
	@Inject
	public Book(Integer id, String title, Integer price, String author)
	{
		this.id =id;
		this.title = title;
		this.price = price;
		this.author = author;
	}

	//Create an empty Book default contructor
	public Book(){

	}
	private static Set<Book> books;

	static {
		books = new HashSet<>();
//		books.add(new Book(id:1, title:"C++", price:20, author: "ABC"));
//		books.add(new Book(id:2, title:"Java", price:30, author: "ABCd"));
//		books.add(new Book(id:3, title:"C++", price:50, author: "ABCr"));
	}

	public static Set<Book> allBooks()
	{
		return books;
	}

	public static Book findById(Integer id)
	{
		for(Book book : books){
			if(id.equals(book.id)){
				return book;
			}
		}
		return null;
	}

	public static void add(Book book)
	{
		//books.add(book);
	}

	// public static boolean remove(Book book)
	// {
	// 	return books.remove(book);
	// }

}
