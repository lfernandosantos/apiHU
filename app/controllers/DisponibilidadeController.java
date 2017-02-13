package controllers;

import javax.inject.Inject;

import models.Disponibilidade;
import models.Hotel;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.*;
import views.*;

public class DisponibilidadeController extends Controller{
	
	@Inject
	private FormFactory formularios;
	
	public Result salvaDisponibilidade(){
		Form<Disponibilidade> bindFromRequest = formularios.form(Disponibilidade.class).bindFromRequest();
		Disponibilidade disponibilidade = bindFromRequest.get();
		disponibilidade.save();
		return redirect(routes.DisponibilidadeController.salvaDisponibilidade());
	}

	public Result formularioNovaDisponibilidade(){
				
		Form<Disponibilidade> bindFromRequest = formularios.form(Disponibilidade.class).bindFromRequest();
		return ok(formularioNovaDisponibilidade.render(bindFromRequest));
		
	}
}
