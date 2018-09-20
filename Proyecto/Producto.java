public class Producto {
	//Estos son atributos o propiedades
	public String nombre;
	public String codigo;
	public String descripcion;
	public double precio;
	public int existencias;
	
	public Producto() {
	}

	public Producto(String nombre, String codigo, String descripcion, double precio, int existencias) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.existencias = existencias;
	}

	public String toString() {
		return "| " + this.nombre + "\t|" + this.codigo + "\t|" + this.descripcion  + "\t|" + this.precio  + "\t|" + this.existencias + "\t|";
	}

}