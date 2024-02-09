package u6.ficheros.binarios;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFIS {
	public static void main(String[] args) {

        try(FileInputStream fis=new FileInputStream("C:\\pruebaficheros\\Machado.dat")){
 
            int valor=fis.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fis.read();
            }
 
        }catch(IOException e){
 
        }
 
    }
}