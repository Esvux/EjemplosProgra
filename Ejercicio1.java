// 1) Declarar la clase

// 2) Import para usar Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String []args) {
		// 3) Imprimir mensaje en pantalla
		System.out.println("Hola, ingrese un número:");

		// 4) Leer el valor desde el teclado
		Scanner read = new Scanner(System.in);
		int numero = read.nextInt();

		// 5) Verificar si el número es par
		if (numero % 2 == 0) {
			// Esto se ejecuta si la condición se cumple
			System.out.println("ES PAR");
		} else {
			// De lo contrario se ejecuta esto
			System.out.println("ES IMPAR");
		}
	}

}
