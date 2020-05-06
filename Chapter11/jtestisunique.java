import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class JTestIsUnique {

	@Test
	void testTrue() {
		Map<String, String> maps = new HashMap<>();
		maps.put("Marty", "Stepp");
		maps.put("Stuart", "Reges");
		maps.put("Jessica", "Miller");
		maps.put("Amanda", "Camp");
		maps.put("Hal", "Perkins");
		assertEquals(true, Unique.isUnique(maps));
	}
	
	@Test
	void testFalse() {
		Map<String, String> maps = new HashMap<>();
		maps.put("Kendrick", "Perkins");
		maps.put("Stuart", "Reges");
		maps.put("Jessica", "Miller");
		maps.put("Bruce", "Reges");
		maps.put("Hal", "Perkins");
		assertEquals(false, Unique.isUnique(maps));
	}
	
	@Test
	void testEmpty() {
		Map<String, String> maps = new HashMap<>();
		assertEquals(true, Unique.isUnique(maps));
	}

}