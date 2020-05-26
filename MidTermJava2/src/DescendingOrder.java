// Seattle Central College
// ITC 155 - Data Structures
// Student: Alessandra Lima
// MidTerm Exam
//  
// Write a void method selectionSortDescendTrace() that takes an integer array, and sorts the array into descending order. 
// The method should use nested loops and output the array after each iteration of the outer loop, thus outputting the 
// array N-1 times (where N is the size). Complete main() to read in a list of up to 10 positive integers (ending in -1) 
// and then call the selectionSortDescendTrace() method.


import java.util.Arrays;
import java.util.Scanner;


public class DescendingOrder {

	public static void main(String[] args) {
		System.out.println("This program will use up to 10 integers and sort them into descending order.");
		System.out.print("Enter up to 10 integers and enter -1 to end: ");
		Scanner input = new Scanner(System.in);
		int userNumber = input.nextInt();
		int numElements = 0;
		int[] numbers = new int[10];
		
		while(userNumber != -1 && numElements <= 10) {
			numbers[numElements] = userNumber;
			numElements++;
			userNumber = input.nextInt();
		}
		
		input.close();
		
		numbers = Arrays.copyOf(numbers, numElements);
		selectionSortDescendTrace(numbers, numElements);
	}
	
	public static void selectionSortDescendTrace(int[] numbers, int numElements) {
		for(int i = 0; i < numbers.length - 1; i++){
			int larger = i;
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[larger] < numbers[j]) {
					larger = j;
				}
			}
			
			if(larger != i) {
				swap(numbers, larger, i);
			}
			
			System.out.println(Arrays.toString(numbers));
		}	
	}
	
	private static void swap(int[] numbers, int second, int first) {
		int temp = numbers[first];
		numbers[first] = numbers[second];
		numbers[second] = temp;	
	}
}
