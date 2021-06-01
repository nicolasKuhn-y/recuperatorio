package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public abstract class Terrestre extends Vehiculo {
	
	private Double velocidad;

	public Terrestre(Integer codigo, String nombre) {
		super(codigo, nombre, TipoDeBatalla.TERRESTRE);
		this.velocidad = 0.0;

	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

}
