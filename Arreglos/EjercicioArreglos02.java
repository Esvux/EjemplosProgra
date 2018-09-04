/**
 * Hacer un programa que solicite al usuario 10 números
 * enteros, mostrar en pantalla el número que más veces
 * se repite.
 */

public class EjercicioArreglos02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];

		System.out.println("Ingresa números enteros");
		for (int i=0; i<numeros.length; i++) {
			numeros[i] = scan.nextInt();
		}

		int[] contadores = new int[numeros.length];
		for (int i=0; i<numeros.length; i++) {
			int numeroActual = numeros[i];
			boolean esElPrimero = true;
			for(int j=0; j<numeros.length; j++) {
				int recorridoActual = numeros[j];
				if(numeroActual == num) {
					contadores[i]++;
				}
			}
		}

		int mayorContador = 0;
		int indiceDelMayor = 0;
		for (int i=0; i<contadores.length; i++) {
			int contadorActual = contadores[i];
			if(contadorActual>=mayorContador) {
				mayorContador = contadorActual;
				indiceDelMayor = i;
			}
		}
		System.out.println("El número que más se repite es: " + numeros[indiceDelMayor]);
	}
	
}