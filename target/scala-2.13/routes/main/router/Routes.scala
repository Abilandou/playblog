// @GENERATOR:play-routes-compiler
// @SOURCE:/home/computer/Desktop/Play/blog/conf/routes
// @DATE:Tue Dec 24 14:03:48 WAT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_5: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_4: controllers.AsyncController,
  // @LINE:14
  Assets_3: controllers.Assets,
  // @LINE:17
  PostController_0: controllers.PostController,
  // @LINE:35
  AuthController_2: controllers.AuthController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_5: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_4: controllers.AsyncController,
    // @LINE:14
    Assets_3: controllers.Assets,
    // @LINE:17
    PostController_0: controllers.PostController,
    // @LINE:35
    AuthController_2: controllers.AuthController
  ) = this(errorHandler, HomeController_5, CountController_1, AsyncController_4, Assets_3, PostController_0, AuthController_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, CountController_1, AsyncController_4, Assets_3, PostController_0, AuthController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.PostController.adminDashboard()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts""", """controllers.PostController.lists()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/create""", """controllers.PostController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/""" + "$" + """id<[^/]+>""", """controllers.PostController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/edit/""" + "$" + """id<[^/]+>""", """controllers.PostController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/edit""", """controllers.PostController.update(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/create""", """controllers.PostController.store(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/delete/""" + "$" + """id<[^/]+>""", """controllers.PostController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post/""" + "$" + """id<[^/]+>""", """controllers.PostController.singlePost(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthController.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login-user""", """controllers.AuthController.auth()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.AuthController.register()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user-register""", """controllers.AuthController.validateRegistration()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_5.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_4.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PostController_adminDashboard4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_PostController_adminDashboard4_invoker = createInvoker(
    PostController_0.adminDashboard(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "adminDashboard",
      Nil,
      "GET",
      this.prefix + """dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_PostController_lists5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts")))
  )
  private[this] lazy val controllers_PostController_lists5_invoker = createInvoker(
    PostController_0.lists(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "lists",
      Nil,
      "GET",
      this.prefix + """posts""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_PostController_create6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/create")))
  )
  private[this] lazy val controllers_PostController_create6_invoker = createInvoker(
    PostController_0.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "create",
      Nil,
      "GET",
      this.prefix + """posts/create""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_PostController_show7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_show7_invoker = createInvoker(
    PostController_0.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """posts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_PostController_edit8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_edit8_invoker = createInvoker(
    PostController_0.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """posts/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_PostController_update9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/edit")))
  )
  private[this] lazy val controllers_PostController_update9_invoker = createInvoker(
    PostController_0.update(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "update",
      Seq(classOf[Integer]),
      "POST",
      this.prefix + """posts/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_PostController_store10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/create")))
  )
  private[this] lazy val controllers_PostController_store10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PostController_0.store(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "store",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """posts/create""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_PostController_destroy11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_destroy11_invoker = createInvoker(
    PostController_0.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "destroy",
      Seq(classOf[Integer]),
      "POST",
      this.prefix + """posts/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_PostController_singlePost12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_singlePost12_invoker = createInvoker(
    PostController_0.singlePost(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "singlePost",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """post/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_AuthController_login13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_login13_invoker = createInvoker(
    AuthController_2.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_AuthController_auth14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login-user")))
  )
  private[this] lazy val controllers_AuthController_auth14_invoker = createInvoker(
    AuthController_2.auth(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "auth",
      Nil,
      "POST",
      this.prefix + """login-user""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_AuthController_register15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_AuthController_register15_invoker = createInvoker(
    AuthController_2.register(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_AuthController_validateRegistration16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user-register")))
  )
  private[this] lazy val controllers_AuthController_validateRegistration16_invoker = createInvoker(
    AuthController_2.validateRegistration(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "validateRegistration",
      Nil,
      "POST",
      this.prefix + """user-register""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_5.index())
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:14
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_PostController_adminDashboard4_route(params@_) =>
      call { 
        controllers_PostController_adminDashboard4_invoker.call(PostController_0.adminDashboard())
      }
  
    // @LINE:19
    case controllers_PostController_lists5_route(params@_) =>
      call { 
        controllers_PostController_lists5_invoker.call(PostController_0.lists())
      }
  
    // @LINE:21
    case controllers_PostController_create6_route(params@_) =>
      call { 
        controllers_PostController_create6_invoker.call(PostController_0.create())
      }
  
    // @LINE:23
    case controllers_PostController_show7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PostController_show7_invoker.call(PostController_0.show(id))
      }
  
    // @LINE:25
    case controllers_PostController_edit8_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PostController_edit8_invoker.call(PostController_0.edit(id))
      }
  
    // @LINE:27
    case controllers_PostController_update9_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_PostController_update9_invoker.call(PostController_0.update(id))
      }
  
    // @LINE:29
    case controllers_PostController_store10_route(params@_) =>
      call { 
        controllers_PostController_store10_invoker.call(
          req => PostController_0.store(req))
      }
  
    // @LINE:31
    case controllers_PostController_destroy11_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PostController_destroy11_invoker.call(PostController_0.destroy(id))
      }
  
    // @LINE:33
    case controllers_PostController_singlePost12_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PostController_singlePost12_invoker.call(PostController_0.singlePost(id))
      }
  
    // @LINE:35
    case controllers_AuthController_login13_route(params@_) =>
      call { 
        controllers_AuthController_login13_invoker.call(AuthController_2.login())
      }
  
    // @LINE:37
    case controllers_AuthController_auth14_route(params@_) =>
      call { 
        controllers_AuthController_auth14_invoker.call(AuthController_2.auth())
      }
  
    // @LINE:39
    case controllers_AuthController_register15_route(params@_) =>
      call { 
        controllers_AuthController_register15_invoker.call(AuthController_2.register())
      }
  
    // @LINE:41
    case controllers_AuthController_validateRegistration16_route(params@_) =>
      call { 
        controllers_AuthController_validateRegistration16_invoker.call(AuthController_2.validateRegistration())
      }
  }
}
