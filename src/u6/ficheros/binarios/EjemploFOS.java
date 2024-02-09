package u6.ficheros.binarios;


import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFOS {
	public static void main(String[] args) {
        try(FileOutputStream fos=new FileOutputStream("C:\\pruebaficheros\\Machado.dat")){
        	 
            String texto="Esto es una prueba para ficheros binarios";
 
            //Copiamos el texto en un array de bytes
            byte codigos[]=texto.getBytes();
 
            fos.write(codigos);
 
        }catch(IOException e){
 
        }
 
    }
}