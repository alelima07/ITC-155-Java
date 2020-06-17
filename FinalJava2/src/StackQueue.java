// Seattle Central College
// ITC 155 - Data Structures
// Student - Alessandra Lima
// Final Exam
// Write a method called equals that accepts two stacks of integers as
// parameters and returns true if the two stacks store exactly the
// same sequence of integer values in the same order. Method must 
// restore the two stacks to the original state before returning.
// Use one stack as auxiliary storage.

import java.util.*;

public class StackQueue {

	public static void main(String[] args) {
				Stack<Integer> test1 = new Stack<>();
				test1.push(6);
				test1.push(3);
				test1.push(9);
				System.out.println(test1); 
				
				Stack<Integer> test2 = new Stack<>();
				test2.push(6);
				test2.push(3);
				test2.push(9);
				System.out.println(test2); 
				
				Stack<Integer> test3 = new Stack<>();
				test3.push(6);
				test3.push(3);
				test3.push(4);
				System.out.println(test3); 
				
				System.out.println("test1 v test2: " + equals(test1, test2));  //true
				System.out.println("test1 v test3: " + equals(test1, test3));  //false
				
				
				System.out.println(test1); 
				System.out.println(test2); 
				System.out.println(test3); 
			} 
			
		
			public static boolean equals (Stack<Integer> s1, Stack<Integer> s2) {
				
		
				Stack<Integer> silo = new Stack<>();

		
				boolean match = true;
			
				if (s1.size() != s2.size()) {
					match = false;
					return match;

				} else {
					while (!s1.isEmpty() && !s2.isEmpty()) {
						int a = s1.pop();
						int b = s2.pop();
						silo.push(a);
						silo.push(b);

						if (a != b) {
							match = false;
						} 
					} 
				} 
				
				while (!silo.isEmpty()) {
					s2.push(silo.pop());
					s1.push(silo.pop());
				} 
			
				return match;
			} 
			
		} 