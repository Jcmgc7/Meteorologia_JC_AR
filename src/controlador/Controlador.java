package controlador;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Controlador {


	    public static void main(String[] args) {
	        try {
	            // URL de la ciudad de ejemplo
	            String cityURL = "https://worldweather.wmo.int/es/json/1240_es.xml";

	            // Obtener datos climáticos de la ciudad
	            String weatherData = fetchDataFromURL(cityURL);

	            // Parsear la información y guardarla como JSON
	            ObjectMapper objectMapper = new ObjectMapper();
	            objectMapper.writeValue(new File("city_weather.json"), objectMapper.readValue(weatherData, Object.class));
	            System.out.println("Datos climáticos guardados en city_weather.json");
	            
	            System.out.println(weatherData);
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
	}

