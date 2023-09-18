package gs;

import java.util.List;

public class Torneo extends DatoTabular{
	
	private String codigo;
	private String nombre;
	private String ciudad;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Torneo(String codigo, String nombre, String ciudad, List<String> cabeceras) {
		super(cabeceras);
		this.codigo = codigo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		
		//añadir los datos a lista de valores
		valores.add(codigo);
		valores.add(nombre);
		valores.add(ciudad);
	}
	@Override
	public String toString() {
		return "Torneo [codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}
	
	

}
