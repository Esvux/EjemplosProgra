public class Artista {
	//Propiedades
	public String nombre;
	public String generoMusical;
	public String nacionalidad;
	public int edad;
	public char genero;
	public Cancion[] canciones;

	public Artista() {
		this.canciones = new Cancion[2];
	}

	public Artista(//parámetros
		String nombre, 
		String nacionalidad, 
		int edad
	) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.canciones = new Cancion[3];
	}

}