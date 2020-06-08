// Seattle Central College
// ITC 155 - Data Structures
// Student - Alessandra Lima
// 
// isSorted - Ch16, Ex3, p1023
//  
// isSorted -  A method that is added to the LinkedIntList class.
//  Write a method called isSorted that returns true if the list is in
//  sorted (nondecreasing) order and returns false otherwise. An empty
//  list is considered to be sorted.


// Class LinkedIntList can be used to store a list of integers.
public class LinkedIntList {
	
	private ListNode front;
	
	public LinkedIntList() {
		front = null;
	}
	

public void add(int value) {
	if(front == null) {
		front = new ListNode(value);
	} else {
		ListNode current = front;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new ListNode(value);
	}
}
//isSorted method that returns a boolean
public boolean isSorted(){
	
	ListNode current = front;
	while(current != null && current.next != null){
        if(current.data > current.next.data){
            return false;
        }
        current = current.next;
    }
    return true;
}
}