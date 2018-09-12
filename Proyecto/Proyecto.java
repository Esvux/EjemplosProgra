import java.util.Scanner;

public class Proyecto {

	static Scanner scan = new Scanner(System.in);
	static GestorCategorias gestor;

	public static void main(String args[]) {
		//Inicio
		gestor = new GestorCategorias();
		menuPrincipal();
		//Fin
	}

	/**
	 * El método menuPrincipal se encargará de:
	 * - mostrar las opciones
	 * - gestionar la elección del usuario
	 * - repetirse hasta seleccionar la opción de salida
	 */
	public static void menuPrincipal() {
		int opcion;
		do{
			mostrarMenuConRecuadro(
				"CONTROL DE INVENTARIO Y FACTURACIÓN",
				"Opciones disponibles:",
				"  1) Gestionar categorías",
				"  2) Gestionar productos",
				"  3) Crear factura",
				"  4) Guardar información",
				"  0) Salir",
				"",
				"Seleccione una opción:"
			);
			opcion = scan.nextInt();
			while(opcion < 0 || opcion > 4) {
				System.out.println("Opción incorrecta, inténtelo nuevamente...");
				opcion = scan.nextInt();
			}

			switch (opcion) {
				case 1:
					subMenuCategorias();
					break;
				case 2:
				case 3:
				case 4:
			}
		} while(opcion != 0);
	}

	public static void subMenuCategorias() {
		int opcion;
		do{
			mostrarMenuConRecuadro(
				"GESTIÓN DE CATEGORÍAS",
				"Opciones disponibles:",
				"  1) Crear categoría",
				"  2) Modificar categoría",
				"  3) Ver todas las categorías",
				"  0) Regresar",
				"",
				"Seleccione una opción:"
			);
			opcion = scan.nextInt();
			while(opcion < 0 || opcion > 3) {
				System.out.println("Opción incorrecta, inténtelo nuevamente...");
				opcion = scan.nextInt();
			}
			switch (opcion) {
				case 1:
					gestor.crearCategoria();
					break;
				case 2:
					gestor.editarCategoria();
					break;
				case 3:
					gestor.listarCategorias();
					break;
			}
		} while(opcion != 0);
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
