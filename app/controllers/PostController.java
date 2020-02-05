package controllers;
import play.data.*;
import play.mvc.*;
import models.Post;
import java.util.*;
import play.libs.Files.TemporaryFile;
import java.nio.file.Paths;
import play.mvc.Http;


import javax.inject.*;

public class PostController extends Controller 
{
	@Inject
	FormFactory formFactory;
	
	
	public Result index()
	{
		return ok(views.html.index.render());
	}

	public Result create()
	{
		Form<Post> postForm = formFactory.form(Post.class);
		return ok(views.html.create.render(postForm));
	}

	public Result store(Http.Request request)
	{
		@SuppressWarnings("deprecation")
		Form<Post> postForm = formFactory.form(Post.class).bindFromRequest();

		// Http.MultipartFormData<TemporaryFile> body = request.body().asMultipartFormData();
		// Http.MultipartFormData.FilePart<TemporaryFile> post_image = body.getFile("post_image");
		if((postForm.hasErrors())){
			return badRequest(views.html.create.render(postForm));
		}
		// String fileName = post_image.getFilename();
		// String fileSize = post_image.getContentType();
		// TemporaryFile file = post_image.getRef();
		// file.copyTo(Paths.get("public/images/posts"), true);

		Post post = postForm.get();
		System.out.print("Posts information is: "+postForm.rawData());
		post.save();
		return redirect(routes.PostController.adminDashboard()) ;
		//return ok("File Uploaded");
		
	}

	public Result edit(Integer id)
	{
		Post post = Post.find.byId(id);
		if(post==null){
			return notFound("Sorry Item you are looking for is not found");
		}
		Form<Post> postForm = formFactory.form(Post.class).fill(post);
		return ok(views.html.edit.render(postForm, post));
	}

	public Result update(Integer id)
	{
		//@SuppressWarnings("deprecation")
		//Form<Post> postt = formFactory.form(Post.class).bindFromRequest();
		//Post post = postt.get();
		//system.out.print("The post information is: "+post);
		Post post = Post.find.byId(id);
		Post oldPost = Post.find.byId(post.id);

		if(oldPost == null)
		{
			return notFound("Sorry Item you are looking for is not found");
		}
		oldPost.title = post.title;
		oldPost.description = post.description;
		return redirect(routes.PostController.adminDashboard());
	}

	public Result lists()
	{
		//List<Post> posts = find.orderBy("id dsc").findList();
		List<Post> posts = Post.find.all();
		return ok(views.html.posts.render(posts));
	}

	public Result destroy(Integer id)
	{
		Post.delete(id);
		return redirect(routes.PostController.adminDashboard());
	}

	public Result adminDashboard()
	{
		List<Post> posts = Post.find.all();
		return ok(views.html.dashboard.render(posts));
	}

	public Result show(Integer id)
	{
		Post post = Post.find.byId(id);
		return ok(views.html.show.render(post));
	}

	public Result singlePost(Integer id)
	{
		Post post = Post.find.byId(id);
		return ok(views.html.singlePost.render(post));
	}

}