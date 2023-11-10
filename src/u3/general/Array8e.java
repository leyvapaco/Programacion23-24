package u3.general;

import java.util.Scanner;

class Array8e {
	
	public static void dameInfoCoches(String[][] datos) {
		System.out.println("Número de vehículos:"+datos.length+"\n");
		
        for (int i=0; i<datos.length; i++)
        System.out.println("Marca: "+datos[i][0]+"\t Modelo: " +datos[i][1]);
   	}
	
	public static String dameModeloCoche(String[][] datos, String marca) {
		String modelo="";
	
        for (int i=0; i<datos.length; i++)
        if (datos[i][0].equals(marca))
        	modelo=datos[i][1];
        	
        	return(modelo);
   	}
	
	
    public static void main( String args[] ) {
 
        Scanner teclado = new Scanner(System.in);
 
        String[][] coches = {{"kia","sportage"},{"renault","clio"},{"seat","toledo"},{"audi","A3"}}; 
              	
       // dameInfoCoches(coches);  
        
        String marca="kia";
        String modelo=dameModeloCoche(coches,"kia"); 
        System.out.println("Marca: "+marca+"\t Modelo: " +modelo);
    }
}
 