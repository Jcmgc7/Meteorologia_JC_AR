package controlador;
import java.util.ArrayList;

import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import vista.Vista;
import modelo.City;
import modelo.Ciudad;
import modelo.modeloC;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import vista.Vista;


public class Controlador implements ActionListener{

    
	static Scanner sc = new Scanner (System.in);
	
	static ArrayList<String> nombres = new ArrayList();
	static ArrayList<modeloC> CiudadesTem = new ArrayList();
	Vista vista = new Vista();
	
	
	
	public Controlador (Vista frame) {
		vista = frame;
		this.vista.santiago.addActionListener(this);
		this.vista.oviedo.addActionListener(this);
		this.vista.santander.addActionListener(this);
		this.vista.pais_vasco.addActionListener(this);
		this.vista.pamplona.addActionListener(this);
		this.vista.huesca.addActionListener(this);
		this.vista.zaragoza.addActionListener(this);
		this.vista.tarragona.addActionListener(this);
		this.vista.barcelona.addActionListener(this);
		this.vista.gerona.addActionListener(this);
		this.vista.logrono.addActionListener(this);
		this.vista.leon.addActionListener(this);
		this.vista.burgos.addActionListener(this);
		this.vista.valladolid.addActionListener(this);
		this.vista.salamanca.addActionListener(this);
		this.vista.madrid.addActionListener(this);
		this.vista.toledo.addActionListener(this);
		this.vista.ciudad_real.addActionListener(this);
		this.vista.albacete.addActionListener(this);
		this.vista.valencia.addActionListener(this);
		this.vista.alacant.addActionListener(this);
		this.vista.cartago.addActionListener(this);
		this.vista.caceres.addActionListener(this);
		this.vista.merida.addActionListener(this);
		this.vista.palma.addActionListener(this);
		this.vista.santa_cruz.addActionListener(this);
		this.vista.palma_canaria.addActionListener(this);
		this.vista.ceuta.addActionListener(this);
		this.vista.melilla.addActionListener(this);
		this.vista.cordoba.addActionListener(this);
		this.vista.cadiz.addActionListener(this);
		this.vista.sevilla.addActionListener(this);
		this.vista.inicio.addActionListener(this);
		
    }
    
	
	public static String letter(ArrayList<modeloC> CiudadesTem, String nombre) {
		String nom = null;
		for (int i = 0; i<CiudadesTem.size();i++) {
			if (CiudadesTem.get(i).getNombre().equals(nombre)) {
				nom = CiudadesTem.get(i).getNombre();
			}
		}
		
		return nom;
	}
	    public static void recuperarInfo(ArrayList<City> Nom_ciudad, int dia) {
	    	try {
            	for(int i = 0; i<Nom_ciudad.size();i++){
            		String ciuTem = fetchDataFromURL(Nom_ciudad.get(i).getUrl());
                	movimientoInfo(ciuTem, Nom_ciudad.get(i).getNombre(),dia);
    					
                	}
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
	    }
	    public static void  movimientoInfo(String info, String nombre, int dia){
	    	
	    	Gson city = new Gson();
            JsonObject objeto = city.fromJson(info, JsonObject.class);

            String tiempo = objeto.getAsJsonObject("city").getAsJsonObject("forecast").getAsJsonArray("forecastDay").get(dia).getAsJsonObject().get("weather").getAsString();
            String max = objeto.getAsJsonObject("city").getAsJsonObject("forecast").getAsJsonArray("forecastDay").get(dia).getAsJsonObject().get("maxTemp").getAsString();
            String min = objeto.getAsJsonObject("city").getAsJsonObject("forecast").getAsJsonArray("forecastDay").get(dia).getAsJsonObject().get("minTemp").getAsString();
            
            agregarCiudad(nombre,tiempo,max,min);
            
     
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
	    	ciudad.add(new City("sevilla")); ciudad.add(new City("logrono")); 
	    	ciudad.add(new City("valencia")); ciudad.add(new City("barcelona")); ciudad.add(new City("alicante")); 
	    	ciudad.add(new City("cadiz")); ciudad.add(new City("gerona")); ciudad.add(new City("palma")); 
	    	ciudad.add(new City("cordoba")); ciudad.add(new City("tarragona")); ciudad.add(new City("santa_cruz_tenerife")); 
	    	ciudad.add(new City("cartagena")); ciudad.add(new City("leon")); ciudad.add(new City("santa_cruz_palma")); 
	    	ciudad.add(new City("santiago")); ciudad.add(new City("valladolid")); ciudad.add(new City("ceuta")); 
	    	
			
			
		}
	    public static String temperature(ArrayList<modeloC> CiudadesTem, int ciudad) {
	    	String icono = null;
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Soleado")) {
	    		icono = "src/img/dom.png";
	    	}
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Parcialmente nuboso")) {
	    		icono = "src/img/soleado.png";
	    	}
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Nuboso")) {
	    		icono = "src/img/dia_nublado.png";
	    	}
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Lluvia")|| CiudadesTem.get(ciudad).getTiempo().equals("Lluvia débil")) {
	    		icono = "src/img/lluvioso.png";
	    	}
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Niebla")) {
	    		icono = "src/img/dom.png";
	    	}
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Nieve")) {
	    		icono = "src/img/nieve.png";
	    	}
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Ventoso")) {
	    		icono = "src/img/viento.png";
	    	}
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Chubascos") || CiudadesTem.get(ciudad).getTiempo().equals("Chubascos dispersos")) {
	    		icono = "src/img/chuvasco.png";
	    	}
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Tormentas")) {
	    		icono = "src/img/tormenta.png";
	    	}
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Granizo")) {
	    		icono = "src/img/granizo.png";
	    	}
	    	if (CiudadesTem.get(ciudad).getTiempo().equals("Muy nuboso") || CiudadesTem.get(ciudad).getTiempo().equals("Cubierto")) {
	    		icono = "src/img/nubes.png";
	    	}
	    	return icono;
	    }
	    static void agregarCiudad(String nombre, String temp, String max, String min) {
	        CiudadesTem.add(new modeloC(nombre,temp,max,min));
	    }
	    
	    
	    @Override
		public void actionPerformed(ActionEvent e) {
			
	    	ArrayList<City> Nom_ciudad = new ArrayList(); 
        	rellenoCiudades(Nom_ciudad);
        	
        	 try {
		        	Properties configuracion = new Properties();
		            configuracion.load(new FileReader("src/controlador/config.properties"));
		            Set<String> ciudades = configuracion.stringPropertyNames();
		            
		            for (int i = 0; i<Nom_ciudad.size();i++) {
		            
		            String fichero = configuracion.getProperty(Nom_ciudad.get(i).getNombre());
		            Nom_ciudad.get(i).setUrl(fichero);
		            
		            String ciuTem = fetchDataFromURL(fichero);
		            
		           }
	    	 } 
        	 catch (IOException i) {
		            i.printStackTrace();
		        }
        	   
        	
        	
        	if(e.getSource() == this.vista.inicio) {
        	
        		LocalDate fecha = LocalDate.now();
        		int dia = 0;
        		CiudadesTem.clear();
        		vista.Hasbulla.setVisible(false);
				vista.escalera.setVisible(false);
				vista.CLM.setVisible(false);
				vista.andalu.setVisible(false);
				vista.CYL.setVisible(false);
				vista.Arag.setVisible(false);
				vista.cataluna.setVisible(false);
				vista.euskadi.setVisible(false);
				
        		
   	    		if (vista.listaDias.getSelectedItem().toString().equals(fecha.toString())) {
   	    			dia = 0;
   	    		}
   	    		if (vista.listaDias.getSelectedItem().toString().equals(fecha.plusDays(1).toString())) {
   	    			dia = 1;
   	    		}
   	    		if (vista.listaDias.getSelectedItem().toString().equals(fecha.plusDays(2).toString())) {
   	    			dia = 2;
   	    		}
   	    		if (vista.listaDias.getSelectedItem().toString().equals(fecha.plusDays(3).toString())) {
   	    			dia = 3;
   	    		}
   	    		if (vista.listaDias.getSelectedItem().toString().equals(fecha.plusDays(4).toString())) {
   	    			dia = 4;
   	    		}
   	    		
   	    		
   	    		recuperarInfo(Nom_ciudad, dia);
   	    		
        		
        		for (int i=0;i<CiudadesTem.size();i++) {
        			
        			
        			if(vista.listaComunidad.getSelectedItem().toString().equals("Castilla-La Mancha")) {
       	    			vista.CLM.setVisible(true);
       	    			if (CiudadesTem.get(i).getNombre().equals("ciudad_real")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.ciu.setIcon(new ImageIcon(icono));
       	    				vista.ciu_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.ciu_1.setForeground(Color.BLUE);
       	    				vista.ciu_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.ciu_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("toledo")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.toletum.setIcon(new ImageIcon(icono));
       	    				vista.toletum_3.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.toletum_3.setForeground(Color.BLUE);
       	    				vista.toletum_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.toletum_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("albacete")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.alba.setIcon(new ImageIcon(icono));
       	    				vista.alba_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.alba_1.setForeground(Color.BLUE);
       	    				vista.alba_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.alba_2.setForeground(Color.RED);
       	    			}
       	    		}
        			if(vista.listaComunidad.getSelectedItem().toString().equals("Cataluna")) {
       	    			vista.cataluna.setVisible(true);
       	    			if (CiudadesTem.get(i).getNombre().equals("barcelona")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.barca.setIcon(new ImageIcon(icono));
       	    				vista.barca_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.barca_1.setForeground(Color.BLUE);
       	    				vista.barca_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.barca_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("tarragona")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.tarraco.setIcon(new ImageIcon(icono));
       	    				vista.tarraco_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.tarraco_1.setForeground(Color.BLUE);
       	    				vista.tarraco_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.tarraco_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("gerona")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.girona.setIcon(new ImageIcon(icono));
       	    				vista.girona_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.girona_1.setForeground(Color.BLUE);
       	    				vista.girona_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.girona_2.setForeground(Color.RED);
       	    			}
       	    		}
        			if(vista.listaComunidad.getSelectedItem().toString().equals("Andalucia")) {
       	    			vista.andalu.setVisible(true);
       	    			if (CiudadesTem.get(i).getNombre().equals("cordoba")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.corduba.setIcon(new ImageIcon(icono));
       	    				vista.corduba_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.corduba_1.setForeground(Color.BLUE);
       	    				vista.corduba_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.corduba_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("sevilla")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.hispalis.setIcon(new ImageIcon(icono));
       	    				vista.hispalis_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.hispalis_1.setForeground(Color.BLUE);
       	    				vista.hispalis_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.hispalis_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("cadiz")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.gadir.setIcon(new ImageIcon(icono));
       	    				vista.gadir_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.gadir_1.setForeground(Color.BLUE);
       	    				vista.gadir_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.gadir_2.setForeground(Color.RED);
       	    			}
       	    		}
        			if(vista.listaComunidad.getSelectedItem().toString().equals("Aragon")) {
       	    			vista.Arag.setVisible(true);
       	    			if (CiudadesTem.get(i).getNombre().equals("huesca")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.osca.setIcon(new ImageIcon(icono));
       	    				vista.osca_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.osca_1.setForeground(Color.BLUE);
       	    				vista.osca_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.osca_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("zaragoza")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.saraqusta.setIcon(new ImageIcon(icono));
       	    				vista.saraqusta_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.saraqusta_1.setForeground(Color.BLUE);
       	    				vista.saraqusta_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.saraqusta_2.setForeground(Color.RED);
       	    			}
       	    		}
        			if(vista.listaComunidad.getSelectedItem().toString().equals("Pais_Vasco")) {
       	    			vista.euskadi.setVisible(true);
       	    			if (CiudadesTem.get(i).getNombre().equals("vitoria")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.gasteiz.setIcon(new ImageIcon(icono));
       	    				vista.gasteiz_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.gasteiz_1.setForeground(Color.BLUE);
       	    				vista.gasteiz_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.gasteiz_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("san_sebastian")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.sanctus.setIcon(new ImageIcon(icono));
       	    				vista.sanctus_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.sanctus_1.setForeground(Color.BLUE);
       	    				vista.sanctus_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.sanctus_2.setForeground(Color.RED);
       	    			}
       	    		}
        			if(vista.listaComunidad.getSelectedItem().toString().equals("Castilla y Leon")) {
       	    			vista.CYL.setVisible(true);
       	    			if (CiudadesTem.get(i).getNombre().equals("valladolid")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.Balad.setIcon(new ImageIcon(icono));
       	    				vista.Balad_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.Balad_1.setForeground(Color.BLUE);
       	    				vista.Balad_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.Balad_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("burgos")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.numantia.setIcon(new ImageIcon(icono));
       	    				vista.numantia_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.numantia_1.setForeground(Color.BLUE);
       	    				vista.numantia_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.numantia_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("salamanca")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.salamantica.setIcon(new ImageIcon(icono));
       	    				vista.salamantica_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.salamantica_1.setForeground(Color.BLUE);
       	    				vista.salamantica_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.salamantica_2.setForeground(Color.RED);
       	    			}
       	    			if (CiudadesTem.get(i).getNombre().equals("leon")) {
       	    				String icono = temperature(CiudadesTem, i);
       	    				vista.Legio.setIcon(new ImageIcon(icono));
       	    				vista.Legio_1.setText(CiudadesTem.get(i).getTemMax()+"Cº");
       	    				vista.Legio_1.setForeground(Color.BLUE);
       	    				vista.Legio_2.setText(CiudadesTem.get(i).getTemMin()+"Cº");
       	    				vista.Legio_2.setForeground(Color.RED);
       	    			}
       	    		}
        			
        			
        			if (CiudadesTem.get(i).getNombre().equals("barcelona")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.barcelona.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("tarragona")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.tarragona.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("gerona")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.gerona.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("santiago")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.santiago.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("oviedo")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.oviedo.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("santander")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.santander.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("san_sebastian")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.pais_vasco.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("pamplona")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.pamplona.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("logrono")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.logrono.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("huesca")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.huesca.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("zaragoza")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.zaragoza.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("valladolid")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.valladolid.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("leon")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.leon.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("burgos")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.burgos.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("salamanca")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.salamanca.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("madrid")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.madrid.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("toledo")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.toledo.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("ciudad_real")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.ciudad_real.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("albacete")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.albacete.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("cartagena")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.cartago.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("valencia")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.valencia.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("alicante")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.alacant.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("merida")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.merida.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("caceres")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.caceres.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("cordoba")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.cordoba.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("sevilla")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.sevilla.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("cadiz")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.cadiz.setIcon(new ImageIcon(icono));
    			}
        			
        			if (CiudadesTem.get(i).getNombre().equals("palma")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.palma.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("santa_cruz_tenerife")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.santa_cruz.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("santa_cruz_palma")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.palma_canaria.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("ceuta")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.ceuta.setIcon(new ImageIcon(icono));
    			}
        			if (CiudadesTem.get(i).getNombre().equals("melilla")) {
        				String icono = temperature(CiudadesTem, i);
        				vista.melilla.setIcon(new ImageIcon(icono));
    			}
        		}
        	}
        	
			if(e.getSource() == this.vista.santiago) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("santiago")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(true);
						vista.Hasbulla.setBounds(1, 10, 136, 136);
						vista.escalera.setBounds(-87, 39, 782, 220);
					}
				}
			}
			if(e.getSource() == this.vista.oviedo) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("oviedo")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(true);
						vista.Hasbulla.setBounds(124, -11, 136, 136);
						vista.escalera.setBounds(34, 23, 782, 220);
					}
				}
			}if(e.getSource() == this.vista.pamplona) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("pamplona")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(true);
						vista.Hasbulla.setBounds(318, 23, 136, 136);
						vista.escalera.setBounds(231, 71, 782, 220);
					}
				}
			}if(e.getSource() == this.vista.santander) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("santander")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(true);
						vista.Hasbulla.setBounds(211, -12, 136, 136);
						vista.escalera.setBounds(117, 30, 782, 220);
					}
				}
			}if(e.getSource() == this.vista.pais_vasco) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("vitoria")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(true);
						vista.Hasbulla.setBounds(258, 23, 136, 136);
						vista.escalera.setBounds(167, 71, 782, 220);
					}
				}
			}if(e.getSource() == this.vista.huesca) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("huesca")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(true);
						vista.Hasbulla.setBounds(387, 75, 136, 136);
						vista.escalera.setBounds(302, 97, 782, 220);
					}
				}
			}if(e.getSource() == this.vista.zaragoza) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("zaragoza")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(354, 92, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.tarragona) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("tarragona")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(419, 121, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.barcelona) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("barcelona")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(true);
						vista.Hasbulla.setBounds(487, 96, 136, 136);
						vista.escalera.setBounds(401, 137, 782, 220);
						
						
					}
				}
			}if(e.getSource() == this.vista.gerona) {
					
					vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
					for (int i = 0; i<CiudadesTem.size();i++) {
						
						if (CiudadesTem.get(i).getNombre().equals("gerona")) {
							vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
							vista.tiempo_E.setForeground(Color.BLACK);
							vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
							vista.temperatura_Max.setForeground(new Color(255, 0, 0));
							vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
							vista.temperatura_Min.setForeground(new Color(30, 144, 255));
							vista.nombre.setText(CiudadesTem.get(i).getNombre());
							vista.nombre.setForeground(Color.BLACK);
							vista.reproducirSonido2("src/sound/hasbu.aiff");
							vista.Hasbulla.setVisible(true);
							vista.escalera.setVisible(true);
							vista.Hasbulla.setBounds(516, 56, 136, 136);
							vista.escalera.setBounds(432, 92, 782, 220);
							
						}
					}
				
			}if(e.getSource() == this.vista.logrono) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("logrono")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(278, 56, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.leon) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("leon")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(114, 43, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.valladolid) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("valladolid")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(178, 92, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.salamanca) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("salamanca")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(104, 137, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.burgos) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("burgos")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(235, 55, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.madrid) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("madrid")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(224, 170, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.toledo) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("toledo")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(224, 221, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.ciudad_real) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("ciudad_real")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(208, 261, 136, 136);
					}
					
				}
			}if(e.getSource() == this.vista.albacete) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("albacete")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(306, 260, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.valencia) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("valencia")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(377, 231, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.alacant) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("alicante")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(400, 298, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.caceres) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("caceres")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(114, 201, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.merida) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("merida")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(91, 260, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.sevilla) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("sevilla")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(117, 350, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.cadiz) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("cadiz")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(117, 408, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.cordoba) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("cordoba")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(163, 318, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.cartago) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("cartagena")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(334, 318, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.palma) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("palma")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(490, 221, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.santa_cruz) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("santa_cruz_tenerife")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(411, 429, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.palma_canaria) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("santa_cruz_palma")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(Color.BLACK);
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(467, 440, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.ceuta) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("ceuta")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(135, 439, 136, 136);
					}
				}
			}if(e.getSource() == this.vista.melilla) {
				
				vista.tiempo_E.setText(CiudadesTem.get(0).getTiempo());
				for (int i = 0; i<CiudadesTem.size();i++) {
					
					if (CiudadesTem.get(i).getNombre().equals("melilla")) {
						vista.tiempo_E.setText(CiudadesTem.get(i).getTiempo());
						vista.tiempo_E.setForeground(Color.BLACK);
						vista.temperatura_Max.setText(CiudadesTem.get(i).getTemMax());
						vista.temperatura_Max.setForeground(new Color(255, 0, 0));
						vista.temperatura_Min.setText(CiudadesTem.get(i).getTemMin());
						vista.temperatura_Min.setForeground(new Color(30, 144, 255));
						vista.nombre.setText(CiudadesTem.get(i).getNombre());
						vista.nombre.setForeground(Color.BLACK);
						vista.reproducirSonido2("src/sound/hasbu.aiff");
						vista.Hasbulla.setVisible(true);
						vista.escalera.setVisible(false);
						vista.Hasbulla.setBounds(281, 434, 136, 136);
						
					}
				}
			}
			
			 
			}	
	    
			
	}
	
