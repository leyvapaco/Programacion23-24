package quienesquienv3;

import java.util.ArrayList;

public class Personaje {
	private String identidad;
	private boolean descartado=false;
	private ArrayList<Pista> listaPistas=new ArrayList<>();
	
	public Personaje() {
	
	}
	
	public void addPista(Pista Pista) {
		listaPistas.add(Pista);
	}
	
	public void damePista() {
		int posicion= (int) (Math.random() * listaPistas.size());
		 System.out.println("PISTA: "+listaPistas.get(posicion));
		 listaPistas.remove(posicion);
	};
	
	public ArrayList<Pista> dameTodasLasPistas() {
		return(listaPistas);
	};
	
	public boolean adivina(Personaje personaje) {
	if (this.identidad.equals(personaje.identidad)) 
		return true;
		else
			return false;
	}
	
	

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	@Override
	public String toString() {
		return "Personaje: " + identidad;
	}
	
	
}
