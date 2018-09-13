import java.io.*;

public class Archivador {	

	public static void main(String[] args) {
		leerCategorias("categorias.csv");
	}

	/**
	 * Este método recibe como parámetro el nombre
	 * de un archivo y retorna el contenido de dicho
	 * archivo.
	 */
	public static void leerCategorias(String nombre) {
		StringBuffer megaString = new StringBuffer();

		megaString.append("<!DOCTYPE html>");
		megaString.append("<html>");
		megaString.append("<head>");
		megaString.append("<meta charset='utf-8'>");
		megaString.append("<title>Academik</title>");
		megaString.append("</head>");
		megaString.append("<body>");

		try {
			//LEER UN ARCHIVO LÍNEA POR LÍNEA
			//Abrir el archivo
			FileReader reader = new FileReader("categorias.csv");
			BufferedReader buffer = new BufferedReader(reader);
			//Leer la primera línea
			String currentLine = buffer.readLine();
			//Continuar la lectura, línea por línea hasta el final
			while (currentLine != null) {
				//Aquí se tiene la línea actual
				String[] columns = currentLine.split(",");
				megaString.append("<h1>Código: " + columns[0] + "</h1>");
				megaString.append("<h2>Nombre: " + columns[1] + "</h2>");
				megaString.append("<p>Descripción:</p>");
				megaString.append("<p>" + columns[2] + "</p>");
				//Aquí se sustituye la línea actual por la siguiente línea
				currentLine = buffer.readLine();
			}
			megaString.append("</body>");
			megaString.append("</html>");

			FileWriter writer = new FileWriter("reporte.html");
    		BufferedWriter otroBuffer = new BufferedWriter(writer);
    		otroBuffer.write(megaString.toString());
    		otroBuffer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	Forma crack de leer archivos
	Files.readAllLines(Paths.get("categorias.csv")).forEach(linea -> {
		String[] columns = linea.split(",");
		System.out.print(columns[0] + " - ");
		System.out.print(columns[1].toUpperCase() + " - ");
		System.out.println(columns[2].toLowerCase());				
	});
	*/

}