package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	private String nombre;
	private ArrayList<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla(String nombre,TipoDeBatalla tipo, Double latitud, Double longitud ) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.vehiculosEnLaBatalla = new ArrayList<Vehiculo>();
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public void enviarVehiculoALaBatalla(Vehiculo vehiculosALaBatalla) {
		this.vehiculosEnLaBatalla.add(vehiculosALaBatalla);
	}
	
}
