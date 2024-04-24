package u4.animales2;

import u4.animales2.Serpiente.Especies;

public class Principal {
	
	public static void main(String[] args) {
		Perro perro1 = new Perro();
		Pato  pato1= new Pato(); 
		Serpiente serp1= new Serpiente();
			
		Animal.getVidas();
		Mamifero.getVidas();
		Oviparo.getVidas();
		
		System.out.println("---------");
		
		System.out.println(perro1.getClass().getSimpleName());
		perro1.setNombre("Pulgoso");
		perro1.setEdad(7);
		perro1.setNumeroChip(12123123);
		perro1.setCola(true);
		perro1.olfatear();
		perro1.comunicate();
		perro1.reproducete();
		
		System.out.println("---------");

		System.out.println(pato1.getClass().getSimpleName());
		pato1.setNombre("Lucas");
		pato1.comunicate();
		pato1.hacerNido();
		pato1.reproducete();

		System.out.println("---------");
		
		Serpiente.muestraEspecies();
		System.out.println(serp1.getClass().getSimpleName());
		serp1.setNombre("Cobry");
		serp1.comunicate();
		serp1.reproducete();
		serp1.morder(Especies.COBRA);
		
		System.out.println(Especies.COBRA);

	  //serp1.morder(Especies.VIBORA);
		
	}

}
