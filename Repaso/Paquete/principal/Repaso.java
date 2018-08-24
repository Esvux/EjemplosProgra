package principal;

import calculadora.*;

public class Repaso {
	
	public static void main(String[] args) {
		System.out.println(sumar(5.0, 4.0));
		System.out.println(Dummy.sumar(5.0, 4.0));
		System.out.println(restar(10, 5.6));
		System.out.println(multiplicar(3, 2.6));
		System.out.println(dividir(12.5f, 0f));

		int num = 99;
		while(num > 0) {
			if(num%5==0 && num%3==0 && num%2==0) {
				break;
			}
			if(num%7==0) {
				continue;
			}
			System.out.println(num);
		}

	}


	//Métodos estáticos (static) no necesitan de una
	//instancia para poder ejecutarse.
	public static double sumar(double a, double b) {
		return a + b;
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