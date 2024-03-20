package genericos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Cajon3<T>  {

	 private Set<T> cosas=new HashSet<>();
	 
	 public void set(T cosa) {
		 this.cosas.add(cosa);
	 }

	 public Set<T> get() {
		 return cosas;
	 }

	 public static void main(String[] args) {

		 Cajon3<Boligrafo> cajon = new Cajon3<>();
		 
		 Boligrafo boli1=new Boligrafo("Pilot","Rojo",1.30);
		 Boligrafo boli2=new Boligrafo("Pilot","Azul",1.20);

		 cajon.set(boli1);
		 cajon.set(boli2);
		 System.out.println(cajon.get());//Observar si ordena o no por color

	}
}

