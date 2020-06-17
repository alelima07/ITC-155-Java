
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;


class StackQueueTest {

	@Test
	void test() {
		Stack<Integer> test1 = new Stack<>();
		test1.push(6);
		test1.push(3);
		test1.push(9);
		

		Stack<Integer> test2 = new Stack<>();
		test2.push(6);
		test2.push(3);
		test2.push(9);
		

		Stack<Integer> test3 = new Stack<>();
		test3.push(6);
		test3.push(3);
		test3.push(4);
		
		Stack<Integer> test4 = new Stack<>();
		test4.push(6);
		test4.push(3);
		test4.push(9);
		test4.push(5);
		test4.push(11);
		
		Stack<Integer> test5 = new Stack<>();
		Stack<Integer> test6 = new Stack<>();

		
		assertTrue(StackQueueProblem1.equals(test1, test2));
		
		assertEquals("[6, 3, 9]", test1.toString());
		assertEquals("[6, 3, 9]", test2.toString());
		
		assertFalse(StackQueueProblem1.equals(test1, test3));
		
		assertEquals("[6, 3, 4]", test3.toString());
		
		assertFalse(StackQueueProblem1.equals(test1, test4));
		
		assertEquals("[6, 3, 9, 5, 11]", test4.toString());
		
		assertTrue(StackQueueProblem1.equals(test5, test6));
		
		assertEquals("[]", test5.toString());
		assertEquals("[]", test6.toString());
		
	}

}

