import java.util.Scanner;

public class Proyecto {

	static Scanner scan = new Scanner(System.in);
	static GestorFerreteria gestor;

	public static void main(String args[]) {
		//Inicio
		gestor = new GestorFerreteria();
		gestor.cargarCategorias();
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
			opcion = customNextInt();
			while(opcion < 0 || opcion > 4) {
				System.out.println("Opción incorrecta, inténtelo nuevamente...");
				opcion = customNextInt();
			}

			switch (opcion) {
				case 1:
					subMenuCategorias();
					break;
				case 2:
					subMenuProductos();
					break;
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
			opcion = customNextInt();
			while(opcion < 0 || opcion > 3) {
				System.out.println("Opción incorrecta, inténtelo nuevamente...");
				opcion = customNextInt();
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

	public static void subMenuProductos() {
		int opcion;
		do{
			mostrarMenuConRecuadro(
				"GESTIÓN DE PRODUCTOS",
				"Opciones disponibles:",
				"  1) Crear producto",
				"  2) Buscar producto por código",
				"  3) Aumentar las existencias",
				"  4) Mostrar todos los productos",
				"  0) Regresar",
				"",
				"Seleccione una opción:"
			);
			opcion = customNextInt();
			while(opcion < 0 || opcion > 4) {
				System.out.println("Opción incorrecta, inténtelo nuevamente...");
				opcion = customNextInt();
			}
			switch (opcion) {
				case 1:
					gestor.crearProducto();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					gestor.mostrarInventario();
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

	private static int customNextInt() {
		int opcion = scan.nextInt();
		scan.nextLine();
		return opcion;
	}

}
