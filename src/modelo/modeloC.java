package modelo;

public class modeloC {

	public modeloC(String nombre, String tiempo, String temMax, String temMin) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
		TemMax = temMax;
		TemMin = temMin;
	}
	private String nombre;
	private String tiempo;
	private String TemMax;
	private String TemMin;
	private String icon;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public String getTemMax() {
		return TemMax;
	}
	public void setTemMax(String temMax) {
		TemMax = temMax;
	}
	public String getTemMin() {
		return TemMin;
	}
	public void setTemMin(String temMin) {
		TemMin = temMin;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "modeloC [nombre=" + nombre + ", tiempo=" + tiempo + ", TemMax=" + TemMax + ", TemMin=" + TemMin
				+ ", icon=" + icon + "]";
	}
}
