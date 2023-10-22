package u1.arrancando;

import java.util.Scanner;

public class Cadenas {
	public static void main(String[] args) {
				
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del usuario:");
		
		String user= teclado.nextLine();
		
		System.out.println(user.toLowerCase());
		
		System.out.println(user.toUpperCase());
				
		System.out.println(	user.equals("Paco"));
		
		System.out.println(	user.substring(1,3));
		
		System.out.println(	user.charAt(1));
		
		System.out.println(	user.indexOf('x'));
		
		
	
		String x="20";
		String y="23";
		System.out.println(x+y);
		
		
		String s1=String.valueOf(2023);
		String s2=String.valueOf(1);
		
		System.out.println("Año: "+s1+s2);
		
		
		
	}
}
