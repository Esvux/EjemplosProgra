public class Arreglos04 {
	
	public static void main(String[] args) {
		//Declaración con tamaño definido
		Examen[] parciales = new Examen[5];

		//Asignando un nuevo valor por medio de una variable
		Examen elExamenDeDomingo = new Examen("Domingo", 70);
		parciales[2] = elExamenDeDomingo;
		Examen elExamenDeRicardo = new Examen("Ricardo", 65);
		parciales[1] = elExamenDeRicardo;

		//Asignando nuevos valores directamente
		parciales[0] = new Examen("Raúl", 99);
		parciales[3] = new Examen("Pablo", 85);
		parciales[4] = new Examen("Jorge", 80);

		//Recorriendo el arreglo con un for-each
		for (Examen actual : parciales) {
			System.out.println(actual);
		}

		//if ternario, operador ternario
		//int j = parciales != null ? parciales.length : 0;
		
		//Recorriendo el arreglo con un for y usando parciales.length
		for (int i = 0; i < parciales.length; i++) {
			Examen actual = parciales[i];
			System.out.println(actual.nombre + ">>>" + actual.nota);
		}

	}

}

class Examen {
	String nombre;
	int nota;

	public Examen(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	@Override
	public String toString() {
	 	return this.nombre + " -> " + this.nota;
	}

}