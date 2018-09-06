import java.util.Scanner;

public class Proyecto {

	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int option;
		do{
			option = menuPrincipal();
		} while(option!=0);
	}

	public static int menuPrincipal() {
		mostrarMenuConRecuadro(
			"Control de inventario y facturación",
			"Opciones disponibles:",
			"  1) Gestionar categorías",
			"  2) Gestionar productos",
			"  3) Crear factura",
			"  4) Guardar información",
			"  0) Salir", "",
			"Seleccione una opción:"
		);
		int opt = scan.nextInt();
		while(opt < 0 || opt > 4) {
			System.out.println("Opción incorrecta, inténtelo nuevamente...");
			opt = scan.nextInt();
		}
		return opt;
	}

	public static void mostrarMenuConRecuadro(String ... lineas) {
		String barra = "+---------------------------------------------------+";
		System.out.println();
		System.out.println(barra);
		for(String linea : lineas) {
			linea = "| " + linea;
			for (int i = linea.length(); i<barra.length() - 1; i++) {
				linea += " ";
			}
			linea += "|";
			System.out.println(linea);
		}
		System.out.println(barra);
		System.out.println();
	}

}
