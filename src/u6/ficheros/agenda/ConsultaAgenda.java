package u6.ficheros.agenda;
import java.io.*;

public class ConsultaAgenda{
  public static void main(String[] args){
  Contacto a;
   
  /*Lectura del fichero binario*/
  try{
	  FileInputStream fis = new FileInputStream("C:\\pruebaficheros\\agenda.dat");
	  ObjectInputStream ois = new ObjectInputStream(fis);
	  a = (Contacto) ois.readObject();
	  while (a!=null) {
		  System.out.println(a.toString());
		  a = (Contacto) ois.readObject();//El método readObject() recupera el objeto
	  }
	    
	  ois.close(); 
	  fis.close();
	  
	  
	} catch(EOFException e){
		System.out.println("Fin de Fichero");
		} 
  	catch(FileNotFoundException e){
	  e.printStackTrace();
	}catch(IOException e){
	  e.printStackTrace();
	}catch(ClassNotFoundException e){
	  e.printStackTrace();
	}
  }
}
  
  
  
