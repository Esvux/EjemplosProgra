import java.util.Scanner;

public class Arreglos03 {
	
	public static void main(String[] args) {
		//Inicialización con valores
		// 0 -> Raúl
		// 1 -> Ricardo
		// 2 -> Domingo
		// 3 -> Pablo
		// 4 -> Jorge
		int[] notas = {90, 60, 65, 60, 70};
		String[] alumnos = {"Raúl","Ricardo","Domingo","Pablo","Jorge"};
		//Mostrar "'nombre' piensa que va a sacar 'nota' en su examen"
		for (int indice=0; indice<5; indice++) {
			System.out.println(alumnos[indice] + " tiene la esperanza de sacar " + notas[indice] + " en su segundo examen parcial.");
		}
	}

}