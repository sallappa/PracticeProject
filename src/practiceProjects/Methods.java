package practiceProjects;

public class Methods {
	
	    // method with no parameters
	    public void printMessage() {
	        System.out.println("Hello, World!");
	    }

	    // Method with parameters and a return value
	    public int addNumbers(int num1, int num2) {
	        return num1 + num2;
	    }

	    // Method with parameters 
	    public void Sum(int num1, int num2) {
	        int sum = num1 + num2;
	        System.out.println("Sum: " + sum);
	    }

	    // Method with a return value
	    public double getPi() {
	        return 3.14;
	    }

	    // Private method
	    private void privateMethod() {
	        System.out.println("This is a private method.");
	    }

	    public static void main(String[] args) {
	        Methods method=new Methods();

	        // Calling methods
	        method.printMessage(); 

	        int sum = method.addNumbers(5, 7);
	        System.out.println("Sum of 5 and 7: " + sum); 

	        method.Sum(8, 4); 

	        double pi = method.getPi();
	        System.out.println("Value of Pi: " + pi);

	        
	       method.privateMethod();
	    }
	}

