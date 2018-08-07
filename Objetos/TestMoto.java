import java.util.Scanner;

//Punto de entrada de mi programa
public class TestMoto {
	// ... = varargs
	public static void main(String ... args) {
		//Herramienta para leer desde el teclado
		Scanner r = new Scanner(System.in);

		System.out.println("Ingrese la marca de su motocicleta");
		String marcaIngresadaPorElUSuario = r.next();

		System.out.println("Ingrese el color de su motocicleta");
		String colorIngresadoPorElUSuario = r.next();

		//moto1 de marca Honda y de color verde
		Motocicleta moto1 = new Motocicleta(marcaIngresadaPorElUSuario, colorIngresadoPorElUSuario);
		//0

		moto1.acelerar(3.0);
		//3
		moto1.mostrarVelocidad();
		moto1.velocidad = 90;
		//90

		moto1.acelerar(15.0);
		//105
		moto1.acelerar(20.0);
		//125
		moto1.mostrarVelocidad();
		//125
		moto1.acelerar();
		moto1.acelerar();
		moto1.acelerar();
		moto1.acelerar();
		moto1.acelerar();
		moto1.mostrarVelocidad();
		//43
	}
	/* 
	KISS
		Keep
		It
		Simple
		Stupid
	DRY
		Don't
		Repeat
		Yourself
	*/
}