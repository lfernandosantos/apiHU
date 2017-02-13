package controllers;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import daos.DisponibilidadeDAO;
import daos.HotelDAO;
import models.Disponibilidade;
import models.EnvelopeDisponibilidade;
import models.EnvelopeHoteis;
import models.Hotel;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class ApiController extends Controller {

	@Inject
	private HotelDAO hotelDAO;
	@Inject
	private DisponibilidadeDAO disponibilidadeDAO;
	
	@Inject
	private FormFactory formularios;
	
	public Result todos(){
		EnvelopeHoteis envelope = new EnvelopeHoteis(hotelDAO.todos());
		
		return ok(Json.toJson(envelope)); 
	}
	

	public Result buscaHoteisComFiltros(){
		DynamicForm bindFromRequest = formularios.form().bindFromRequest();
		Map<String, String> data = bindFromRequest.data();
		
		List<Hotel> hoteis = hotelDAO.comFiltro(data);
		EnvelopeHoteis envelope = new EnvelopeHoteis(hoteis);
		
		return ok(Json.toJson(envelope)); 
	}
	public Result buscaDisponibilidadesComFiltros(){
		DynamicForm bindFromRequest = formularios.form().bindFromRequest();
		Map<String, String> data = bindFromRequest.data();
		
		List<Disponibilidade> disponibilidades = disponibilidadeDAO.comFiltro(data);
		EnvelopeDisponibilidade envelope = new EnvelopeDisponibilidade(disponibilidades);
		
		return ok(Json.toJson(envelope)); 
	}
	
}
