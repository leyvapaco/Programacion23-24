package u8.ejercicio;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ProcesaXML_completar {

    public static void main(String[] args) {

        try {

            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\leyva\\eclipse-workspace\\daw1\\src\\u8\\ejercicio\\mascotas.xml"));

            //Cojo el elemento (etiqueta) raíz
            Element root = doc.getDocumentElement();

            //Obtengo todos los nodos hijos del elemento raíz
            NodeList nl = root.getChildNodes();
            
            ArrayList<Mascota> listaMascotas=new ArrayList<>();
            ArrayList<Propietario> listaPropietarios=new ArrayList<>();
            

            for (int i = 0; i < nl.getLength(); i++) {

            	// Adaptar arriba la ruta del fichero XML
            	// Completar aquí el código que falta

            }

            System.out.println("\n"+listaMascotas);
            System.out.println("\n"+listaPropietarios);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
