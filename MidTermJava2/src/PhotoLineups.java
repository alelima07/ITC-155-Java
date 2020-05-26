// Seattle Central College
// ITC 155 - Data Structures
// Student: Alessandra Lima
// MidTerm Exam
//  
// Write a program that lists all ways people can line up for a photo(all permutations of a list of Strings).
// The program will read a list of one word names(until-1), and use a recursive method to create and output
// all possible orderings of those names,one ordering per line.

import java.util.Scanner;
import java.util.ArrayList;


public class PhotoLineups {
	public static void main(String[] args) {
		Scanner newScanner = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> permList = new ArrayList<String>();
		
		System.out.print("Enter a list of names, to quit just enter -1 at the end of the list: ");
		String name = newScanner.next();
		
		while(!name.equals("-1")) {
			nameList.add(name);
			name = newScanner.next();
		}
		
		newScanner.close();
		
		allPermutations(permList, nameList);
		for(String perm : permList) {
			System.out.println(perm);
		}
	
	}
	
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		permutationsHelper(permList, nameList, 0, nameList.size() - 1);
	}
	
	private static void permutationsHelper(ArrayList<String> permList, ArrayList<String> nameList, int startIndex, int endIndex) {
		
		 if(startIndex == endIndex) {
			 String namesPerm = ""; //Adds a string of names 
			 for(String name : nameList) {
				 namesPerm+=name + " ";
			 }
			 
			 
			 permList.add(namesPerm);
			 
		 } else { 
			 for(int i = startIndex; i <= endIndex; i++) {
				 swap(nameList, startIndex, i); 
				 permutationsHelper(permList, nameList, startIndex + 1, endIndex);
				 swap(nameList, startIndex, i);
			 }
		 }
	}
	
	private static void swap(ArrayList<String> arr, int start, int i) {
		String temp = arr.get(start);
		arr.set(start, arr.get(i));
		arr.set(i, temp);
	}
	
}