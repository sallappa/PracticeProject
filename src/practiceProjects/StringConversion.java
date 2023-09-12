package practiceProjects;

public class StringConversion {

	    public static void main(String[] args) {

	        String str = "Hello, world!";

	        //  string to a StringBuffer
	        StringBuffer sb = new StringBuffer(str);

	        // add character to the StringBuffer
	        sb.append("!");

	        //  StringBuffer to a string
	        String newStr = sb.toString();

	        System.out.println("Original string: " + str);
	        System.out.println("Converted string: " + newStr);
	        System.out.println();
	        // Create a StringBuilder
	        StringBuilder sb2 = new StringBuilder("I love java!");

	        // Insert a character to the StringBuilder
	        sb2.insert(6, "!");

	        // Convert the StringBuilder to a string
	        String newStr2 = sb2.toString();

	        // Print the original string and the converted string
	        System.out.println("Original string: " + sb2);
	        System.out.println("Converted string: " + newStr2);
	    }
	}

