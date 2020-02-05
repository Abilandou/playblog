// @GENERATOR:play-routes-compiler
// @SOURCE:/home/computer/Desktop/Play/blog/conf/routes
// @DATE:Tue Dec 24 14:03:48 WAT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
