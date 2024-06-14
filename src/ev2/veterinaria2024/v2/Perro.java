package ev2.veterinaria2024.v2;

import u6u7.entregable.Artista;

public class Perro extends Domestico implements Contacta, Comparable<Perro>{

	public Perro(Sexo sex, Propietario propietario, String nombre, String raza, int edad, double peso,
			String chip) {
		super( sex, propietario, nombre, raza, edad, peso, chip);
		
	}

	public void cortaUnas() {
		this.peso-=50.0;
	}
	
	public void damePatita() {
		System.out.println("Te doy la patita");
	}
	
	public void contactaPropietario() {
		System.out.println("Contactando al propietario del "+this.getClass().getName());
	}
	
	public String getRaza() {
		return raza;
	};
	
	
	@Override
    public int compareTo(Perro o) {
        return this.getRaza().compareTo(o.getRaza());
    }

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", id=" + id + "]";
	}
	

	
}
