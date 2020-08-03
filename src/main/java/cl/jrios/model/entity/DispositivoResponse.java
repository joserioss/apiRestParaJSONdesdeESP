package cl.jrios.model.entity;

public class DispositivoResponse {
	Integer id;
	String datos;
	String nombre;
	
	public DispositivoResponse() {}

	public String getDatos() {
		return datos;
	}
	public String getNombre() {
		return nombre;
	}
	public Integer getId() {
		return id;
	}
	
	public DispositivoResponse(Integer id, String nombre, String datos) {
		this.id = id;
		this.nombre = nombre;
		this.datos = datos;
	}
}
