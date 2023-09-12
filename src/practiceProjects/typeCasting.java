package practiceProjects;

public class typeCasting {
	
	    public static void main(String[] args) {

	        // Implicit type casting
	        byte b = 10;
	        short s = b;
	        int i = s;
	        long l = i;
	        float f = l;
	        double d = f;
	        System.out.println("implicit type casting");
	        System.out.println("byte value: " + b);
	        System.out.println("short value: " + s);
	        System.out.println("int value: " + i);
	        System.out.println("long value: " + l);
	        System.out.println("float value: " + f);
	        System.out.println("double value: " + d);

	        // Explicit type casting
	        int x = 100;
	        float y = (float) x;
	        double z = (double) y;
	        System.out.println();
	        System.out.println("explicit type casting");
	        System.out.println("int value: " + x);
	        System.out.println("float value: " + y);
	        System.out.println("double value: " + z);
	    }
	}

