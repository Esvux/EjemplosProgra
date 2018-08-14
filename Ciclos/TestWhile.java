import java.lang.Thread;
import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) throws Exception {
		Scanner read = new Scanner(System.in);
		boolean flag = true;		
		do {
			showMenu();
			int option = read.nextInt();
			switch (option) {
				case 1:
					System.out.println("Hola!!!");
					break;
				case 2:
					System.out.println("Hello!!!");
					break;
				case 3:
					System.out.println("Konichiwa :3");
					break;
				case 4:
					System.out.println("Bonjour!!!");
					break;
				case 5:
					System.out.println("Bye...");
					flag = false;
					break;
				default:
					System.out.println("Opción inválida...");
			}
		} while (flag);




		//int i = 10;
		//while(i > 0) {
		//	System.out.println(i);
		//	Thread.sleep(1000);
		//	i--;
		//}
		//System.out.println("BOOOOM!!!");
	}

	public static void showMenu() {
		System.out.println("Bienvenido a mi menú:");
		System.out.println("Elije una opción...");
		System.out.println("Opción 1 (Español):");
		System.out.println("Opción 2 (Inglés):");
		System.out.println("Opción 3 (Japonés):");
		System.out.println("Opción 4 (Francés):");
		System.out.println("Opción 5 -> salir:");
	}
	
}