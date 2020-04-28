/* Seattle Central College
 * ITC 155
 * Alessandra Lima
 * Removing any even length strings from the list
 */


import java.io.FileNotFoundException;
import java.util.*;

public class removeEvenLength  {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Cat"); // 3
		list.add("Dog"); // 3
		list.add("Zebra"); // 5
		list.add("Horse"); // 5
		list.add("Cow"); // 3
		list.add("Bird"); // 4
		list.add("Alligator"); // 9
		list.add("Fish"); // 4
		list.add("Bear"); // 4
		list.add("Duck"); // 4
		removeEvenLength(list);
	}

	public static void removeEvenLength(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			int letterCount = list.get(i).length();
			if (letterCount % 2 == 0) {
				list.remove(i);
				i--; 
			}
		}
		System.out.println(list);
	}
}
