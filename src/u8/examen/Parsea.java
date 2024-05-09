package u8.examen;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import com.google.gson.Gson;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parsea {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            Document doc = db.parse(new File("src/u8/examen/plantilla.xml"));
            
            mostrarJugadoresTitulares(doc);
            
            Plantilla plantilla=new Plantilla();
            
            cargarTecnicos(doc, plantilla);
            cargarJugadores(doc, plantilla);            
            System.out.println("La plantilla es:\n"+plantilla);
            
            jugadorMasCaro(doc);          
            
            generaJSON(plantilla);
            
            addTecnico (doc, "Pon aqui tu nombre", "Preparador físico");
            
            generaXml (doc);
          

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
    
    
    // Recupera de plantilla.xml los jugadores titulares y los muestra por consola
    public static void mostrarJugadoresTitulares (Document doc){
   	
        NodeList jugadores= doc.getElementsByTagName("jugador");
       
        System.out.println("TITULARES:\n");

        for (int i = 0; i < jugadores.getLength(); i++) {

            if(jugadores.item(i).getNodeType()== Node.ELEMENT_NODE){
            	Element e = (Element) jugadores.item(i);
            	if(e.getAttribute("perfil").equals("titular")) {
            		System.out.println("---Jugador---");
            		NodeList hijos = jugadores.item(i).getChildNodes();
            		for (int j = 0; j < hijos.getLength(); j++) {

                    if(hijos.item(j).getNodeType()==Node.ELEMENT_NODE){
                    	Element a = (Element) hijos.item(j);
                    	      		
                    	System.out.print(a.getTagName()+": ");
                    	System.out.print(a.getTextContent());
                    	System.out.println("");                	
                    }
                }
                System.out.println("\n");
            	}
            }
        }
    }

 
 //Carga en el objeto plantilla la relación de técnicos obtenidos de plantilla.xml
 public static void cargarTecnicos (Document doc, Plantilla plantilla){
 	
     NodeList tecnicos= doc.getElementsByTagName("tecnico");
    
     for (int i = 0; i < tecnicos.getLength(); i++) {
    	 			NodeList hijos = tecnicos.item(i).getChildNodes();
    	 	    	 
         			Tecnico t= new Tecnico();
         			t.setNombre(hijos.item(1).getTextContent());
         			t.setPuesto(hijos.item(3).getTextContent());
         			plantilla.addTecnico(t);                 	
                            
     }
   
 }

//Carga en el objeto plantilla la relación de jugadores obtenidos de plantilla.xml
 public static void cargarJugadores (Document doc, Plantilla plantilla){
 	
     NodeList jugadores= doc.getElementsByTagName("jugador");
    
     for (int i = 0; i < jugadores.getLength(); i++) {

         	NodeList hijos = jugadores.item(i).getChildNodes();
       				
    		Jugador jug= new Jugador();
         	jug.setDorsal(Integer.parseInt(hijos.item(1).getTextContent()));
         	jug.setNombre(hijos.item(3).getTextContent());
      		jug.setDemarcacion(hijos.item(5).getTextContent());
      		jug.setFicha(Double.parseDouble((hijos.item(7).getTextContent())));
      		plantilla.addJugador(jug);                 	            
           
     }
 }
 

//Muestra por consola el nombre y la ficha del jugador que tiene la ficha más alta
public static void jugadorMasCaro(Document doc){

     Double fichaActual=0.0;
     Double fichaMayor=0.0;
     String jugadorMasCaro="";

     int posCaro=0;
        
     // Calculamos la ficha mayor de todas
        
     NodeList fichas= doc.getElementsByTagName("ficha");
     for (int i = 0; i < fichas.getLength(); i++) {
    	 fichaActual=Double.parseDouble(fichas.item(i).getTextContent());
    	 if (fichaActual>fichaMayor) {
        		 fichaMayor=fichaActual;
        		 posCaro=i;
        	 } 		 
        }
     fichaMayor=Double.parseDouble(fichas.item(posCaro).getTextContent());

     jugadorMasCaro=fichas.item(posCaro).getParentNode().getChildNodes().item(3).getTextContent();
        
     System.out.println("\nEl jugador que más cobra es:\n"+jugadorMasCaro+" con una ficha de: "+fichaMayor+ " millones de euros.\n");
 }

// Genera un JSON con la información del objeto plantilla que recibe como parámetro 
public static void generaJSON (Plantilla plantilla){

	 Gson gson = new Gson();

	 String json = gson.toJson(plantilla);

	 // Muestro el resultado
	 System.out.println("El JSON es:\n"+json);

	 // Escribo el fichero
	 try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/u8/examen/plantilla.json"))) {
		 bw.write(json);
		 System.out.println("Fichero creado");
	 } catch (IOException ex) {
		 Logger.getLogger(Parsea.class.getName()).log(Level.SEVERE, null, ex);
	 }

}


//Añade un técnico al fichero XML (da igual en qué posición). No es necesario añadirlo también al objeto plantilla.  
	public static void addTecnico (Document doc,  String nombre, String puesto){
		Element root = doc.getDocumentElement();
		Element tecnico = doc.createElement("tecnico");
        
		Element nombreTecnico = doc.createElement("nombre");
		nombreTecnico.setTextContent(nombre);

		Element puestoTecnico = doc.createElement("puesto");
		puestoTecnico.setTextContent(puesto);

		tecnico.appendChild(nombreTecnico);
		tecnico.appendChild(puestoTecnico);

		root.appendChild(tecnico);     

    }   
	


	//Genera un nuevo XML a partir del doc que recibe por parámetro
    public static void generaXml (Document doc){
        try {
            
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer archivo_nuevo = tf.newTransformer();

            archivo_nuevo.setOutputProperty( OutputKeys.INDENT, "yes" );
            archivo_nuevo.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            archivo_nuevo.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            archivo_nuevo.setOutputProperty( OutputKeys.METHOD, "xml" );
            archivo_nuevo.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            Element root = doc.getDocumentElement();
            DOMSource origenDOM = new DOMSource(root);

            File nuevo_doc = new File("src/u8/examen/nueva_plantilla.xml");
            StreamResult destinoDOM = new StreamResult(nuevo_doc);

            archivo_nuevo.transform(origenDOM, destinoDOM);

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
    
}
