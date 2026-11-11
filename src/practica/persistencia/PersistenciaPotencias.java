package practica.persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import practica.mundo.Potencia;
import practica.excepciones.*;


public class PersistenciaPotencias {
	public void guardar(List<Potencia> potencias, String ruta) throws IOException, CeroException, ExpNegativoException, PotenciaException {

	    JSONArray lista = new JSONArray();                

	    for (Potencia p : potencias) {                
	        JSONObject obj = new JSONObject();           
	        obj.put("base", p.getBase());             
	        obj.put("exponente", p.getExponente());                 
	        int resultado = p.calcularPotencia();
	        obj.put("resultado", resultado);
	        lista.put(obj);                               
	    }

	    JSONObject raiz = new JSONObject();               
	    raiz.put("potencias", lista);                   

	    FileWriter escritor = new FileWriter(ruta);       
	    escritor.write(raiz.toString(4));                 
	    escritor.close();                                
	}
	
	public List<Potencia> cargar(String ruta) throws IOException{

	    String texto = Files.readString(Path.of(ruta));       

	    JSONObject raiz = new JSONObject(texto);                
	    JSONArray lista = raiz.getJSONArray("potencias");      

	    List<Potencia> potencias = new ArrayList<>();   

	    for (int i = 0; i < lista.length(); i++) {          
	        JSONObject obj = lista.getJSONObject(i);           
	        int base = obj.getInt("base");              
	        int exponente = obj.getInt("exponente");
	        potencias.add(new Potencia(base, exponente));        
	    }

	    return potencias;                                      
	}
}
