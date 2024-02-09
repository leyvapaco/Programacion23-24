package u6.ficheros.binarios;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EjemploFOS2 implements Serializable{
	public static void main(String[] args) {
		
		int [] t = new int[10];
		for (int i = 0; i < t.length; i++) {
			t[i] = i;}
		 
        try {
        	
        	ObjectOutputStream fos=new  ObjectOutputStream(new FileOutputStream("C:\\pruebaficheros\\enteros.dat"));
        	ObjectOutputStream fos2=new  ObjectOutputStream(new FileOutputStream("C:\\pruebaficheros\\cadena.dat"));       			      	       	
           	fos.writeObject(t);
           	fos2.writeObject("Que bonita la vida");
 
            fos.close();
            fos2.close();
            
 
        }catch(IOException e){
        	 System.out.println("Error al escribir el fichero!");
        }
 
    }
}