import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JTestIsChapter13Ex18 {
	@Test
	void testFull() {
		int[] nums = {3, 6, 24, 6, 2, 0, 21, 5, 10};
		int[] checkNums = {0, 1, 2, 5, 5, 6, 9, 23, 23};
		ModifiedSelectionSort sort = new ModifiedSelectionSort();
		sort.selectionSort(nums);
		assertArrayEquals(checkNums, nums);
	}
	
	@Test
	void testEmpty() {
		int[] nums = new int[0];
		ModifiedSelectionSort sort = new ModifiedSelectionSort();
		sort.selectionSort(nums);
		assertEquals(0, nums.length);
	}

}
}
