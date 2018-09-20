public class Categoria {
	//Estos son atributos o propiedades
	public String nombre;
	public String codigo;
	public String descripcion;
	public Producto[] productos;
	private int indiceProducto;

	public Categoria() {
		productos = new Producto[10];
		indiceProducto = 0;
	}

	public Categoria(String nombre, String codigo, String descripcion) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.productos = new Producto[10];
		indiceProducto = 0;
	}

	public void agregarProducto(Producto productoNuevo) {
		this.productos[indiceProducto] = productoNuevo;
		this.indiceProducto++;
	}

	public String toString() {
		return this.nombre + "|\t" + this.codigo + "|\t" + this.descripcion;
	}

}