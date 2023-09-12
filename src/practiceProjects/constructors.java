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
	//same parameters
	public constructors(int age,String name) {
		System.out.println("same paarameters but age,name but order different");
	}
	//different parameters
	public constructors(String name,int age,int id) {
		System.out.println("with different parameters");
	}

	public static void main(String[] args) {


		constructors constructors1 = new constructors();

		// Creating an object using the parameterized constructor
		constructors constructors2 = new constructors("sai",23);
		//different parameters
		constructors constructors3=new constructors("sai",23,405);
		//same parameters but insertion order is different 
		constructors constructors4=new constructors(23,"sai");

	}
}
