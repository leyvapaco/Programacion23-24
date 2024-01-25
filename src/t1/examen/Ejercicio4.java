package t1.examen.copy; //Iván

import java.util.Scanner;

public class Ejercicio4 {
	
	//FUNCION RECURSIVA PARA OBTENER LA MULTIPLICACIÓN
	public static int multiplicacion(int num1, int num2) {
		//DECLARACIÓN DE VARIABLES
		int resultado;
		
		//CONDICIONAL
		if(num2 == 1) { //caso base
			resultado = num1;
		} else {
			resultado = num1 + multiplicacion(num1, num2 - 1);
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el 1º número de la multiplicación: ");
		num1 = sc.nextInt();
		
		System.out.println("Escriba el 2º número de la multiplicación: ");
		num2 = sc.nextInt();
		
		System.out.println("El resultado es: "+multiplicacion(num1, num2));
		sc.close();
	}
}
