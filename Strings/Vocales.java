/**
 * Hacer un programa en Java que
 * dada la cadena "Quiero ser Java Developer"
 * remplazar las vocales por su equivalente
 * en mayúsculas.
 */
public class Vocales {

    public static void main(String[] args) {
		String cadena = "Quiero ser Java Developer";
		cadena = cadena.replaceAll("a", "A");
		cadena = cadena.replaceAll("e", "E");
		cadena = cadena.replaceAll("i", "I");
		cadena = cadena.replaceAll("o", "O");
		cadena = cadena.replaceAll("u", "U");
		System.out.println(cadena);
		//a) Quiero ser Java Developer
		//b) Quiero ser JAvA Developer
		//c) QUIERO SER JAVA DEVELOPER
    }

}
