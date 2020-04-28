/* Seattle Central College
 * ITC 155
 * Alessandra Lima
 * Replace every string with two of that same string
 */
import java.util.ArrayList;

public class doubleList {

	public static void main(String[] args) {
		ArrayList<String> sentece = new ArrayList<String>();
		sentece.add("I"); 
		sentece.add("love");
		sentece.add("spring"); 
		doubleList(sentece);
		
		ArrayList<String> clause = new ArrayList<String>();
		clause.add("The");
		clause.add("Beautiful");
		clause.add("Flowers");
		clause.add("Make");
		clause.add("Me");
		clause.add("Extremely");
		clause.add("Happy");
		clause.add("Every");
		clause.add("Day");
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
