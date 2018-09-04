/**
 * Realizar un programa que solicite al usuario
 * 10 números decimales. Al finalizar de ingresar
 * los datos, mostrar en pantalla:
 * 1) Media aritmética de todos los números (promedio)
 * 2) Los porcentajes de los números mayores o iguales
 * a la media y de los números menores a la media
 *
 * PASOS PARA LA IMPLEMENTACIÓN
 * 1) (x) import de Scanner
 * 2) (x) declarar un arreglo de double de tamaño 10
 * 3) (x) mostrar en pantalla un mensaje solicitando la info
 * 4) (x) declarar e inicializar un nuevo objeto Scanner
 * 5) (x) dentro de un ciclo (for) llenar el arreglo con los datos
 * 6) (x) calcular el promedio
 * 7) (x) contar números mayores y menores
 * 8) (x) calcular los porcentajes
 */

import java.util.Scanner;

public class EjercicioArreglos01 {

	public static void main(String[] args) {
		//Declaraciones iniciales
		double[] array = new double[3];
		Scanner read = new Scanner(System.in);
		System.out.println("Ingresa números con punto decimal:");

		//Ciclo para el ingreso de los números
		for(int i=0; i<array.length; i++) {
			double dato = read.nextDouble();
			array[i] = dato;
		}

		//Ciclo para el cálculo del promedio
		double acumulador = 0.0;
		for(double valor : array) {
			acumulador = acumulador + valor;
		}
		double media = acumulador / array.length;
		System.out.println("El promedio es: " + media);

		//Ciclo para contar los números ingresados
		//mayores o iguales y menores a la media
		int contadorDeMayores = 0;
		int contadorDeMenores = 0;
		for (double valor : array) {
			if(valor >= media) {
				contadorDeMayores++;
			} else {
				contadorDeMenores++;
			}
		}

		//Cálculo de porcentajes
		double porcentajeMayores = contadorDeMayores * 100.0 / array.length;
		double porcentajeMenores = contadorDeMenores * 100.0 / array.length;
		System.out.println(porcentajeMayores + " % de los números es mayor o igual a la media");
		System.out.println(porcentajeMenores + " % de los números es menor a la media");
	}
	
}