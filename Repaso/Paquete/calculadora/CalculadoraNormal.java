package calculadora;

public class CalculadoraNormal {
	//Objetos - Constructor
	//Java por defecto coloca un constructor sin argumentos
	//este constructor por defecto desaparece cuando el
	//programador define un constructor 'a mano'

	public double sumar(double a, double b) {
		return a + b;
	}
	
	public double restar(double a, double b) {
		return a - b;
	}
	
	public double multiplicar(double a, double b) {
		return a * b;
	}

	public float dividir(float a, float b) {
		if(b == 0) {
			return 0;
		}
		return a / b;
	}
	
}