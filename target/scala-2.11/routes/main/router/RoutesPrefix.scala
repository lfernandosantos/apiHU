
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ferna/Documents/Projetos/projeto-hu/conf/routes
// @DATE:Thu Jan 05 19:55:32 BRST 2017


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
