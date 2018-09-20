import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
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
		capacidadActual = 10;
		posicion = 0;
		scan = new Scanner(System.in);
		misCategorias = new Categoria[capacidadActual];
	}

	public void crearCategoria() {
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
		agregarCategoria(nueva);

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

	public void crearProducto() {
		System.out.println("Creando un nuevo producto");
		//Obtener categoría
		int contadorErrores = 0;
		Categoria categoriaDelProducto;
		do {
			System.out.print("Ingrese categoría a la que pertenece el producto: ");
			String codigoCategoria = scan.nextLine();
		 	categoriaDelProducto = buscarCategoria(codigoCategoria);
		 	if(categoriaDelProducto==null) {
		 		contadorErrores++;
		 	}
		 	if(contadorErrores == 3) {
		 		System.out.println("Demasiados intentos... Bye ;)");
		 		return;
		 	}
		 	//Ciclos de permanencia
		} while(categoriaDelProducto == null);

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
		categoriaDelProducto.agregarProducto(prd);

		//Mensaje de éxito
		System.out.println("Producto creado correctamente.");
	}

	public void mostrarInventario() {
		System.out.println("- INVENTARIO -");
		for (Categoria cat : misCategorias) {
			if(cat == null) {
				continue;
			}
			//Aquí 
			System.out.println(cat.nombre);
			for (Producto prd : cat.productos) {
				if(prd == null){
					continue;
				}
				System.out.println(prd);
			}
		}
	}

	public void agregarCategoria(Categoria nuevaCategoria) {
		if(posicion==capacidadActual) {
			System.out.println("Aumentando la capacidad!!!");
			capacidadActual = capacidadActual * 2;
			misCategorias = Arrays.copyOf(misCategorias, capacidadActual);
		}
		misCategorias[posicion] = nuevaCategoria;
		posicion++;
	}

	public void cargarCategorias() {
		try {
			FileReader reader = new FileReader("categorias.csv");
			BufferedReader buffer = new BufferedReader(reader);
			//Leer la primera línea
			String currentLine = buffer.readLine();
			//Continuar la lectura, línea por línea hasta el final
			while (currentLine != null) {
				//Aquí se tiene la línea actual
				String[] columns = currentLine.split(",");
				Categoria nueva = new Categoria(columns[1], columns[0], columns[2]);
				agregarCategoria(nueva);
				
				//Aquí se sustituye la línea actual por la siguiente línea
				currentLine = buffer.readLine();
			}
			buffer.close();
			reader.close();
		} catch (IOException ioex) {
			System.err.println("Imposible leer el archivo de categorías");
		}
	}
	
}