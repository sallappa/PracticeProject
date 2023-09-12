package practiceProjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressions {
	

	    public static void main(String[] args) {

	        // Create a regular expression pattern
	        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");

	        // Create a matcher object
	        Matcher matcher = pattern.matcher("This is a test string");

	        // Check if the string matches the regular expression
	        boolean matches = matcher.matches();

	        if (matches) {
	            System.out.println("The string matches the regular expression");
	        } else {
	            System.out.println("The string does not match the regular expression");
	        }

	        // Find all occurrences of the regular expression in the string
	        matcher = pattern.matcher("This is a test string");
	        while (matcher.find()) {
	            System.out.println("Found match at index " + matcher.start());
	        }
	    }
	}


