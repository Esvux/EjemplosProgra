public class TestSub {

	public static void main(String args[]) {
		String str = "Telus international";//\0
		System.out.println(str.substring(3, str.length()-2));
	}

}
