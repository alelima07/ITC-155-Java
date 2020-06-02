import java.util.*;
// Seattle Central College
// ITC 155 - Data Structures
// Student - Alessandra Lima
// 
//Stutter - Ch14, Ex2, p925
//Write a method called stutter that accepts a stack of integers as a
//parameter and replaces every value in the stack with two occurrences
//of that value. Preserve the original relative order. For example,
//if the stack stores [3, 7, 1, 14, 9], the method should change it
//to store [3, 3, 7, 7, 1, 1, 14, 14, 9, 9]. Use a single queue as
//auxiliary storage.
//
public class Stutter {
	
	public static void main(String[] args) {
		
		// Create test Stack
				Stack<Integer> test = new Stack<>();
				test.push(15);
				test.push(20);
				test.push(5);
				test.push(14);
				
		
				System.out.println("This is the first stack: " + test);
				
		// Stutter method on the test Stack
				stutter(test);
				
		// Show the results
				System.out.println("This is the stuttered stack: " + test);

			} 
			
			public static void stutter (Stack<Integer> s) {

		// Create auxiliary queue of integers
				Queue<Integer> q = new LinkedList<>();
				
		
		// Add the variable twice to the queue. 
				while (!s.isEmpty()) {
					int n = s.pop();
					q.add(n);
					q.add(n);
				}  
				
		// Move all elements from the queue into the stack.
				while (!q.isEmpty()) {
					s.push(q.remove());
				}
				
		// Reverse the order by pop all elements from the stack back into the queue. 
				while (!s.isEmpty()) {
					q.add(s.pop());
				} 
				
		// Move back to the stack again, returning to the original order
				while (!q.isEmpty()) {
					s.push(q.remove());
				} 
				
				
			} 
			
		} 
	   