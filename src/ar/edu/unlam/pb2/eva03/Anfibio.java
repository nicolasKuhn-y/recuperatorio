package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Terrestre implements Iacuatica {

	Double velocidad = 0.0;
	Double profundidad = 0.0;

	public Anfibio(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad = 0.0;
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

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

}
