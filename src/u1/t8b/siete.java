package u1.t8b;

import java.util.Scanner;

public class siete {
  public static void main(String[] args) {
	    
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce altura:");

    int n = sc.nextInt();
    System.out.println();
    
    for (int i = 1; i <= n; i++) {
    	
    	if ((i==1)){
        	for (int j=1; j<=n; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
    	} else { 	
    		for (int j=1; j<=n-i; j++) {
    			System.out.print("-");      		
    		}
    		System.out.println("*");
    	}
    	

    }
  }
}
