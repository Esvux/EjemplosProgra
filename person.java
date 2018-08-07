public class person {
	
	String name;
	int age;
	char gender;
	double height;

	void eats() {
		System.out.println(name + " come...");
	}

	void walks() {
		System.out.println(name + " camina...");
	}

	void sleep() {
		System.out.println(name + " duerme...");
	}

	public static void main(String[] args) {
		person p1 = new person();
		p1.name = "Esvin";
		p1.age = 27;
		p1.gender = 'M';
		p1.height = 1.80;

		p1.eats();
		p1.walks();
		p1.sleep();
	}

}