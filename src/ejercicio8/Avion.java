package ejercicio8;

public class Avion {
	private static final int FILAS = 16;
	private static final int ASIENTOS_X_FILA = 6;
	private String marca;
	private Asiento[][] asientos;
	
	public int asientosPorEstadoConVentanilla(Estado estado) {
		int acu = 0;
		/*cont += cantAsientosPorEstadoEnColumna(0, estado);
		cont += cantAsientosPorEstadoEnColumna(ASIENTOS_X_FILA - 1, estado);*/
		
		for (int i = 0; i < ASIENTOS_X_FILA; i += ASIENTOS_X_FILA-1 ) {
			acu += cantAsientosPorEstadoEnColumna(i, estado);
		}
		
		return acu;
	}

	private int cantAsientosPorEstadoEnColumna(int idxColumna, Estado estado) {
		int cont = 0;
		for (int f = 0; f < asientos.length; f++) {
			if( asientos[f][idxColumna].tieneEstado(estado) ) {
				cont++;
			}
		}
		return cont;
	}

	public boolean reservarAsiento(int nroAsiento) {	
		boolean sePudo;
		int idxFila = (nroAsiento - 1) / ASIENTOS_X_FILA;
		int idxColumna = (nroAsiento - 1) % ASIENTOS_X_FILA;
		sePudo = asientos[idxFila][idxColumna].reservar();
		return sePudo;
	}
}