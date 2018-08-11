import java.util.Scanner;

public class TimesTable {
	
	public static void main(String[] args) {
		//for
		//while
		//do-while
		//until
		//for(inicialización; condición; incremento)
		Scanner read = new Scanner(System.in);
		System.out.println("Ingrese el número para obtener su tabla de multiplicar:");
		int j = read.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(i + " * " + j + " = " + i * j);
		}
	}

}