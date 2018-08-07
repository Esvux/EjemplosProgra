public class Pais {

	static String nombre;
	double extension;

	public Pais(String nombre, double extension) {
		this.nombre = nombre;
		this.extension = extension;
	}

	public void setExtension(double extension) {
		this.extension = extension;
	}

	@Override
	public String toString(){
		return nombre + " -> " + extension;
	}
}