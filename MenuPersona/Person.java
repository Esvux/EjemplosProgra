public class Person {

	String firstName;
	String lastName;
	char gender;
	int age;
	boolean english;
	String email;
	
	@Override
	public String toString() {
		return "Hola soy " + firstName + " " + lastName + ", tengo " + age + " años.";
	}
}