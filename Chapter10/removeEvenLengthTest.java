import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class removeEvenLengthTest {

	@Test
	public void test() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Blackberry");
		list.add("Cherry");
		list.add("Melon");
		list.add("+");
		list.add("Durian");
		list.add("Elderberry");
		list.add("Fig");
		list.add("Grape");
		list.add("Honeydew");
		assertEquals(list.size(), 10);
	}

}
