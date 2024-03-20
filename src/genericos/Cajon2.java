package genericos;

public class Cajon2<T> {

	 private T t;
	 
	 public void set(T t) {
		 this.t = t;
	 }

	 public T get() {
		 return t;
	 }

	 public static void main(String[] args) {

		 Cajon2<Boligrafo> cajon = new Cajon2<>();
		 
		 Boligrafo boli=new Boligrafo("Pilot","Rojo",1.20);

		 cajon.set(boli);
		 System.out.println(cajon.get());

	}
}

