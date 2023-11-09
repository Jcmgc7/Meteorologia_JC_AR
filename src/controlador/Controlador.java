package controlador;
import java.util.ArrayList;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Controlador {


	    public static void main(String[] args) {
	        try {
	        	FileWriter fw = null;
	        	ArrayList<String> ciudad = new ArrayList(); 
	        	rellenoCiudades(ciudad);
	            Properties configuracion = new Properties();
	            configuracion.load(new FileReader("src/controlador/config.properties"));
	            Set<String> ciudades = configuracion.stringPropertyNames();
	            for (int i = 0; i<ciudad.size();i++) {
	            System.out.println(ciudad.get(i)+".json");
	            String fichero = configuracion.getProperty(ciudad.get(i));
	            
	            
	            String ciuTem = fetchDataFromURL(fichero);
	   
	            File ficher = new File("files/"+ciudad.get(i)+".json");
	            fw = new FileWriter(ficher);
    			fw.write(ciuTem);
    			fw.flush();
	            System.out.println("Datos climáticos guardados en un .json");
	            
	            System.out.println(ciuTem);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	       
	    }

	    private static String fetchDataFromURL(String url) throws IOException {
	        URL weatherURL = new URL(url);
	        HttpURLConnection connection = (HttpURLConnection) weatherURL.openConnection();
	        connection.setRequestMethod("GET");
	        connection.connect();

	        StringBuilder result = new StringBuilder();
	        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            result.append(line);
	        }
	        reader.close();

	        return result.toString();
	    }
	    public static void rellenoCiudades(ArrayList<String> ciudad) {
	    	ciudad.add("zaragoza"); ciudad.add("santander"); ciudad.add("burgos"); ciudad.add("melilla");
	    	ciudad.add("huesca"); ciudad.add("oviedo"); ciudad.add("salamanca"); 
	    	ciudad.add("ciudad_real"); ciudad.add("san_sebastian"); ciudad.add("madrid"); 
	    	ciudad.add("toledo"); ciudad.add("vitoria"); ciudad.add("caceres"); 
	    	ciudad.add("albacete"); ciudad.add("pamplona"); ciudad.add("merida"); 
	    	ciudad.add("sevilla"); ciudad.add("logrono"); ciudad.add("valencia"); 
	    	ciudad.add("granada"); ciudad.add("barcelona"); ciudad.add("alicante"); 
	    	ciudad.add("cadiz"); ciudad.add("gerona"); ciudad.add("palma"); 
	    	ciudad.add("cordoba"); ciudad.add("tarragona"); ciudad.add("santa_cruz_tenerife"); 
	    	ciudad.add("cartagena"); ciudad.add("leon"); ciudad.add("santa_cruz_palma"); 
	    	ciudad.add("santiago"); ciudad.add("valladolid"); ciudad.add("ceuta"); 
	    	
			
			
		}
	}
	
