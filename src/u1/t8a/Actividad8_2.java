package u1.t8a;

import java.util.Scanner;

/*Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos. 
 * Se introducirán las edades de los elumnos hasta que una de ellas sea negativa. 
 * La aplicación mostrará la suma de las edades, la media, de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.*/
public class Actividad8_2 {
	public static void main(String[] args) {
		int edad;
		int i=0;
		int sumaedad=0;
		int mediaedad;
		int numalumnos=0;
		int mayoredad=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce la edad");
		edad= sc.nextInt();
			while (edad>=0) {
		numalumnos++;
		sumaedad+=edad;
			if (edad>=18)
		mayoredad=mayoredad+1;
		mediaedad= sumaedad/numalumnos;
			System.out.println("media de edad es de: " + mediaedad);
			System.out.println("El numero de alumnos es: " + numalumnos);
		
		System.out.println( mayoredad +" son mayores de edad");
		System.out.println("La suma de edades es: " + sumaedad);
		System.out.println("Introduce la edad");
		edad= sc.nextInt();
		}
		
	}
}
