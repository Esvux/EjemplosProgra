public class Categoria {
	//Estos son atributos o propiedades
	public String nombre;
	public String codigo;
	public String descripcion;
	public Producto[] productos;

	public Categoria() {
		productos = new Producto[10];
	}

	public Categoria(String nombre, String codigo, String descripcion) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.productos = new Producto[10];
	}

	public String toString() {
		return this.nombre + "|\t" + this.codigo + "|\t" + this.descripcion;
	}

}