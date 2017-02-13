package models;

import java.util.List;

public class EnvelopeHoteis {

	private List<Hotel> hoteis;
	
	public EnvelopeHoteis(List<Hotel> hoteis){
		this.hoteis = hoteis;
	}
	
	public List<Hotel> getHoteis(){
		return hoteis;
	}
}
