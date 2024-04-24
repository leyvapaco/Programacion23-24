package u8.dom;

import org.w3c.dom.*;

//Modificar el programa anterior para que recorra cada uno de los hijos de persona y escriba
// las etiquetas y sus textos asociados.

import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

//Modifica EntendiendoNodos para que recorra, para cada persona, sus nodos hijos indicando para
// cada uno de ellos la etiqueta y el contenido (texto) asociado

public class EntendiendoNodos2 {
	
    public static void main(String[] args) {
        try {

            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("personasXML.xml"));

            //Número de Nodos de todo el documento - 1
            System.out.println("Nodos hijos de todo el Documento:"+doc.getChildNodes().getLength());

            //Obtengo el nodo raíz
            Element root = doc.getDocumentElement();

            //Número de nodos hijos del elemento raíz
            System.out.println("Nodos hijos del elemento raíz:"+root.getChildNodes().getLength()+"!!!!!");

            //¿Cómo puede ser 10?
            NodeList nl = root.getChildNodes();

            System.out.println("Información de los Nodos");
                     
  
            for (int i = 0; i < nl.getLength() ; i++) {
                System.out.println("Tipo del Nodo:"+nl.item(i).getNodeType());
                
              
                NodeList nl2 = nl.item(i).getChildNodes();
                
                for (int j = 0; j < nl2.getLength() ; j++) {
                	System.out.println("\tHijo: "+(j+1));
                	System.out.println("\tTipo del Nodo:"+nl2.item(j).getNodeType());
                	
                	if (nl2.item(j).getNodeType() == Node.ELEMENT_NODE) { 
                		Element el = (Element) nl2.item(j);
                		System.out.println("\tEtiqueta del Nodo:"+el.getTagName());
                	
                	}
                	
                	System.out.println("\tContenido del Nodo:"+nl2.item(j).getTextContent());
                	
                    System.out.println("\t---------------------");
                }	
                
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }

    }
}