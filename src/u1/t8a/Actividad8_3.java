package u1.t8a;

import java.util.Scanner;

/* Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números tratando de acertarlo. 
 * El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario. 
 * El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).*/
public class Actividad8_3 {
	public static void main(String[] args) {
		int numAleat;
		int numUsuario;
		boolean acertado=false;
		
		Scanner sc= new Scanner(System.in);
		numAleat=(int)(Math.random()*100)+1;	
		System.out.println("El numero aleatorio es: "+numAleat);
		
		do {

		System.out.println("Proporcione un numero");
		numUsuario= sc.nextInt();
		System.out.println("El numero introducido por el usuario es: "+numUsuario);
		
		
		if(numAleat>numUsuario)
			System.out.println("El numero aleatorio es mayor que el numero introducido por el usuario");
		else if(numAleat<numUsuario)
			System.out.println("El numero aleatorio es menor que el numero introducido por el usuario");
			else {
				System.out.println("Acertado!!");
				acertado=true;
			}	
		}while((!acertado) && (numUsuario!=-1));
	System.out.println("Fin");
	}
	
	
}
