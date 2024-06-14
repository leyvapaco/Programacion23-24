package ev2.veterinaria2024;

import java.io.Serializable;

public abstract class Animal implements Serializable {
	public enum Sexo{MASCULINO,FEMENINO;}
	
	protected int id=0;
	private Sexo sex;
	private Propietario propietario;
	private static int numAnimales=0;
	
	public Animal(Sexo sex,Propietario propietario) {
		this.sex=sex;
		this.propietario=propietario;
		this.id=numAnimales+1;
		numAnimales++;
	}
	
	public static void cuantosAnimales() {
		System.out.println("\nNúmero total de animales:"+numAnimales);
	}
	
}
