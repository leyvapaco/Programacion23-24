package u1.t8a;

import java.util.Scanner;

/*Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo, y su cuadrado. 
 * El proceso terminará cuando el número introducido por teclado sea 0.*/
public class Actividad8_1 {
	public static void main(String[] args) {
		int num;
		String par;
		String positivo;
		int cuadrado;
		Scanner sc=new Scanner(System.in);
		System.out.println("Proporcione un número.");
		num = sc.nextInt();
		while (num!=0) {
			
			 par = (num%2==0)? "es par" : "es impar";
			
			 positivo = (num>=0) ? "es positivo" : "es negativo";
			
			cuadrado= num*num;
			System.out.println("El numero " + num + " " +par + " " +positivo+ " y su cuadrado es igual a : " + cuadrado);
			System.out.println("Proporcione un número.");
			num = sc.nextInt();
		} 
		System.out.println("Ha pulsado 0. Fin");
		
	}
}
