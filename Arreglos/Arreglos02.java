public class Arreglos02 {
	
	public static void main(String[] args) {
		//Declaración de un arreglo
		int arraySinDimension[];

		//Inicialización de un arreglo
		int[] arrayConDimension = new int[5];

		//Inicialización de un arreglo con valores
		int[] arrayConValores = {27, 28, 26, 27, 31, 18*2};

		//Recorriendo el arreglo
		for (int num : arrayConValores) {
			System.out.println(num);
		}

	}

}