public class Partido {
	String equipoLocal;
	String equipoVisitante;
	int golesLocal;
	int golesVisita;
	
	public Partido(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisita) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisita = golesVisita;
	}

	@Override
	public String toString() {
		return this.equipoLocal + " vs " + this.equipoVisitante;
	}

}