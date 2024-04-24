package u8.dom2;

import org.w3c.dom.Document;

// Genera los dos primeros nodos
// Clona el segundo nodo, modifica el nombre a Italiano, e inserta el nuevo nodo en segunda posición
// Clona el último nodo

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;


public class EjercicioAsignaturas {
    public static void main(String[] args) {
        Asignatura as1 = new Asignatura("Inglés", 4, "Peter");
        Asignatura as2 = new Asignatura("Alemán", 2, "Anke");
        Asignatura as3 = new Asignatura("Italiano", 2, "Gianluca");
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element raiz = doc.createElement("asignaturas");
            doc.appendChild(raiz);

            Element asig1 = doc.createElement("asignatura");
            Element nomAsig1 = doc.createElement("nombre");
            Element nomProf1 = doc.createElement("profesor");

            nomAsig1.setTextContent(as1.getNombre());
            nomProf1.setTextContent(as1.getProfesor());
            asig1.appendChild(nomAsig1);
            asig1.appendChild(nomProf1);
            raiz.appendChild(asig1);

            Element asig2 = doc.createElement("asignatura");
            Element nomAsig2 = doc.createElement("nombre");
            Element nomProf2 = doc.createElement("profesor");

            nomAsig2.setTextContent(as2.getNombre());
            nomProf2.setTextContent(as2.getProfesor());
            asig2.appendChild(nomAsig2);
            asig2.appendChild(nomProf2);
            raiz.appendChild(asig2);

            Element clon=(Element) asig2.cloneNode(true);
            clon.getFirstChild().setTextContent(as3.getNombre());
            raiz.insertBefore(clon,asig2);

            NodeList nodos=doc.getElementsByTagName("asignatura");
            Node ultimo=nodos.item(nodos.getLength()-1);
            Element ultimoclon= (Element) ultimo.cloneNode(true);
            raiz.appendChild(ultimoclon);

            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer transformer = tff.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource(raiz);
            File fichero = new File("C:\\Users\\leyva\\eclipse-workspace\\daw1\\src\\u8\\dom2\\asignaturas.xml");
            StreamResult salida = new StreamResult(fichero);

            transformer.transform(origen, salida);


        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }
}
