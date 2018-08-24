public class Repaso {
	
	public static void main(String[] args) {
		//System.out.println(sumar(5.0, 4.0));
		//System.out.println(Dummy.sumar(5.0, 4.0));
		//System.out.println(restar(10, 5.6));
		//System.out.println(multiplicar(3, 2.6));
		//System.out.println(dividir(12.5f, 0f));

		int num = 99;
		while(num > 0) {
			if(num%5==0 && num%3==0 && num%2==0) {
				break;
				//Termino el ciclo
			}
			if(num%7==0) {
				num--;
				//Salto a la siguiente iteración
				continue;
			}
			System.out.println(num);
			num--;
		}

		for (int i=1; i<=10; i++) {
			System.out.println(i + " x 7 = " + i*7);
		}
		for (int i=11; i>0; i--) {
			for (int j=0; j<i; j++) {
				if(j<11-i || j>i-1){
					System.out.print(" ");
				} else {
					System.out.print("*");

				}
			}
			System.out.println();
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