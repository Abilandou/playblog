package models;

import javax.persistence.*;
import java.util.*;

import io.ebean.Finder;
import play.api.Mode;
import io.ebean.Model;
import javax.inject.*;
import play.data.validation.Constraints;

import org.mindrot.jbcrypt.BCrypt;

import play.db.ebean.*;


@Entity
public class User extends Model {

	@Id
	public Integer id;
	public Integer admin;

	@Constraints.Required
	@Constraints.MinLength(3)
	public String name;

	@Constraints.Required
	@Constraints.Email
	public String email;

	@Constraints.Required
	@Constraints.MinLength(8)
	public String password;


	@Inject
	public User(String name, String email, Integer admin,  String password)
	{
		this.admin = admin;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public User(){

	}

	public static final Finder<Integer, User> find = new Finder<>(User.class);

	// public User create(String name, String email, String password){
	// 	User user = new User();
	// 	user.name = name;
	// 	user.email = email;
	// 	user.password = BCrypt.hashpw(password,BCrypt.gensalt());
	// 	user.save();
	// 	return user;
	// }

//	 public static User authenticate(String  email, String password){
//	 	User user =User.q().filter("email", email).asList().get(0);
//	 	if(user != null && (user.password.equals(password))){
//	 		return user;
//	 	}else{
//	 		return null;
//	 	}
//	 }

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public String getPassword()
	{
		return password;
	}

	public Integer getAdmin()
	{
		return admin;
	}


}