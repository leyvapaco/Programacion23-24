package u1.t8a;

import java.util.Scanner;

/*Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.*/
public class Actividad8_4 {
	public static void main(String[] args) {
		int n;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Proporcione un numero");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
			System.out.println(i);
		
	}
}
