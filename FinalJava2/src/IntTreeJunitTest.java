import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IntTreeJunitTest {

	@Test
	void testLargeTree() {
		IntTree test1 = new IntTree(12);
        System.out.println("Large/Even Node Tree structure:");
        test1.printSideways();

        assertFalse(test1.isFull());
	}
	
	@Test
	void testSmallTree() {
		IntTree test2 = new IntTree(3);
		System.out.println("Small/Odd Node Tree structure:");
        test2.printSideways();

        assertTrue(test2.isFull());
	}
	
	@Test
	void testSingleNodeTree() {
		IntTree test3 = new IntTree(1);
		System.out.println("Single Node Tree structure:");
        test3.printSideways();

        assertTrue(test3.isFull());
	}
	
	@Test
	void testNullTree() {
		IntTree test4 = new IntTree();
		System.out.println("Null Tree structure:");
	    
		assertTrue(test4.isFull());
	}

}
