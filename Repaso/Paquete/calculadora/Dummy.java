package calculadora;

public class Dummy {	

	public static double sumar(double a, double b) {
		return 2*a + 2*b;
	}
	
	public static double restar(double a, double b) {
		return a - b;
	}
	
	public static double multiplicar(double a, double b) {
		return a * b;
	}

	public static float dividir(float a, float b) {
		if(b == 0) {
			return 0;
		}
		return a / b;
	}

}
