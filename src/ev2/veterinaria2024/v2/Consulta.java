package ev2.veterinaria2024.v2;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import ev2.exam.Gafa;
import ev2.exam.Optica.Tipo;

import java.util.ArrayList;

public class Consulta {
	private Date fecha;
	private Animal animal;
	private String Diagnostico;
	Set<Medicamento> setMedicinas;
	
	public Consulta(Animal animal, String diagnostico) {
		super();
		this.fecha = new Date();
		this.animal = animal;
		Diagnostico = diagnostico;
		this.setMedicinas = new TreeSet<Medicamento>();
		
	}
	
	public void addMedicamento(Medicamento med) {
		setMedicinas.add(med);
	}
	
	public void delMedicamento(Medicamento med) {
		setMedicinas.remove(med);
	}
	
		
	public Animal getAnimal() {
		return animal;
	}

	public void getMedicamentosByPeso(){
		//Ordenar por peso descendente (de mayor a menor)
		System.out.println("\nMedicamentos ordenados por peso (desc) de la consulta realizada a "+this.animal);
		
		System.out.println("\n\t-Usando TreeSet: "+setMedicinas);
		
		
	}

		
	@Override
	public String toString() {
		return "Consulta [fecha=" + fecha + ", animal=" + animal + ", Diagnostico=" + Diagnostico + ", medicinas="
				+ setMedicinas + "]";
	}
		
}
