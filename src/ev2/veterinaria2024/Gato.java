package ev2.veterinaria2024;

import ev2.veterinaria2024.Animal.Sexo;

public class Gato extends Domestico implements Contacta{

	public Gato(Sexo sex, Propietario propietario, String nombre, String raza, int edad, double peso,
			String chip) {
		super( sex, propietario, nombre, raza, edad, peso, chip);
		
	}

	public void cortaUnas() {
		this.peso-=50.0;
	}
	
	public void contactaPropietario() {
		System.out.println("Contactando al propietario del "+this.getClass().getName());
	}

	@Override
	public String toString() {
		return "Gato [raza=" + raza + ", id=" + id + "]";
	}
	
	
}
