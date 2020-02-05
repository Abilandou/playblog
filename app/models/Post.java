package models;

import javax.persistence.*;
import java.util.*;

import io.ebean.Finder;
import play.api.Mode;
import io.ebean.Model;
import javax.inject.*;
import play.data.validation.Constraints;

import play.db.ebean.*;

@Entity
public class Post extends Model {

	@Id
	public Integer id;

	@Constraints.MinLength(5)
	@Constraints.MaxLength(100)
	@Constraints.Required
	public String title;

	@Constraints.MinLength(20)
	@Constraints.Required
	public String description;
	//public String author;

	//public String post_image;
	
	@Inject
	public Post(Integer id, String title, String description)
	{
		this.id =id;
		this.title = title;
		this.description = description;
		//this.post_image = post_image;
		//this.author = author;
	}

	public static final Finder<Integer, Post> find
            = new Finder<>(Post.class);

	//Create an empty Book default contructor
	public Post(){

	}
	private static Set<Post> posts;

	static {
		posts = new HashSet<>();
//		books.add(new Book(id:1, title:"C++", price:20, author: "ABC"));
//		books.add(new Book(id:2, title:"Java", price:30, author: "ABCd"));
//		books.add(new Book(id:3, title:"C++", price:50, author: "ABCr"));
	}

	public static Set<Post> allPosts()
	{
		return posts;
	}

	// public static List<Post> all()
	// {

	// 	//return Post.find.orderBy("id").findList();
	// 	return new ArrayList<Post>();
	// }

	public static Post findById(Integer id)
	{
		for(Post post : posts){
			if(id.equals(post.id)){
				return post;
			}
		}
		return null;
	}

	public static void add(Post post)
	{
		//books.add(book);
	}

	// public static boolean remove(Book book)
	// {
	// 	return books.remove(book);
	// }

	public static void delete(Integer id)
	{
		find.ref(id).delete();
	}


}
