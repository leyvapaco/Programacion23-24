package u8.dom2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.StringTokenizer;

public class FicheroToXML {
    public static void main(String[] args) {
        FileReader entr=null;
        BufferedReader br;
        String linea;
        String dato;
        Element con;

        try {
            entr = new FileReader("C:\\Users\\leyva\\eclipse-workspace\\daw1\\src\\u8\\dom2\\datos.txt");
            br = new BufferedReader(entr);

            DocumentBuilderFactory fac= DocumentBuilderFactory.newInstance();
            DocumentBuilder db=fac.newDocumentBuilder();
            Document doc=db.newDocument();
            Element root=doc.createElement("Contribuyentes");
            doc.appendChild(root);

            // Lectura del fichero
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

                int numTokens = 0;
                StringTokenizer st = new StringTokenizer(linea);

                // bucle por todas las palabras
                while (st.hasMoreTokens()) {
                    dato = st.nextToken();
                    numTokens++;
                    System.out.println("    Dato " + numTokens + " es: " + dato);
                    if (st.hasMoreTokens()) {
                        con = doc.createElement("nombre");
                    }else {
                        con = doc.createElement("apellido");
                    }

                    con.setTextContent(dato);
                    root.appendChild(con);

                }
                TransformerFactory tf=TransformerFactory.newInstance();
                Transformer t=tf.newTransformer();

                t.setOutputProperty( OutputKeys.INDENT, "yes" );
                t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
                t.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
                t.setOutputProperty( OutputKeys.METHOD, "xml" );
                t.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

                DOMSource ds=new DOMSource(root);
                File nuevoPersonas = new File("C:\\Users\\leyva\\eclipse-workspace\\daw1\\src\\u8\\dom2\\Contribuyentes.xml");
                StreamResult destino = new StreamResult(nuevoPersonas);

                t.transform(ds,destino);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (entr != null) {
                    entr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
    }
}
