package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {

	private ArrayList<Vehiculo> convoy;
	private ArrayList<Batalla> batallas;

	public FuerzaArmada() {
		this.convoy = new ArrayList<Vehiculo>();
		this.batallas = new ArrayList<Batalla>();

	}

	public void agregarVehiculo(Vehiculo newVehiculo) {

		
				this.convoy.add(newVehiculo);

			
		

	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public Batalla getBatalla(String string) {

		for (Batalla batalla : this.batallas) {
			if (batalla.getNombre().equals(string)) {
				return batalla;
			}
			;
		}
		return null;
	}

	public void crearBatalla(String string, TipoDeBatalla terreno, Double latitud, Double longitud) {

		Batalla batalla = new Batalla(string, terreno, latitud, longitud);
		
		this.batallas.add(batalla);
		
	}

}
