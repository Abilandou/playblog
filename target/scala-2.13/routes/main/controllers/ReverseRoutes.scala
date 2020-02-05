// @GENERATOR:play-routes-compiler
// @SOURCE:/home/computer/Desktop/Play/blog/conf/routes
// @DATE:Tue Dec 24 14:03:48 WAT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:35
  class ReverseAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def validateRegistration(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user-register")
    }
  
    // @LINE:37
    def auth(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login-user")
    }
  
    // @LINE:39
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:35
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:17
  class ReversePostController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def lists(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts")
    }
  
    // @LINE:25
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:21
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/create")
    }
  
    // @LINE:27
    def update(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "posts/edit" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:23
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:31
    def destroy(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "posts/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:33
    def singlePost(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:17
    def adminDashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:29
    def store(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "posts/create")
    }
  
  }


}
