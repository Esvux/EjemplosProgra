public class Spotify {

	public static void main(String[] args) {
		Artista[] misArtistasFavoritos = new Artista[5];
		misArtistasFavoritos[0] = new Artista("José José", "Mexicano", 70);
		misArtistasFavoritos[1] = new Artista("Santiago Cruz", "Colombiano", 42);
		misArtistasFavoritos[2] = new Artista("Britney Spears", "American", 36);
		misArtistasFavoritos[3] = new Artista("Ricardo Arjona", "Guatemalteco", 54);
		misArtistasFavoritos[4] = new Artista("Paquita", "Mexicana", 71);

		Cancion cancion1 = new Cancion("Pingüinos en la cama", 3.45);
		
		//Ricardo Arjona
		misArtistasFavoritos[3].canciones[0] = cancion1;

		//Cuanto dura la canción de Pingüinos en la cama de Ricardo Arjona
		System.out.println(misArtistasFavoritos[3].canciones[0].duracion);
		
	}

}