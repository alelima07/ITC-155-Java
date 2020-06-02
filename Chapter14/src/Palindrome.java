import java.util.*;

// Seattle Central College
// ITC 155 - Data Structures
// Student - Alessandra Lima
// 
// Palindrome - Ch14, Ex8
//  
// Write a method called Palindrome that accepts a queue of integers as
//   a parameter and returns true if the numbers in the queue are the same
//   in reverse order. For example, if the queue stores [3, 8, 17, 8, 3],
//   the method should return true.  Empty queue should be considered a
//   palindrome. Method must restore the parameter queue to its original
//   state before returning. Use one stack as auxiliary storage.

public class Palindrome {

		public static void main(String[] args) {
			
	
			Queue<Integer> test1 = new LinkedList<>();	// this is a palindrome
			test1.add(3);
			test1.add(8);
			test1.add(17);
			test1.add(8);
			test1.add(3);
			
			Queue<Integer> test2 = new LinkedList<>();	// this is not a palindrome
			test2.add(5);
			test2.add(7);
			test2.add(19);
			test2.add(9);
			test2.add(2);
			
	// Display test queues and results of methods
			System.out.println("Test Queue:  \t\t" + test1);
			System.out.println("Palindrom status: \t" + isPalindrome(test1));	//returns true
			System.out.println("Test Queue, after: \t" + test1);
			System.out.println();
			System.out.println("Test Queue: \t\t" + test2);
			System.out.println("Palindrom status: \t" + isPalindrome(test2));	//returns false
			System.out.println("Test Queue, after: \t" + test2);
			

		} 
		
		
	// Method isPalindrome with Queue of Integers as a parameter
		public static boolean isPalindrome (Queue<Integer> q) {
			
	// Create auxiliary Stack of Integers
	// Create variables for queue size and boolean return, defaulted to true.
			Stack<Integer> s = new Stack<>();
			int size = q.size();
			boolean isPal = true;
			
	// For loop goes through queue a number of times equal to starting queue size
	 
			for (int i = 0; i < size; i++) {
				int n = q.remove();
				q.add(n);
				s.push(n);
			} 
			
			for (int i = 0; i < size; i++) {
				int a = s.pop();
				int b = q.remove();
				q.add(b);
				if (a != b) {
					isPal = false;
					
				} 
			} 

	
			return isPal;
			
		} 
	} 

