package u1.arrancando;

import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		
		double saldo=500;
		double importe;
		final int pinSecreto=1234;
		int pinIntroducido;
		int opc;
		int intentos=0;;
		boolean autenticado=false;
				
		Scanner cajero = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca pin:");
			pinIntroducido=cajero.nextInt();
			if(pinIntroducido==pinSecreto)
				autenticado=true;
			intentos++;
		}while (!autenticado && intentos<3);
			
		if (autenticado) {		
			System.out.println("1: Ingresar efectivo:");	
			System.out.println("2: Retirar efectivo:");
			opc=cajero.nextInt();
			
			switch(opc) {
				case 1:
					System.out.println("Indique importe a ingresar:");
					importe=cajero.nextInt();
					saldo=saldo+importe;
					System.out.println("Saldo disponible:"+saldo);
					break;
				case 2:
					System.out.println("Indique importe a retirar:");
					importe=cajero.nextInt();
					if ((saldo-importe)>=0)
						saldo=saldo-importe;
					else 
						System.out.println("Saldo insuficiente:");
					System.out.println("Saldo disponible:"+saldo);
					break;
				default: 
					System.out.println("Opción no válida");	
					break;
			}
		} 
	}
}
