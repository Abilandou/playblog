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
public class Auth extends Model {

	@Id
	public Integer id;

	@Constraints.Required
	@Constraints.Email
	public String email;

	@Constraints.Required
	@Constraints.MinLength(8)
	public String password;
	
	@Inject
	public Auth(String email, String password)
	{
		this.id =id;
		this.email = email;
		this.password = password;
	}

	public static final Finder<Integer, Auth> find
            = new Finder<>(Auth.class);

	//Create an empty Book default contructor
	public Auth(){

	}
//	public String validate() {
//	    if (User.authenticate(email, password) == null) {
//	      return "Invalid user or password";
//	    }
//	    return null;
//	}

}