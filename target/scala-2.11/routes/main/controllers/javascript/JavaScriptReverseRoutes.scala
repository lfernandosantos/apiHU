
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ferna/Documents/Projetos/projeto-hu/conf/routes
// @DATE:Thu Jan 05 19:55:32 BRST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:2
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def todos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.todos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/hoteis/todos"})
        }
      """
    )
  
    // @LINE:12
    def buscaDisponibilidadesComFiltros: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.buscaDisponibilidadesComFiltros",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/disponibilidade"})
        }
      """
    )
  
    // @LINE:10
    def buscaHoteisComFiltros: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.buscaHoteisComFiltros",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/hoteis"})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseDisponibilidadeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def salvaDisponibilidade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DisponibilidadeController.salvaDisponibilidade",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "disponibilidade/novo"})
        }
      """
    )
  
    // @LINE:6
    def formularioNovaDisponibilidade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DisponibilidadeController.formularioNovaDisponibilidade",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "disponibilidade/novo"})
        }
      """
    )
  
  }

  // @LINE:3
  class ReverseHotelController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def formularioNovoHotel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HotelController.formularioNovoHotel",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hotel/novo"})
        }
      """
    )
  
    // @LINE:3
    def salvaNovoHotel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HotelController.salvaNovoHotel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "hotel/novo"})
        }
      """
    )
  
  }


}
