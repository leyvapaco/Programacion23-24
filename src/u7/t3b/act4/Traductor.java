package u7.t3b.act4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Traductor {
	
	HashMap<String,String> tabla;
	
	
	public Traductor(String fich) {
		
		try {
			this.tabla = new HashMap<String, String>();
			BufferedReader bf = new BufferedReader(new FileReader ("C:\\pruebaficheros\\"+fich+".txt"));
			
			String linea = bf.readLine();
			
			while(linea!=null) {
				
				String espanyol= (linea.substring(0,linea.indexOf(",")));
				String english= (linea.substring(linea.indexOf(",")+2, linea.length()));
				
				tabla.put(espanyol, english);
				linea= bf.readLine();
			}
			bf.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
			}
	}

	
	public String traduce(String a) {
		String traducido="";
		if (this.tabla.get(a)==null)
			traducido= "La palabra '"+a+"' no se encuentra en el diccionario";
		else
			traducido=this.tabla.get(a);
		return traducido;
	}
}
