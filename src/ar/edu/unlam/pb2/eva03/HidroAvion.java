package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class HidroAvion extends Volador implements Iacuatica {

	private Double profundidad = 0.0;
	private Double altura = 0.0;

	public HidroAvion(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.altura = 0.0;
		this.profundidad = 0.0;

	}

	@Override
	public Double getProfundidad() {

		return profundidad;
	}

	@Override
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;

	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Boolean estaAptoParaBatalla(TipoDeBatalla tipoVehiculo, TipoDeBatalla tipoBatalla) {
		return tipoVehiculo.equals(tipoBatalla) || tipoBatalla.equals(TipoDeBatalla.NAVAL);
	}

}
