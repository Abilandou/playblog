package models;

import javax.persistence.*;
import java.util.*;

import play.api.Mode;
import io.ebean.Model;
import javax.inject.*;


@Entity
public class Contact extends Model
{
	public String username;

	public String useremail;

	public String usermessage;

	//create a default empty contrustor
	public Contact()
	{

	}

	public Contact(String username, String useremail, String usermessage)
	{
		this.username = username;
		this.useremail = useremail;
		this.usermessage = usermessage;
	}

	public static List<Contact> all()
	{
		return new ArrayList<Contact>();
	}

}