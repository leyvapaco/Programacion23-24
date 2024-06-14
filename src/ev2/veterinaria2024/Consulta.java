package ev2.veterinaria2024;

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
	private String diagnostico;
	ArrayList<Medicamento> listaMedicinas;
	
	public Consulta(Animal animal, String diagnostico) {
		super();
		this.fecha = new Date();
		this.animal = animal;
		this.diagnostico = diagnostico;
		this.listaMedicinas = new ArrayList<Medicamento>();
		
	}
	
	public void addMedicamento(Medicamento med) {
		listaMedicinas.add(med);
	}
	
	public void delMedicamento(Medicamento med) {
		listaMedicinas.remove(med);
	}
	
		
	public Animal getAnimal() {
		return animal;
	}

	public void getMedicamentosByPeso(){
		//Ordenar por peso descendente (de mayor a menor)
		System.out.println("\nMedicamentos ordenados por peso (desc) de la consulta realizada a "+this.animal);
		
		//Convierto la lista a un TreeSet para poder usar el comparador de Medicina que ordena por peso
		Set<Medicamento> setMedicinas= new TreeSet<Medicamento>(listaMedicinas);	
		System.out.println("\n\t-Usando TreeSet: "+setMedicinas);
		
		//O bien comparo manteniendo el ArrayList
		listaMedicinas.sort((o1, o2) -> o1.compareTo(o2));
		System.out.println("\n\t-Usando ArrayList: "+listaMedicinas);
		
	}

		
	@Override
	public String toString() {
		return "Consulta [fecha=" + fecha + ", animal=" + animal + ", Diagnostico=" + diagnostico + ", medicinas="
				+ listaMedicinas + "]";
	}
		
}
