import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class PalindromeTest {

	@Test
	void test() {
		// Create three test Queues for various results
				Queue<Integer> test1 = new LinkedList<>();	//This is a palindrome
				test1.add(5);
				test1.add(3);
				test1.add(1);
				test1.add(1);
				test1.add(5);
				test1.add(3);
					
				Queue<Integer> test2 = new LinkedList<>();	//This is NOT a palindrome
				test2.add(9);
				test2.add(8);
				test2.add(7);
				test2.add(2);
				test2.add(3);
				test2.add(2);
				
				Queue<Integer> test3 = new LinkedList<>(); //is empty - is a palindrome
					
					
					
		// Call the method for each test Queue.
				palindromeQueue.isPalindrome(test1);
				palindromeQueue.isPalindrome(test2);
				palindromeQueue.isPalindrome(test3);
					
					
		// Tests 
				assertTrue(palindromeQueue.isPalindrome(test1));
				assertFalse(palindromeQueue.isPalindrome(test2));
				assertTrue(palindromeQueue.isPalindrome(test3));
				
		// Tests 
				assertEquals("[5, 3, 1, 1, 5, 3]", test1.toString());
				assertEquals("[9, 8, 7, 2, 3, 2]", test2.toString());
			    assertEquals("[]", test3.toString());
			    
	}

}
