package u1.general;

import java.util.Scanner;

public class Nombre {
	public static void main(String[] args) {
				
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del usuario:");
		
		String user= teclado.nextLine();
		
		System.out.println("El usuario es: "+user);
		
		System.out.println(user.toLowerCase());
		
		//System.out.println(user.toUpperCase());
		
		//System.out.println("Longitud: "+user.length());
		
		//System.out.println(user.indexOf("co"));
		
		//System.out.println(user.concat("mer"));
		
		/*
		String x="20";
		String y="23";
		System.out.println(x+y);
		*/
				
	}
	
	
}
