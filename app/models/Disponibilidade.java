package models;

import javax.persistence.Entity;

import com.avaje.ebean.Model;

@Entity
public class Disponibilidade extends Model{

	private String hotel;
	private String data;
	private String disponibilidade;
	private String minimoDeNoites;
	
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public String getMinimoDeNoites() {
		return minimoDeNoites;
	}
	public void setMinimoDeNoites(String minimoDeNoites) {
		this.minimoDeNoites = minimoDeNoites;
	}
	
	
}
