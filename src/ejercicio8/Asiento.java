package ejercicio8;

public class Asiento {
	private int numero;
	private Estado estado;
	
	public boolean reservar() {
		boolean sePuede = estado == Estado.LIBRE;
		if (sePuede) {
			estado = Estado.OCUPADO;
		}
		return sePuede;
	}

	public boolean tieneEstado(Estado estado) {
		return this.estado == estado;
	}
	
}
