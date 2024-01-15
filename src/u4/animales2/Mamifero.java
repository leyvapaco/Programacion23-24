package u4.animales2;

public abstract class Mamifero extends Animal {
	static int vidas=0;
	
	//Omitimos el constructor aunque es factible crearlo
	
	Mamifero(){
		super();
		vidas++;	
	}
	
	public void reproducete() {
		System.out.println("Reproduciendome (mamifero)");
	}

	public static void getVidas() {
		System.out.println("Mamiferos creados: "+vidas);
	}


}
