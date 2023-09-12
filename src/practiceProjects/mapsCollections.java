package practiceProjects;

import java.util.HashMap;
import java.util.TreeMap;

public class mapsCollections {
	

	    public static void main(String[] args) {

	        // Create a HashMap
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("Sai", 100);
	        map.put("Bharath", 200);
	        map.put("Java", 300);

	        // size of the map
	        System.out.println("The size of the map is: " + map.size());

	        //  contains a specific key
	        System.out.println("Does the map contain Sai? " + map.containsKey("Sai"));

	        //  contains a specific value
	        System.out.println("Does the map contain 100? " + map.containsValue(100));

	        // Get the value for a specific key
	        System.out.println("The value for Java is: " + map.get("Java"));

	        // Remove a key-value pair from the map
	        map.remove("Java");

	        // Print the map
	        System.out.println(map);
	        System.out.println();

	        // Create a TreeMap
	        TreeMap<String, Integer> treeMap = new TreeMap<>();
	        treeMap.put("Java", 100);
	        treeMap.put("Python", 200);
	        treeMap.put("C++", 300);

	        // Verify the size of the map
	        System.out.println("The size of the tree map is: " + treeMap.size());

	        // Verify if the tree map contains a specific key
	        System.out.println("Does the tree map contain Java? " + treeMap.containsKey("Java"));

	        // Verify if the tree map contains a specific value
	        System.out.println("Does the tree map contain 100? " + treeMap.containsValue(100));

	        // Get the value for a specific key
	        System.out.println("The value for Java is: " + treeMap.get("Java"));

	        // Remove a key-value pair from the map
	        treeMap.remove("Java");

	        // Print the map
	        System.out.println(treeMap);
	    }
	}

