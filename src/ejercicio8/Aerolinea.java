package ejercicio8;

import java.util.ArrayList;

public class Aerolinea {
	private ArrayList<Reserva> reservas;
	private Avion elAvion;
	
	public void asignar() {
		for (Reserva reserva : reservas) {
			elAvion.reservarAsiento(reserva.getNroAsiento());
		}
	}
}
