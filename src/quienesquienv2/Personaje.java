package quienesquienv2;

import java.util.ArrayList;

public class Personaje {
	private String identidad;
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
	
	public boolean adivina(Personaje personaje) {
	if (this.identidad.equals(personaje.identidad)) 
		return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Personaje [identidad=" + identidad + ", listaPistas=" + listaPistas + "]";
	}
	
	
}
