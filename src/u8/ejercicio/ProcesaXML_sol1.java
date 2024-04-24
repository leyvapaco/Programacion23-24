package u8.ejercicio;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ProcesaXML_sol1 {

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

                //Es un hijo que es etiqueta (element)
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

                	Element e = (Element) nl.item(i);
                      
                    switch(e.getTagName()) {
                    	case "mascota":
                    			Mascota mascota=new Mascota();
                    			mascota.setTipo(e.getAttribute("tipo"));
                    			if (e.getAttribute("tipo").equals("perro"))
                    				mascota.setChip(e.getAttribute("chip"));
                    			
                    			NodeList nlHijosM = nl.item(i).getChildNodes();
                    			
                    			for (int j = 0; j < nlHijosM.getLength() ; j++) {
                                    Node nodo = nlHijosM.item(j);
                                    
                                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                                    	Element eh = (Element) nlHijosM.item(j);
                                    	switch(eh.getTagName()) {
                                    		case "nombre":
                                    			mascota.setNombre(eh.getTextContent());
                                    		break;
                                    		case "propietario":
                                    			mascota.setPropietario(eh.getTextContent());
                                    		break;
                                    	}
                                    }
                    			}
                    			listaMascotas.add(mascota);
                    		break;
                    	case "propietario":
                    			Propietario propietario= new Propietario();
                    			NodeList nlHijosP = nl.item(i).getChildNodes();
                    			for (int j = 0; j < nlHijosP.getLength() ; j++) {
                                    Node nodo = nlHijosP.item(j);
                                   
                                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                                    	Element eh = (Element) nlHijosP.item(j);
                                    	switch(eh.getTagName()) {
                                    		case "nombre":
                                    			propietario.setNombre(eh.getTextContent());
                                    		break;
                                    		case "dni":
                                    			propietario.setDni(eh.getTextContent());
                                    		break;
                                    	}
                                    }
                    			}
                    			listaPropietarios.add(propietario);
                    	break;
                    	
                    }

                } 

            }

            System.out.println("\n"+listaMascotas);
            System.out.println("\n"+listaPropietarios);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
