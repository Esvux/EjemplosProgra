/**
 * Mostrar los números pares, donde el número inicial
 * y el límite son ingresados por el usuario. 
 * Si el número inicial es mayor al final, entonces 
 * mostrar los números pares desde el mayor hasta 
 * el menor, de lo contrario, mostrarlos normalmente.
 * Ejemplos: 
 *	20 y 27, mostrarán: 20, 22, 24, 26
 *	12 y 5, mostrarán: 12, 10, 8, 6
 *	33 y 30, mostrarán: 32, 30
 */
import java.util.Scanner;

public class NumerosParesDobleSentido 
{

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("Hola usuario, ingresa el número inicial:");
		int inicio = scan.nextInt();
		System.out.println("Ahora ingresa el número final:");
		int fin = scan.nextInt();
		int sentido = 1;
		if(inicio > fin) {
			int aux = inicio;
			inicio = fin;
			fin = aux;
			sentido = -1;
		}

		while(inicio <= fin)
		{
			int aux;
			if(sentido > 0) {
				aux = inicio;
				inicio += sentido;
			} else {
				aux = fin;
				fin += sentido;
			}
			if(aux % 2 == 0)
			{
				System.out.print(aux + ", ");
			}
		}
		System.out.println("listo ;)");
	}

}