package u9.db4o;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.io.File;

public class Ejercicio_BD_DDR_5 {

    public static void main(String[] args) {
     
        Persona p1 = new Persona("Juan", 30,  73, 1.73);
        Persona p2 = new Persona("Pepe", 30,  80, 1.73);
        Persona p3 = new Persona("Marta", 20, 90, 1.9);
        Persona p4 = new Persona("Ana", 36, 70, 1.70);
        Persona p5 = new Persona("Luisa", 30,  80, 1.73);
        
        File f = new File("personas.db4o");
        f.delete();
        
        ObjectContainer db = Db4oEmbedded.openFile(f.getAbsolutePath());
        
        db.store(p1);
        db.store(p2);
        db.store(p3);
        db.store(p4);
        db.store(p5);
        
        System.out.println("CONSULTAR:");
        Persona p = new Persona(null, 30,  0, 1.73);
        ObjectSet<Persona> result = db.queryByExample(p);
        
        while(result.hasNext()){
            System.out.println(result.next());
        }
        
        System.out.println("\nACTUALIZAMOS a Pepe de 30 a 35 años:");
        ObjectSet<Persona> result2 = db.queryByExample(p2); //Pepe
        
        while(result2.hasNext()){           
            Persona pAct = result2.next();
            
            // Actualizo el objeto
            pAct.setEdad(35);
         
            // Guardamos el objeto de nuevo, actualizandolo
            db.store(pAct);
        }
        
        //Comprobamos que el objeto ha quedado actualizado, recuperando a las personas de 35 años
        Persona q = new Persona(null, 35,  0, 0);
        ObjectSet<Persona> result3 = db.queryByExample(q);
        
        while(result3.hasNext()){
            System.out.println(result3.next());
        }     
        
        db.close();
        
    }

}
