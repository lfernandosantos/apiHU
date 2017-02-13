
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ferna/Documents/Projetos/projeto-hu/conf/routes
// @DATE:Thu Jan 05 19:55:32 BRST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApiController ApiController = new controllers.ReverseApiController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAsyncController AsyncController = new controllers.ReverseAsyncController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDisponibilidadeController DisponibilidadeController = new controllers.ReverseDisponibilidadeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHotelController HotelController = new controllers.ReverseHotelController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApiController ApiController = new controllers.javascript.ReverseApiController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAsyncController AsyncController = new controllers.javascript.ReverseAsyncController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDisponibilidadeController DisponibilidadeController = new controllers.javascript.ReverseDisponibilidadeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHotelController HotelController = new controllers.javascript.ReverseHotelController(RoutesPrefix.byNamePrefix());
  }

}
