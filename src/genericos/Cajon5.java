package genericos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

// Usar un TreeSet para que aplique el comparable
// Volcar un Set en un ArrayList
// Usar una expresión lambda para reordenar

public class Cajon5<T>  {

	 private Set<T> cosas=new HashSet<>(); //Quitamosel TreeSet
	 
	 public void set(T cosa) {
		 this.cosas.add(cosa);
	 }

	 public Set<T> get() {
		 return cosas;
	 }

	 public static void main(String[] args) {

		 Cajon5<MaterialOficina> cajonOficina = new Cajon5<>();
		 
		 MaterialOficina boli1=new Boligrafo("Parker","Rojo",2.45);
		 MaterialOficina boli2=new Boligrafo("Pilot","Azul",1.40);
		 MaterialOficina boli3=new Boligrafo("Bic","Negro",1.10);
		 
		 MaterialOficina lapiz1=new Lapiz("Pino",1.0,2.45);
		 MaterialOficina lapiz2=new Lapiz("Staedler",2.0,3.49);

		 cajonOficina.set(boli1);
		 cajonOficina.set(boli2);
		 cajonOficina.set(boli3);
		 
		 cajonOficina.set(lapiz1);
		 cajonOficina.set(lapiz2);

		 //Imprimir todo el contenido del cajón
		 System.out.println(cajonOficina.get());
		 
		 //Imprimir sólo los bolis
		 System.out.println("\n");
		 
		 List <MaterialOficina> material= new ArrayList<>();
		 		 
		 material.addAll(cajonOficina.get());

		 for (MaterialOficina b : material) {
			 if (b instanceof Boligrafo)
				 System.out.println(b.toString());
		 }
		 
		 System.out.println("\nOtra forma de obtener sólo los bolis");
		 List<MaterialOficina> bolis = material
				  .stream()
				  .map(b -> (MaterialOficina) b)
				  .filter(b -> b instanceof Boligrafo)
				  .collect(Collectors.toList());
		 
		 bolis.forEach(
				 (elemento)-> System.out.println(elemento)
				 ); 
	}
}

