package u6.ficheros.agenda;
import java.io.*;

public class CreaAgenda{
  public static void main(String[] args){
  Contacto a1 = new Contacto("Dominic", "Obil", "Osorio");
  Contacto a2 = new Contacto("Ricardo", "Dionisio", "Carpio");

  /*Escritura en el fichero binario*/
  try{
    FileOutputStream fs = new FileOutputStream("C:\\pruebaficheros\\agenda.dat");//Creamos el archivo
    ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
    os.writeObject(a1);//El método writeObject() serializa el objeto y lo escribe en el archivo
    os.writeObject(a2);
    os.close();//Hay que cerrar siempre el archivo
  }catch(IOException e){
    e.printStackTrace();
  }
  
  /*Lectura del fichero binario*/
  try{
	  FileInputStream fis = new FileInputStream("C:\\pruebaficheros\\agenda.dat");
	  ObjectInputStream ois = new ObjectInputStream(fis);
	  a1 = (Contacto) ois.readObject();//El método readObject() recupera el objeto
	  a2 = (Contacto) ois.readObject();
	    
	  ois.close(); 
	  fis.close();
	  
	  System.out.println(a1.toString());
	  System.out.println(a2.toString());
	  
	} catch(FileNotFoundException e){
	  e.printStackTrace();
	}catch(IOException e){
	  e.printStackTrace();
	}catch(ClassNotFoundException e){
	  e.printStackTrace();
	}
  }
}
  
  
  
