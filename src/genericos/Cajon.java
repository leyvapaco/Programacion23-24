package genericos;

public class Cajon<T> {

	 private T t;
	 
	 public void set(T t) {
		 this.t = t;
	 }

	 public T get() {
		 return t;
	 }

	 public static void main(String[] args) {

		 Cajon<String> cajon = new Cajon<>();

		 cajon.set("Pepe");
		 System.out.println(cajon.get());
		 cajon.set("Paco");

		 System.out.println(cajon.get());
		 
		 //cajon.set(12345); // Compilation error!
	}
}

