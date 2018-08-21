/**
 * Mostrar los números pares, donde el número inicial
 * y el límite son ingresados por el usuario. 
 * Si los valores ingresados por el usuario son 
 * incoherentes solicitarlos nuevamente hasta que 
 * los valores ingresados sean correctos.
 */
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Hola usuario");
		int inicio;
		int fin;
		do {
			System.out.println("Ingresa el número inicial:");
			inicio = scan.nextInt();
			System.out.println("Ahora ingresa el número final:");
			fin = scan.nextInt();
		} while(inicio > fin);

		while(inicio <= fin) {
			if(inicio % 2 == 0) {
				System.out.print(inicio + ", ");
			}
			inicio++;
		}
		System.out.println("listo ;)");
	}

}