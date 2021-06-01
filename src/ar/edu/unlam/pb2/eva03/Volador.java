package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public abstract class Volador extends Vehiculo {
	
	private Double altura;

	public Volador(Integer codigo, String nombre) {
		super(codigo, nombre, TipoDeBatalla.AEREA);
		this.altura = 0.0;
		
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
