import java.util.Scanner;

public class Countdown {
	
	public static void main(String[] args) {
		int i = 10;
		Scanner scan = new Scanner(System.in);
		while(i > 0) {
			System.out.println("Faltan " + i + " Enter");
			scan.next();
			i--;
		}
		System.out.println("BOOOOOOOOOOOOMMMM!!!");

	}

}