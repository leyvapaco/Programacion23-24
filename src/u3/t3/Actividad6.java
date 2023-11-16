package u3.t3;

import java.util.Scanner;


public class Actividad6 {
	
	public static int[] sinRepetidos(int t[]) {
		
		int[] t2=new int[t.length];
		
		//Array sin repetidos
		int ocurrencias;
		int i=0;
		int j;
		int k=0;
	
		while (i<t.length) {
			ocurrencias=1;
			j=0;
				
			while(j<t2.length) {
				if (t[i]==t2[j])
					ocurrencias++;
				j++;
			}
			
			if (ocurrencias<=1) {
				t2[k]=t[i];
				i++;
				k++;
			} else
				i++;

		}
		
		//Ajustamos el tamaño del vector a devolver para que no incluya los ceros del final, creamos t3
		
		int[] t3=new int[k]; //k contiene el tamaño de t2 sin incluir los ceros
		
		for (i=0;i<t3.length;i++)
			t3[i]=t2[i];
		
		return t3;
	}
	public static void main(String[] args) {
				
		int[] tabla = {2,4,2,4,5,6,3,7,4,3};
		int[] tabla2;
		
		tabla2=sinRepetidos(tabla);
		
		for (int i=0;i<tabla2.length;i++) 
			System.out.println(tabla2[i]);		
	}	
}
