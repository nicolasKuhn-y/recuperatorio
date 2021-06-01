package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public abstract class Acuatico extends Vehiculo {
	
	private Double profundidad;

	public Acuatico(Integer codigo, String nombre) {
		super(codigo, nombre, TipoDeBatalla.NAVAL);
		this.profundidad = 0.0;
		
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

}
