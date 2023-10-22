package u1.arrancando;

import java.util.Scanner;

public class Seguro {
	public static void main(String[] args) {
		
		float precioBase=500.0f;
		float precioFinal;
		float recarga=0.0f;
		int edad;
		String marca;
		String marcaLow;
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique la marca del coche:");
		marca= teclado.nextLine();
		marca.toLowerCase(); //convertimos la marca a minusculas		
		
		System.out.println("Indique edad del asegurado:");
		edad= teclado.nextInt();
		
		//calculamos la recarga en función de la marca
		switch (marca) {
			case "aston","porsche","jaguar":
				recarga=50;
			break;
			case "bmw","mercedes","audi":
				recarga=25;
			break;
			default:
				recarga=0;	
		}
		
		//calculamos la recarga en función de la edad
		if (edad<25)
			recarga+=30; //recarga=recarga+30
		
		if (edad>60)
			recarga+=20;
		
		//calculamos el precio final
		precioFinal=precioBase+recarga;
		
		System.out.println("El precio base es:"+precioBase+" euros");
		System.out.println("El importe de recarga es:"+recarga);		
		System.out.println("El precio final, sin impuestos, es:"+precioFinal+"euros");			
	}
}
