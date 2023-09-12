package practiceProjects;

public class constructors {

	// Default constructor
	public constructors() {
		System.out.println("Default constructor");
	}

	// Parameterized constructor
	public constructors(String name,int age) {
		System.out.println("Parameterized constructor: " + name);
		System.out.println("Parameterized constructor: " + age);

	}

	public static void main(String[] args) {


		constructors constructors1 = new constructors();

		// Creating an object using the parameterized constructor
		constructors constructors2 = new constructors("sai",23);

	}
}
