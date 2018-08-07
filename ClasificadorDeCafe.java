//Import para leer desde el teclado
import java.util.Scanner;

//Definición de la clase
public class ClasificadorDeCafe {

	//Método main
	public static void main(String args[]) {
		//Mensaje de bienvenida
		System.out.println("Hola, ingresa el precio del café:");

		//Leer desde el teclado
		Scanner read = new Scanner(System.in);
		int precio = read.nextInt();

		//Validar precio
		if(precio < 0) {
			System.out.println("Precio inválido...");
		}
		if (precio == 0) {
			System.out.println("It's free");
		}
		if(precio > 0 && precio <= 10) {
			System.out.println("Es barato");
		}
		if(precio > 10 && precio <= 25) {
			System.out.println("Es normal");
		}
		if(precio > 25) {
			System.out.println("Es caro");
		}
	}

}
