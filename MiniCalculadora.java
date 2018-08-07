import java.util.Scanner;

public class MiniCalculadora {

  public static void main(String[] args) {
    int num1;
    int num2;
    //read es para leer desde el teclado
    Scanner read = new Scanner(System.in);
    //mostrar un mensaje amigable para el usuario
    System.out.println("Ingrese el valor de num1:");
    //leer el valor de num1
    num1 = read.nextInt();

    //num2
    System.out.println("Ingrese el valor de num2:");
    num2 = read.nextInt();

    System.out.println("El resultado es: " + (num1 + num2));

  }

}
