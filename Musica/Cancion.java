public class Cancion {
	public String nombre;
	public String autor;
	public int valoracion;
	public double duracion;

	public Cancion() {
		autor = "JuanGa";
	}

	public Cancion(String nombre, double duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}

}