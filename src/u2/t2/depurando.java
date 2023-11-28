package u2.t2;

import java.util.Scanner;
import java.util.Arrays;

public class depurando {

	    public static void main(String[] args) {

	        int[] v = new int[6];
	        int numero;
	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < v.length ; i++) {
	            System.out.println("Introduce el elemento para la posición "+i+ " del vector");
	            v[i] = sc.nextInt();
	        }


	        System.out.printf("Introduce el número a buscar en el vector");
	        numero = sc.nextInt();

	        boolean resultado = esta(v,numero);

	        if (resultado) {
	            System.out.printf("El elemento "+numero+" está en el vector "+ Arrays.toString(v));
	        } else {
	            System.out.printf("El elemento "+numero+" no está en el vector"+ Arrays.toString(v));
	        }

	    }

	    public static boolean esta(int[] vector, int elemento) {

	        for (int i = 0; i <= vector.length ; i++) {
	            if (vector[i]==elemento) {
	                return true;
	            }
	        }

	        return false;
	    }
	}

