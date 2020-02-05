package controllers;

import play.data.*;
import play.twirl.api.Html;
import play.mvc.*;
import models.Auth;
import models.Post;
import models.User;
import play.mvc.Http;
import java.util.*;
import controllers.PostController;
import play.data.DynamicForm;

import javax.inject.*;

public class AuthController extends Controller 
{

	@Inject 
	FormFactory formFactory;

	public Result login()
	{
		Form<Auth> loginForm = formFactory.form(Auth.class);
		return ok(views.html.login.render(loginForm));
	}

	public Result auth()
	{
		List<Post> posts = Post.find.all();
		Form<Auth> loginForm = formFactory.form(Auth.class);

		@SuppressWarnings("deprecation")
		DynamicForm requestData = formFactory.form().bindFromRequest();
		  String email = requestData.get("email");
		  String password = requestData.get("password");
		  
		List<User> user = User.find.query().where()
	        .like("email",email).like("password", password)
	      .orderBy("id, id desc").findList();
//	      .setMaxRows(50)
//	      .findList();
		System.out.print("User is: "+ user.size());
		if(user.size() < 1) {
			return ok(views.html.login.render(loginForm)).flashing("error", "Invalid Email or Password");
		}else {
			//session().clear();
			//session("email",email);
			return ok(views.html.dashboard.render(posts));
		}
		
		  //System.out.println("Hello " + email + " " + password);
		
		//play.data.DynamicForm data = formFactory.form().bindFromRequest();
		//String email = data.get("email");
		//String password = data.get("password");
		//System.out.println("Email = "+email+"\nPassword = "+password);
		//	return redirect(routes.AuthController.adminDashboard());
		//return ok(views.html.dashboard.render(posts));
		//		Form<Auth> loginForm = formFactory.form(Auth.class).bindFromRequest();
		//		  if (loginForm.hasErrors()) {
		//		        return badRequest(views.html.login.render(loginForm));
		//		    } else {
		//		        session().clear();
		//		        session("email", loginForm.get().email);
		//		        return redirect("/dashboard");
		//		    }
		//List<User> user = User.find.query().where()
//		        .like("email","godloveabilandou@gmail.com")
//		      .orderBy("id, id desc")
//		      .setMaxRows(50)
//		      .findList();
		
	
	}
	
	
	public Result adminDashboard()
	{
		//Form<Auth> loginForm = formFactory.form(Auth.class);
		List<Post> posts = Post.find.all();
		//if(this.auth()) {
			return ok(views.html.dashboard.render(posts));
		//}else {
			//return badRequest(views.html.login.render(loginForm));
		//}
		  
	}

	public Result register()
	{
		Form<User> registerForm = formFactory.form((User.class));
		return ok(views.html.register.render(registerForm));
	}
	public Result validateRegistration()
	{
		@SuppressWarnings("deprecation")
		Form<User> registerForm = formFactory.form(User.class).bindFromRequest();

		if((registerForm.hasErrors())){
			return badRequest(views.html.register.render(registerForm));
		}

		User user = registerForm.get();
		System.out.print("User information is: "+registerForm.rawData());
		user.save();
		//return redirect(routes.AuthController.adminDashboard()) ;
		return redirect(routes.PostController.adminDashboard()) ;
	}
}