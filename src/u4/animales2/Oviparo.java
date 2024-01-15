package u4.animales2;

public abstract class Oviparo extends Animal {
	static int vidas=0;
	
	//Omitimos el constructor aunque es factible crearlo
	
	Oviparo(){
		super();
		vidas++;	
	}
	
	public void reproducete() {
		System.out.println("Poniendo huevos");
	}

	public static void getVidas() {
		System.out.println("Oviparos creados: "+vidas);
	}

}
