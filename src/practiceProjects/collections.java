package practiceProjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class collections {
	
	    public static void main(String[] args) {
	        // List Example
	        List<String> names = new ArrayList<>();
	        names.add("sai kumar");
	        names.add("bharath");
	        names.add("saiicon");
	        System.out.println("List Example: " + names);
	        System.out.println(names.contains("sai"));
	        System.out.println(names.get(0));
	        System.out.println(names.size());
	        System.out.println(names.remove(1));
	        System.out.println();
	        // Set Example
	        Set<Integer> numbers = new HashSet<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(10); // Duplicate elements are not allowed in a Set
	        System.out.println("Set Example: " + numbers);
	        System.out.println(numbers.contains(123));
	        System.out.println( numbers.size());
	        System.out.println(numbers.remove(30));
	        System.out.println(numbers.isEmpty());

	        // Queue Example
	        Queue<String> queue = new LinkedList<>();
	        queue.offer("Item 1");
	        queue.offer("Item 2");
	        queue.offer("Item 3");
	        System.out.println("Queue Example: " + queue);

	        // Stack Example
	        Stack<String> stack = new Stack<>();
	        stack.push("Item A");
	        stack.push("Item B");
	        stack.push("Item C");
	        System.out.println("Stack Example: " + stack);
	    }
	}
