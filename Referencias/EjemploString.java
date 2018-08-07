import java.util.Scanner;

public class EjemploString {

	//Áreas de memoria en Java
	//Stack -> Apila ámbitos y controla la ejecución del programa
	//Heap -> Almacena objetos
	//String pool -> Almacena cadenas (strings)

	//Ámbito
	//Espacio de memoria reservado para un bloque de código específico

	//Variable global
	//Se declara a nivel de la clase

	String saludo = "Hola amigos";

	public static void main(String[] args) {
		System.out.println(saludo);
		duplicar(5);

	}

	public static double pow(int a, int b) {
		return Math.pow(a, b);
	}

	public static int duplicar(int a) {
		int resultado = 2 *a;
		System.out.println(saludo.toUpperCase());
		return resultado;
	}


	
}