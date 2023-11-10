package u3.general;

import java.util.Scanner;

class Array8d {
	
	public static void dameInfoCoches(String[][] datos) {
		System.out.println("Número de vehículos:"+datos.length+"\n");
		
        for (int i=0; i<4; i++)
        System.out.println("Marca: "+datos[i][0]+"\t Modelo: " +datos[i][1]);
   	}
	
	
    public static void main( String args[] ) {
 
        String[][] coches = {{"kia","sportage"},{"renault","clio"},{"seat","toledo"},{"audi","A3"}}; 
        String[][] fichaTecnica = {{"kia","110tdi"},{"kia","5 puertas"},{"kia","diesel"},{"kia","turbo"}}; 
        
        
        dameInfoCoches(coches);    	
        
    }
}
 