package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import daos.HotelDAO;
import models.Hotel;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.*;
import views.*;

public class HotelController extends Controller{
	
	@Inject
	private FormFactory formularios;
	
	public Result salvaNovoHotel(){
		Form<Hotel> bindFromRequest = formularios.form(Hotel.class).bindFromRequest();
		Hotel hotel = bindFromRequest.get();
		hotel.save();
		return redirect(routes.HotelController.formularioNovoHotel());
	}
	

	public Result formularioNovoHotel(){
		Hotel hotel = new Hotel();
		hotel.setCodigo("código");
		
		Form<Hotel> bindFromRequest = formularios.form(Hotel.class).fill(hotel);
		return ok(formularioNovoHotel.render(bindFromRequest));
		
	}
}
