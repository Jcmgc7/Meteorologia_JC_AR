package modelo;

public class City {

	public City() {
		super();
	}
	public City(String nombre) {
		super();
		this.nombre = nombre;
		this.url = url;
	}
	private String nombre;
	private String url;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "City [nombre=" + nombre + ", url=" + url + "]";
	}
}
