public class DemoQuinielas {

	public static void main(String[] args) {
		Partido[] resultados = new Partido[3];
		// [ null | null | null ]
		
		Partido barcaVpsv = new Partido("FC Barcelona", "PSV Eindhoven", 4, 0);
		resultados[0] = barcaVpsv;
		// [ barcaVpsv | null | null ]

		Partido liverpoolVpsg = new Partido("Liverpool FC", "PSG", 3, 2);
		resultados[1] = liverpoolVpsg;
		// [ barcaVpsv | liverpoolVpsg | null ]

		Partido valenciaVjuventus = new Partido("Valencia CF", "Juventus", 0, 2);
		resultados[2] = valenciaVjuventus;
		// [ barcaVpsv | liverpoolVpsg | valenciaVjuventus ]

		Partido[] copia = java.util.Arrays.copyOf(resultados, 3);
		for (Partido partido : copia) {
			if(partido == null) {
				continue;
			}
			System.out.println(partido);
			System.out.println(partido.golesLocal + "-" + partido.golesVisita);
			partido.golesLocal = 100;
		}

		for (Partido partido : resultados) {
			if(partido == null) {
				continue;
			}
			System.out.println(partido);
			System.out.println(partido.golesLocal + "-" + partido.golesVisita);
		}

	}

}