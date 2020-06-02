import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class JTestIsStutter {

	

		@Test
		void test() {
				
			// Create two test Stacks--test1 has elements, while test2 is empty.
				Stack<Integer> test1 = new Stack<>();
				test1.push(8);
				test1.push(4);
				test1.push(2);
				
				Stack<Integer> test2 = new Stack<>();
				
				
				
			
				stutterStack.stutter(test1);
				stutterStack.stutter(test2);
				
				
			// Tests to verify output of methods are correct by calling the toString method.
				assertEquals("[8, 8, 4, 4, 2, 2]", test1.toString());
			    assertEquals("[]", test2.toString());
			    
			    
			}


	}