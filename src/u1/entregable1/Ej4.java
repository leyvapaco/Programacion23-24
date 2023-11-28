package u1.entregable1;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Introduce altura:");
	    int n = sc.nextInt();
	    
	    
	    for (int i = 1; i <= n; i++) {
	      for (int j = 1; j <= n-i; j++) { 
	            System.out.print(" ");
	          }  	
	      for (int k = 1; k<=1; k++) {
	    		  System.out.print("*");
	      }
	      System.out.println();
	    }
	  }
	}

