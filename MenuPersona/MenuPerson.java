import java.util.Scanner;

public class MenuPerson {
	
	public static void main(String[] args) {
		//Mostrando las posibles opciones en pantalla
		System.out.println("Acciones disponibles");
		System.out.println("   1) Crear persona");
		System.out.println("   2) Modificar persona");
		System.out.println("   3) Eliminar persona");

		//Declarando Scanner para leer desde el teclado
		Scanner read = new Scanner(System.in);

		//Leyendo opción ingresada
		int option = read.nextInt();

		if (option == 1) {
			System.out.println("Creando...");
			Person person = createPerson();
			System.out.println(person.toString());
		} else if(option == 2) {
			System.out.println("Modificando...");
		} else if(option == 3) {
			System.out.println("Eliminando...");
		} else {
			System.out.println("Opción inválida");
			System.out.println("Bye :(");
		}
	}


	public static Person createPerson() {
		Scanner read = new Scanner(System.in);
		Person p = new Person();

		System.out.println("Ingrese los nombres:");
		p.firstName = read.nextLine();

		System.out.println("Ingrese los apellidos:");
		p.lastName = read.nextLine();

		System.out.println("Ingrese el género (M/F):");
		String genderTemp = read.next();
		p.gender = genderTemp.charAt(0);

		System.out.println("Ingrese la edad:");
		p.age = read.nextInt();

		System.out.println("Sabe inglés (Si/No):");
		String englishTemp = read.next();
		
		if(englishTemp.equals("Si")) {
			p.english = true;
		} else {
			p.english = false;
		}
		
		System.out.println("Ingrese el correo electrónico:");
		p.email = read.next();

		return p;
	}


}