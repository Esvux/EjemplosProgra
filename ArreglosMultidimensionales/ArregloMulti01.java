class ArregloMulti01 {
	
	public static void main(String[] args) {
		double[][] notasSeccionA = new double[6][2];
		//Francisco - 0
		notasSeccionA[0][0] = 8.0/10;
		notasSeccionA[0][1] = 11.4/15;
		//Ricardo - 1
		notasSeccionA[1][0] = 6.5/10;
		notasSeccionA[1][1] = 7.5/15;
		//Aniver - 2
		notasSeccionA[2][0] = 6.05/10;
		notasSeccionA[2][1] = 9.7/15;
		//Raul - 3
		notasSeccionA[3][0] = 10/10;
		notasSeccionA[3][1] = 15/15;
		//Jorge - 4
		notasSeccionA[4][0] = 8.3/10;
		notasSeccionA[4][1] = 12.4/15;
		//David - 5
		notasSeccionA[5][0] = 9.4/10;
		notasSeccionA[5][1] = 15/15;
		
		System.out.println(notasSeccionA.length);
		//Imprime 6

		System.out.println(notasSeccionA[0]);
		System.out.println(notasSeccionA[1]);
		System.out.println(notasSeccionA);
		//Imprime [D@15db9742 , [D@6d06d69c y [[D@7852e922

		System.out.println(notasSeccionA[0].length);
		//Imprime 2

		//Calcula el promedio por alumnos
		for (int indiceAlumno = 0; indiceAlumno < 6; indiceAlumno++) {
			double notaAcumulada = 0;
			for (int indiceExamen = 0; indiceExamen < 2; indiceExamen++) {
				notaAcumulada = notaAcumulada + notasSeccionA[indiceAlumno][indiceExamen];
			}
			double promedioAlumno = notaAcumulada / 2;
			System.out.println(promedioAlumno);
		}
		
		System.out.println();

		//Calcula el promedio por exámenes
		for (int indiceExamen = 0; indiceExamen < 2; indiceExamen++) {
			double notaAcumulada = 0;
			for (int indiceAlumno = 0; indiceAlumno < 6; indiceAlumno++) {
				notaAcumulada = notaAcumulada + notasSeccionA[indiceAlumno][indiceExamen];
			}
			double promedioExamen = notaAcumulada / 6;
			System.out.println(promedioExamen);
		}
	}
}