import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class doubleListTest {

	@Test
	public void testDoubleList() {
		ArrayList<String> sentece = new ArrayList<String>();
		sentece.add("I"); 
		sentece.add("love");
		sentece.add("spring");
		assertEquals(sentece.size(), 3);

		ArrayList<String> clause = new ArrayList<String>();
		clause.add("The");
		clause.add("Beautiful");
		clause.add("Flowers");
		clause.add("Make");
		clause.add("Me");
		clause.add("Extremely");
		clause.add("Happy");
		clause.add("Every");
		clause.add("Day");
		assertEquals(clause.size(), 9);
	}

}
