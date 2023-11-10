package controlador;
import java.util.ArrayList;
import java.util.List;
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
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import modelo.City;
import modelo.Ciudad;
public class Controlador {

	static Scanner sc = new Scanner (System.in);
	    public static void main(String[] args) {
	       
	        	ArrayList<City> Nom_ciudad = new ArrayList(); 
	        	rellenoCiudades(Nom_ciudad);
	        	
	        	 try {
			        	FileWriter fw = null;
			        	Properties configuracion = new Properties();
			            configuracion.load(new FileReader("src/controlador/config.properties"));
			            Set<String> ciudades = configuracion.stringPropertyNames();
			            
			            for (int i = 0; i<Nom_ciudad.size();i++) {
			            System.out.println(Nom_ciudad.get(i)+".json");
			            String fichero = configuracion.getProperty(Nom_ciudad.get(i).getNombre());
			            Nom_ciudad.get(i).setUrl(fichero);
			            
			            String ciuTem = fetchDataFromURL(fichero);
			            
			            File ficher = new File("files/"+Nom_ciudad.get(i).getNombre()+".json");
			            fw = new FileWriter(ficher);
		    			fw.write(ciuTem);
		    			fw.flush();
			            System.out.println("Datos climáticos guardados en un .json");
			           }
		    	 } catch (IOException e) {
			            e.printStackTrace();
			        }
	        	
	        	recuperarInfo(Nom_ciudad);          
	        	
	    }
	    public static void recuperarInfo(ArrayList<City> Nom_ciudad) {
	    	try {
            	System.out.println("De que ciudad se quieren recuperar los datos");
            	String nom = sc.next();
            	for(int i = 0; i<Nom_ciudad.size();i++){
            		if (Nom_ciudad.get(i).getNombre().equals(nom)) {
            			String ciuTem = fetchDataFromURL(Nom_ciudad.get(i).getUrl());
                		String info = movimientoInfo(ciuTem);
    					System.out.println(info);
                	}
            	}
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
	    }
	    public static String  movimientoInfo(String info){
	    	System.out.println("Escriba el dato que quiere recuperar");
	    	String dato = sc.next();
	    	System.out.println("Escribe el dia del que quieres recupera la info");
	    	int dia = sc.nextInt();
	    	
	    	Gson city = new Gson();
            JsonObject objeto = city.fromJson(info, JsonObject.class);
            String valor = objeto.getAsJsonObject("city").getAsJsonObject("forecast").getAsJsonArray("forecastDay").get(dia).getAsJsonObject().get(dato).getAsString();
            
            return valor;
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
	    public static void rellenoCiudades(ArrayList<City> ciudad) {
	    	
	    	ciudad.add(new City("zaragoza")); ciudad.add(new City("santander")); ciudad.add(new City("burgos")); ciudad.add(new City("melilla"));
	    	ciudad.add(new City("huesca")); ciudad.add(new City("oviedo")); ciudad.add(new City("salamanca"));
	    	ciudad.add(new City("ciudad_real")); ciudad.add(new City("san_sebastian")); ciudad.add(new City("madrid")); 
	    	ciudad.add(new City("toledo")); ciudad.add(new City("vitoria")); ciudad.add(new City("caceres")); 
	    	ciudad.add(new City("albacete")); ciudad.add(new City("pamplona")); ciudad.add(new City("merida"));
	    	ciudad.add(new City("sevilla")); ciudad.add(new City("logrono")); ciudad.add(new City("valencia")); 
	    	ciudad.add(new City("valencia")); ciudad.add(new City("barcelona")); ciudad.add(new City("alicante")); 
	    	ciudad.add(new City("cadiz")); ciudad.add(new City("gerona")); ciudad.add(new City("palma")); 
	    	ciudad.add(new City("cordoba")); ciudad.add(new City("tarragona")); ciudad.add(new City("santa_cruz_tenerife")); 
	    	ciudad.add(new City("cartagena")); ciudad.add(new City("leon")); ciudad.add(new City("santa_cruz_palma")); 
	    	ciudad.add(new City("santiago")); ciudad.add(new City("valladolid")); ciudad.add(new City("ceuta")); 
	    	
			
			
		}
	    public static void metodoTemp(ArrayList<String> ciudad) {
	    	 
	    }
	}
	
