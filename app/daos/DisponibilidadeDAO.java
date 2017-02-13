package daos;

import java.util.List;
import java.util.Map;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model.Finder;

import models.Disponibilidade;
import models.Hotel;

public class DisponibilidadeDAO {
	
	private Finder<Long, Disponibilidade> disponibilidades = new Finder<>(Disponibilidade.class);

	public List<Disponibilidade> todos() {
		return disponibilidades.all();
	}

	public List<Disponibilidade> comFiltro(Map<String, String> data) {
		ExpressionList<Disponibilidade> where = disponibilidades.where();

		data.entrySet().forEach(entrada -> {
			where.eq(entrada.getKey(), entrada.getValue());
		});
		return where.findList();
	}
}
