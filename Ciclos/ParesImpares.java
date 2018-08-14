/**
 * Hacer un programa que solicite al usuario un número.
 * dicho número será el límite superior de un conteo
 * regresivo que mostrará en pantalla solamente los
 * números impares. REQUISITO usar ciclo while.
 */
import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el límite superior:");
		int limite = scan.nextInt();

		while(limite > 0) {
			if(limite%2 != 0) {
				System.out.println(limite);
			}
			limite--;
		}

	}

}
