package genericos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Usar un TreeSet para que aplique el comparable
// Volcar un Set en un ArrayList
// Usar una expresión lambda para reordenar

public class Cajon4b<T>  {

	 private Set<T> cosas=new TreeSet<>(); //Para que ordene por color
	 
	 public void set(T cosa) {
		 this.cosas.add(cosa);
	 }

	 public Set<T> get() {
		 return cosas;
	 }

	 public static void main(String[] args) {

		 Cajon4b<Boligrafo> cajonBolis = new Cajon4b<>();
		 Cajon4b<Lapiz> cajonLapices = new Cajon4b<>();
		 
		 Boligrafo boli1=new Boligrafo("Parker","Rojo",2.45);
		 Boligrafo boli2=new Boligrafo("Bic","Azul",1.40);
		 Boligrafo boli3=new Boligrafo("Bic","Negro",1.10);

		 cajonBolis.set(boli1);
		 cajonBolis.set(boli2);
		 cajonBolis.set(boli3);
		 System.out.println(cajonBolis.get());

		 	 
		 List <Boligrafo> listaBolis= new ArrayList<>();
		 
		 listaBolis.addAll(cajonBolis.get()); //Convierto un Set que me llega ordenado en un ArrayList
		 
		 System.out.println("1)---  "+listaBolis);
		 
		 //Ordeno por color ascendente mediante una expresión lambda
		 listaBolis.sort((b1,b2) -> b2.color.compareTo(b1.color));
		 
		 System.out.println("2)---  "+listaBolis);
		 
		 //Defino un comparator por marca ascendente mediante una expresión lambda
		 Comparator<Boligrafo> comp = (b1,b2) -> b1.marca.compareTo(b2.marca);
		 listaBolis.sort(comp);
		 System.out.println("3)---  "+listaBolis);
		 
		 //Impresion de las marcas UNICAS usando una expresión lambda
		 System.out.println("\n4)---  ");
		 
		 Set<String> marcasUnicas=new HashSet<>(); //Para evitar marcas duplicadas
		 listaBolis.forEach(
				 (elemento)->marcasUnicas.add(elemento.getMarca())
				 ); 
		 
		 marcasUnicas.forEach(
				 (elemento)->System.out.println(elemento)
				 ); 
		 
		 //Imprimir precios aplicando IVA usando una expresión lambda
		 System.out.println("\n5)--- pvp con IVA: ");
		 listaBolis.forEach(
				 (elemento)->System.out.println(String.format("%.2f",elemento.pvp*1.21))
				 );
		 		 
	}
}

