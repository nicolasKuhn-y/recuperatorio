package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public abstract class Vehiculo {

	private String nombre;
	private Integer codigo;
	private TipoDeBatalla tipoVehiculo;

	public Vehiculo(Integer codigo, String nombre, TipoDeBatalla tipoVehiculo) {
		this.setCodigo(codigo);
		this.nombre = nombre;
		this.tipoVehiculo = tipoVehiculo;
	}

	public TipoDeBatalla getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoDeBatalla tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Boolean estaAptoParaBatalla(TipoDeBatalla tipoVehiculo, TipoDeBatalla tipoBatalla) {
		return tipoVehiculo.equals(tipoBatalla);
	}

}
