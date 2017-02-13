package models;

import java.util.List;

public class EnvelopeDisponibilidade {

	private List<Disponibilidade> disponibilidades;
	
	public EnvelopeDisponibilidade(List<Disponibilidade> disponibilidades){
		this.disponibilidades = disponibilidades;
	}
	
	public List<Disponibilidade> getDisponibilidade(){
		return disponibilidades;
	}
}
