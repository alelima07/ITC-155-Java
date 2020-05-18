/* Seattle Central College
 * Student: Alessandra Lima
 * Java - Chapter 13 pg. 888 exercise 4
 * To which complexity class does the following algorithm belong? Consider N to be the
 * length or size of the array or collection passed to the method. Explain your reasoning.
 * 
 * public static int[] mystery1(int[] list){
 *     int[] result = new int[2 * list.length];
 *     for(int i = 0; i < list.length; i++){
 *         result[2 * i] = list[i] / 2 + list[i] % 2;
 *         result[2 * i + 1] = list[i] / 2;
 *     }
 *     return result;
 * }
 * 
 * My answer for this complexity class is 0(N). N is the size of the array. 
 * It is a simple loop, not nested loops, and it executes once for each element in the list.
 * So it is O(N).
 * It is actually O(2N), because it does 2 operations inside the loop for each array element.
 * But for algorithm complexity, I just round off to the nearest order of magnitude, which is O(N).
 */

/* pg. 888 exercise 5
 * To which complexity class does the following algorithm belong?
 * public static void mystery2(int[] list){
 *     for(int i = 0; i < list.length / 2; i++){
 *         int j = list.length - 1 - i;
 *         int temp = list[i];
 *         list[i] = list[j];
 *         list[j] = temp;
 *     }
 * }
 * 
 * My answer for this complexity class is 0(N). There is a for loop with an iterator (i++) that indicates 
 * traversal of the array. The statements in the for loop are swapping assignments, which corresponds to 1/2N
 * which equates to 0(N).
 */


/* The following class is a modified version of the selection sort algorithm that selects the 
 * largest element each time and moves it to the end of the array, rather than selecting the 
 * smallest element and moving it to the beginning.
 * Will this sort be faster than the standard selection sort, and what will the complexity class
 * (big-Oh) be? The complexity class of the modified version would O(N^2), which isn't any faster
 * than the standard. */

public class Chapter13Ex18 {

}
