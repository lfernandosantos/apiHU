package daos;

import java.util.List;
import java.util.Map;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model.Finder;

import models.Hotel;

public class HotelDAO {
	
	private Finder<Long, Hotel> hoteis = new Finder<>(Hotel.class);

	public List<Hotel> todos() {
		return hoteis.all();
	}

	public List<Hotel> comFiltro(Map<String, String> data) {
		ExpressionList<Hotel> where = hoteis.where();

		data.entrySet().forEach(entrada -> {
			where.or(
					com.avaje.ebean.Expr.like(entrada.getKey(), "%"+ entrada.getValue() + "%"),
					com.avaje.ebean.Expr.like(entrada.getKey(),"%"+  entrada.getValue() + "%"));
			
			//where.like(entrada.getKey(), entrada.getValue());
		});
		return where.findList();
	}
	


}
