/*
 * Kevin Kantono
 * 04/26/2020
 * Replace every sting with two of that same string
 */
import java.util.ArrayList;

public class doubleList {

	public static void main(String[] args) {
		ArrayList<String> sentece = new ArrayList<String>();
		sentece.add("I"); 
		sentece.add("Want");
		sentece.add("Burger"); 
		doubleList(sentece);
		
		ArrayList<String> clause = new ArrayList<String>();
		clause.add("The");
		clause.add("Quick");
		clause.add("Brown");
		clause.add("Fox");
		clause.add("Jumps");
		clause.add("Over");
		clause.add("The");
		clause.add("Lazy");
		clause.add("Dog");
		doubleList(clause);
	}

	
	public static void doubleList(ArrayList<String> sentece) {
	    for (int i = 0; i < sentece.size(); i++) {
	        String copy = sentece.get(i);
	        sentece.add(i+1, copy);
	        i++;
		}
		System.out.println(sentece);
	}

}
