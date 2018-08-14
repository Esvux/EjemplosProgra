/**
 * Hacer un programa que utilizando un ciclo
 * solicite una nota (número entre 0 y 100) al
 * usuario, dichos números serán utilizados para
 * calcular el promedio. La forma de salir del
 * ciclo es ingresando un valor negativo. Si el
 * valor ingresado es mayor que 100, ignorar el
 * dato, mostrar un mensaje de error y continuar
 * la ejecución del ciclo.
 */
import java.util.Scanner;


public class CalculaPromedio {

	public static void main(String[] args) {
		double acumulator = 0.0;
		int counter = 0;
		Scanner scan = new Scanner(System.in);
		double grade;
		System.out.println("Ingresa tus notas, usa -1 para salir:");
		do {
			grade = scan.nextDouble();
			if(grade > 100) {
				System.out.println("Nota erronea");
				//continue -> Sirve para ir a la siguiente iteración
				continue; 
			}
			if (grade >= 0) {
				acumulator = acumulator + grade;
				counter = counter + 1;
			}
		} while(grade > 0);

		System.out.println("El promedio es: " + acumulator / counter);
	}

}
