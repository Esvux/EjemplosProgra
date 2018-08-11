import java.util.Scanner;

public class TestCase {

	public static void main(String[] args) {
		System.out.println("Ingrese el número de un mes (ordinales o romanos):");
		Scanner read = new Scanner(System.in);
		String month = read.next();

		//Puede evaluar String, int, char o enums*
		//*enums es de progra avanzada
		switch(month.toUpperCase()) {
			case "I":
			case "1":
				System.out.println("Enero");
				break;
			case "II":
			case "2":
				System.out.println("Febrero");
				break;
			case "III":
			case "3":
				System.out.println("Marzo");
				break;
			case "IV":
			case "4":
				System.out.println("Abril");
				break;
			case "V":
			case "5":
				System.out.println("Mayo");
				break;
			case "VI":
			case "6":
				System.out.println("Junio");
				break;
		}

	}
	
}