/**
 * El usuario ingresa una cadena (Utilizar Scanner)
 * Si la longitud de la cadena es mayor a 12, mostrar en pantalla
 * la misma cadena, pero toda en minúsculas.
 * Si la longitud de la cadena es menor a 5, mostrar en pantalla
 * la misma cadena, pero toda en mayúsculas.
 * Por último si la longitud de la cadena es mayor que 20, mostrar
 * en pantalla la cadena sin los primeros 3 caracteres y sin los 
 * últimos 2.
 */
import java.util.Scanner;

public class TestSubstring {

	public static void main(String[] args) {

		System.out.println("Ingresa tu cadena:");

		Scanner read = new Scanner(System.in);
		String entrada = read.nextLine();

		int longitud = entrada.length();
		if (longitud > 20) {
			System.out.println(entrada.substring(3, longitud-2));
		} else if (longitud > 12) {
			System.out.println(entrada.toLowerCase());
		} else if (longitud < 5) {
			System.out.println(entrada.toUpperCase());
		}


	}

}