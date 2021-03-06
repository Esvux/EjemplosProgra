import java.util.Scanner;
import java.util.Arrays;
/**
 * (x) Tener el arreglo de 'misCategorias'
 * (x) Crear nuevas categorías
 * (x) Editar categorías
 * (x) Gestionar el espacio dentro del arreglo
 */
public class GestorFerreteria {

	Categoria[] misCategorias;
	Scanner scan;
	int capacidadActual;
	int posicion;

	public GestorFerreteria() {
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

	public Categoria buscarCategoria(String codigo) {
		for (Categoria cat: misCategorias) {
			if(cat==null) {
				continue;
			}
			//Acá solo tomo en cuenta las categorías que no son NULAS
			if(cat.codigo.equals(codigo)) {
				//Esta es la categoría que busco
				return cat;
			}
		}
		// ¿Qué le regreso?
		System.out.println("Categoria no encontrada: " + codigo);
		return null;
	}

	public void listarCategorias() {
		System.out.println("COD|\tNOMBRE|\tDESCRIPCION");
		for (Categoria cat : misCategorias) {
			System.out.println(cat);
		}
	}

	public void crearProducto(Categoria categoria) {
		//Obteniendo la información del nuevo producto
		System.out.print("Ingrese el código: ");
		String codigo = scan.nextLine();

		System.out.print("Ingrese el nombre: ");
		String nombre = scan.nextLine();

		System.out.print("Ingrese la descripción: ");
		String descripcion = scan.nextLine();

		System.out.print("Ingrese el precio: ");
		double precio = scan.nextDouble();
		scan.nextLine();

		System.out.print("Ingrese las existencias: ");
		int existencias = scan.nextInt();
		scan.nextLine();

		//Creando el nuevo producto
		Producto prd = new Producto(nombre, codigo, descripcion, precio, existencias);
		categoria.agregarProducto(prd);

		//Mensaje de éxito
		System.out.println("Categoría creada correctamente.");
	}
	
}