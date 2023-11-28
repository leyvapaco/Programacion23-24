package u1.entregable1;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int hbasica = 3;
		int hgourmet = 5;
		boolean eleccionMenu = false;
		int totalBurgB = 0; //total burguers basicas
		int totalBurgG = 0; //total burguers gourmet
		
		System.out.println("Bienvenido a Burbur. este es nuestro menú del cual solicitarás la cantidad correspondiente de productos");
		System.out.println("1: Hamburguesa básica (pan, carne, queso");
		System.out.println("2: Hamburguesa gourmet (pan artesano, carne de wagyu, queso de oveja");
		
		System.out.println("¿Cuántas hamburguesas clásicas deseas ordenar?");
		totalBurgB= tc.nextInt();
		
		System.out.println("Perfecto. ¿Cuántas hamburguesas gourmet deseas ordenar?");
		totalBurgG= tc.nextInt();
		
		System.out.println("Para qué día realizarás el pedido? Especifica un día.");
		String diaSemana= tc.next();
		
		//Se cambia el método dependiendo del día marcado por el usuario.
		
		switch(diaSemana) {
		case "lunes", "Lunes":
			System.out.println("Nos encontramos a lunes, por lo que no tendrá descuento.");
			break;
		case "martes", "Martes":
			System.out.println("Nos encontramos a martes, por lo que tendrá descuento por Martes Locos!.");
			
			break;
		case "miercoles", "Miercoles", "miércoles", "Miércoles":
			System.out.println("Nos encontramos a miercoles, por lo que no tendrá descuento.");
			break;
		case "jueves", "Jueves":
			System.out.println("Nos encontramos a jueves, por lo que no tendrá descuento.");
			break;
		case "viernes", "Viernes":
			System.out.println("Nos encontramos a viernes, por lo que no tendrá descuento.");
			break;
		case "sábado", "Sábado", "sabado", "Sabado":
			System.out.println("Nos encontramos a sabado, por lo que no tendrá descuento.");
			break;
		case "domingo", "Domingo":
			System.out.println("Nos encontramos a domingo, por lo que no tendrá descuento.");
			break;
		}
		System.out.println("¿Pertenece al club fanegas? s/n");
		String club = tc.next();
		
		//empezamos a calcular.
		
		int precioTotalBurgB = totalBurgB * hbasica;
		int precioTotalBurgG = totalBurgG * hgourmet;
		int precioFinal = precioTotalBurgB + precioTotalBurgG;
		int precioFinalDesc = (precioFinal * 100) / 12;
		

		System.out.println("Aquí tiene su pedido. Gracias por su compra.");
		System.out.println("/n Hamburguesas básicas: "+totalBurgB);
		System.out.println("/n Hamburguesas gourmet: "+totalBurgG);
		System.out.println("/n Total: "+precioFinal);
		if(club == "s") {
			System.out.println("/n Descuento: "+precioFinalDesc);
		}
		int precioFinalPago = precioFinalDesc;
		System.out.println("/n A pagar: "+precioFinalPago+" €");
		
	}
}
