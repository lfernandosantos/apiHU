
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ferna/Documents/Projetos/projeto-hu/conf/routes
// @DATE:Thu Jan 05 19:55:32 BRST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  HomeController_1: controllers.HomeController,
  // @LINE:3
  HotelController_0: controllers.HotelController,
  // @LINE:5
  DisponibilidadeController_3: controllers.DisponibilidadeController,
  // @LINE:7
  AsyncController_2: controllers.AsyncController,
  // @LINE:10
  ApiController_5: controllers.ApiController,
  // @LINE:13
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    HomeController_1: controllers.HomeController,
    // @LINE:3
    HotelController_0: controllers.HotelController,
    // @LINE:5
    DisponibilidadeController_3: controllers.DisponibilidadeController,
    // @LINE:7
    AsyncController_2: controllers.AsyncController,
    // @LINE:10
    ApiController_5: controllers.ApiController,
    // @LINE:13
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_1, HotelController_0, DisponibilidadeController_3, AsyncController_2, ApiController_5, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, HotelController_0, DisponibilidadeController_3, AsyncController_2, ApiController_5, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hotel/novo""", """controllers.HotelController.salvaNovoHotel"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hotel/novo""", """controllers.HotelController.formularioNovoHotel"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """disponibilidade/novo""", """controllers.DisponibilidadeController.salvaDisponibilidade"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """disponibilidade/novo""", """controllers.DisponibilidadeController.formularioNovaDisponibilidade"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/hoteis""", """controllers.ApiController.buscaHoteisComFiltros"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/hoteis/todos""", """controllers.ApiController.todos"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/disponibilidade""", """controllers.ApiController.buscaDisponibilidadesComFiltros"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:3
  private[this] lazy val controllers_HotelController_salvaNovoHotel1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotel/novo")))
  )
  private[this] lazy val controllers_HotelController_salvaNovoHotel1_invoker = createInvoker(
    HotelController_0.salvaNovoHotel,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HotelController",
      "salvaNovoHotel",
      Nil,
      "POST",
      """""",
      this.prefix + """hotel/novo"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_HotelController_formularioNovoHotel2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotel/novo")))
  )
  private[this] lazy val controllers_HotelController_formularioNovoHotel2_invoker = createInvoker(
    HotelController_0.formularioNovoHotel,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HotelController",
      "formularioNovoHotel",
      Nil,
      "GET",
      """""",
      this.prefix + """hotel/novo"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_DisponibilidadeController_salvaDisponibilidade3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("disponibilidade/novo")))
  )
  private[this] lazy val controllers_DisponibilidadeController_salvaDisponibilidade3_invoker = createInvoker(
    DisponibilidadeController_3.salvaDisponibilidade,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DisponibilidadeController",
      "salvaDisponibilidade",
      Nil,
      "POST",
      """""",
      this.prefix + """disponibilidade/novo"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_DisponibilidadeController_formularioNovaDisponibilidade4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("disponibilidade/novo")))
  )
  private[this] lazy val controllers_DisponibilidadeController_formularioNovaDisponibilidade4_invoker = createInvoker(
    DisponibilidadeController_3.formularioNovaDisponibilidade,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DisponibilidadeController",
      "formularioNovaDisponibilidade",
      Nil,
      "GET",
      """""",
      this.prefix + """disponibilidade/novo"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_AsyncController_message5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message5_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """""",
      this.prefix + """message"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ApiController_buscaHoteisComFiltros6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/hoteis")))
  )
  private[this] lazy val controllers_ApiController_buscaHoteisComFiltros6_invoker = createInvoker(
    ApiController_5.buscaHoteisComFiltros,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "buscaHoteisComFiltros",
      Nil,
      "GET",
      """ API""",
      this.prefix + """api/hoteis"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ApiController_todos7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/hoteis/todos")))
  )
  private[this] lazy val controllers_ApiController_todos7_invoker = createInvoker(
    ApiController_5.todos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "todos",
      Nil,
      "GET",
      """""",
      this.prefix + """api/hoteis/todos"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ApiController_buscaDisponibilidadesComFiltros8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/disponibilidade")))
  )
  private[this] lazy val controllers_ApiController_buscaDisponibilidadesComFiltros8_invoker = createInvoker(
    ApiController_5.buscaDisponibilidadesComFiltros,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "buscaDisponibilidadesComFiltros",
      Nil,
      "GET",
      """""",
      this.prefix + """api/disponibilidade"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:3
    case controllers_HotelController_salvaNovoHotel1_route(params) =>
      call { 
        controllers_HotelController_salvaNovoHotel1_invoker.call(HotelController_0.salvaNovoHotel)
      }
  
    // @LINE:4
    case controllers_HotelController_formularioNovoHotel2_route(params) =>
      call { 
        controllers_HotelController_formularioNovoHotel2_invoker.call(HotelController_0.formularioNovoHotel)
      }
  
    // @LINE:5
    case controllers_DisponibilidadeController_salvaDisponibilidade3_route(params) =>
      call { 
        controllers_DisponibilidadeController_salvaDisponibilidade3_invoker.call(DisponibilidadeController_3.salvaDisponibilidade)
      }
  
    // @LINE:6
    case controllers_DisponibilidadeController_formularioNovaDisponibilidade4_route(params) =>
      call { 
        controllers_DisponibilidadeController_formularioNovaDisponibilidade4_invoker.call(DisponibilidadeController_3.formularioNovaDisponibilidade)
      }
  
    // @LINE:7
    case controllers_AsyncController_message5_route(params) =>
      call { 
        controllers_AsyncController_message5_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:10
    case controllers_ApiController_buscaHoteisComFiltros6_route(params) =>
      call { 
        controllers_ApiController_buscaHoteisComFiltros6_invoker.call(ApiController_5.buscaHoteisComFiltros)
      }
  
    // @LINE:11
    case controllers_ApiController_todos7_route(params) =>
      call { 
        controllers_ApiController_todos7_invoker.call(ApiController_5.todos)
      }
  
    // @LINE:12
    case controllers_ApiController_buscaDisponibilidadesComFiltros8_route(params) =>
      call { 
        controllers_ApiController_buscaDisponibilidadesComFiltros8_invoker.call(ApiController_5.buscaDisponibilidadesComFiltros)
      }
  
    // @LINE:13
    case controllers_Assets_versioned9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
