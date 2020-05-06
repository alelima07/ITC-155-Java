// Seattle Central College
// ITC 155 - Data Structures
// Student: Alessandra Lima
// Is Unique - Ch11, Ex13, p759
//  
// Write a method "isUnique" that accepts a map whose keys/values are Strings
// as a parameter and returns true if no two keys map to the same value,
// and false if any two or more keys do map to the same value.
// An empty map is considered to be unique, so the method should return true
// if passed an empty map.


import java.util.*;

public class Unique {
	public static boolean isUnique(Map<String, String> maps){
	    Collection<String> firstNames = maps.values();
	    Set<String> uniqueNames = new HashSet<>();
	    
	    for(String name : firstNames){
	        uniqueNames.add(name);
	    }
	    
	    if(uniqueNames.size() < maps.size()){
	        return false;
	    }
	   
	    return true;
	}
}