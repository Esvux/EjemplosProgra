import java.util.Scanner;
import java.util.Arrays;
/**
 * (x) Tener el arreglo de 'misCategorias'
 * (x) Crear nuevas categorías
 * (x) Editar categorías
 * (x) Gestionar el espacio dentro del arreglo
 */
public class GestorCategorias {

	Categoria[] misCategorias;
	Scanner scan;
	int capacidadActual;
	int posicion;

	public GestorCategorias() {
		capacidadActual = 1;
		posicion = 0;
		scan = new Scanner(System.in);
		misCategorias = new Categoria[capacidadActual];
	}

	public void crearCategoria() {
		if(posicion==capacidadActual) {
			System.out.println("Aumentando la capacidad!!!");
			capacidadActual = capacidadActual * 2;
			misCategorias = Arrays.copyOf(misCategorias, capacidadActual);
		}
		System.out.println("Creando una nueva categoría");
		
		//Obteniendo la información de la nueva categoría
		System.out.print("Ingrese el nombre: ");
		String nombre = scan.nextLine();
		System.out.print("Ingrese el código: ");
		String codigo = scan.nextLine();
		System.out.print("Ingrese la descripción:");
		String descripcion = scan.nextLine();

		//Creando la nueva categoría
		Categoria nueva = new Categoria(nombre, codigo, descripcion);

		//Guardando en el arreglo
		misCategorias[posicion] = nueva;
		posicion++;

		//Mensaje de éxito
		System.out.println("Categoría creada correctamente.");
	}

	public void editarCategoria() {
		System.out.println("Ingresa el código de la categoría que deseas editar:");
		String codigoParaEditar = scan.nextLine();
		for (Categoria cat: misCategorias) {
			if(cat==null) {
				continue;
			}
			//'cat' no es nulo
			if(cat.codigo.equals(codigoParaEditar)) {
				System.out.println("Categoría encontrada");
				System.out.println("Nombre: " + cat.nombre);
				System.out.println("Código: " + cat.codigo);
				System.out.println("Descripción: " + cat.descripcion);
				System.out.println();
				String nuevoNombre = scan.nextLine();
				cat.nombre = nuevoNombre;
				String nuevoCodigo = scan.nextLine();
				cat.codigo = nuevoCodigo;
				String nuevaDescripcion = scan.nextLine();
				cat.descripcion = nuevaDescripcion;
				System.out.println("Categoría modificada exitosamente...");
				break;
			}
		}
	}

	public void listarCategorias() {
		System.out.println("COD|\tNOMBRE|\tDESCRIPCION");
		for (Categoria cat : misCategorias) {
			System.out.println(cat);
		}
	}
	
}