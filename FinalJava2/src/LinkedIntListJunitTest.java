import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LinkedIntListJunitTest {

	@Test
	void testFullTrue() {
		LinkedIntList list = new LinkedIntList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		assertTrue(list.hasTwoConsecutive());	
	}
	
	void testOneTrue() {
		LinkedIntList list = new LinkedIntList();
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(7);
		
		assertTrue(list.hasTwoConsecutive());	
	}
	
	@Test
	void testFalse() {
		
		LinkedIntList list = new LinkedIntList();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		
		assertFalse(list.hasTwoConsecutive());
	}

	@Test
	void testSingleElement() {
		
		LinkedIntList list = new LinkedIntList();
		list.add(5);
		
		
		assertFalse(list.hasTwoConsecutive());
	}
	
	@Test
	void testEmpty() {
		
		LinkedIntList list = new LinkedIntList();
		
		
		assertFalse(list.hasTwoConsecutive());
	}
	
	@Test
	void testIdentical() {
		
		LinkedIntList list = new LinkedIntList();
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		
		
		assertFalse(list.hasTwoConsecutive());
	}
}
