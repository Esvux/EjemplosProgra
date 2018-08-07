class TestMethods {
	public static void main(String[] args) {
		int suma = add(7, 2);
		int resta = sub(7, 2);
		int multi = mul(7, 2);
		double p = pow(7, 2);
		System.out.println("La suma vale " + suma);
		System.out.println("La resta vale " + resta);
		System.out.println("La multiplicación vale " + multi);
		System.out.println("La potencia vale " + p);
	}

	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public static int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public static double pow(int a, int b) {
		double c = Math.pow(a, b);
		return c;
	}

	public static int diff21(int n) {
  int diff = Math.abs(n - 21);
  if(n > 21) {
    return 2 * diff;
  } else {
    return diff;
  }
}

	//Desarrollar los métodos sub, mul y pow
}
