package u4.animales;

public class Principal {
	
	public static void main(String[] args) {
		Perro perro1 = new Perro();
		Perro perro2 = new Perro();
		Ave ave1 = new Ave();
		Ave pato1= new Pato(); //Observar la clase
		//Pato pato1= new Pato();
		//Animal pato1= new Pato();
		//Pato pato1= (Pato) new Ave(); 

		perro1.setNombre("Pulgoso");
		perro1.setEdad(7);
		perro1.setNumeroChip(12123123);
		
		perro2.setNombre("Coke");
		ave1.setNombre("Piolin");
		pato1.setNombre("Lucas");

		perro1.olfatear();

		perro1.comunicarse();
		
		perro1.setCola(true);
		
		System.out.println(perro1.getNombre()+" tiene cola: "+perro1.getCola());
		
		ave1.setAlas(true);
		
		System.out.println(ave1.getNombre()+" tiene alas: "+ave1.isAlas());
		
		ave1.comunicarse();
		
		pato1.comunicarse();
		
		pato1.hacerNido();
		
		System.out.println(pato1.getClass());
		
		Animal.getVidas();
		
	}

}
