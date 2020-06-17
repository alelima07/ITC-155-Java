// Seattle Central College
// ITC 155 - Data Structures
// Student - Alessandra Lima
// Final Exam
// Write a method called hasTwoConsecutive that returns whether or not
// a list of integers has two adjacent numbers that are consecutive
// integers (true if such a pair exists and false otherwise). 

public class LinkedIntList {
    private ListNode front;  

    
    public LinkedIntList() {
        front = null;
    }

   public boolean hasTwoConsecutive() {
	   ListNode current = front;
	   
	   if (current == null) {
		   return false;
		   
	   } else {
		   while (current.next !=null) {
			   if (current.data + 1 == current.next.data) {
				   return true;
			   } 
			   
			current = current.next;
		   } 
	   } 
	   
	   return false;   
   }  
    
    
    public boolean isSorted() {
    
		boolean sorted = false;
		ListNode begin = front;
		
		if (begin == null) {
			sorted = true;
			return sorted;
			
		} else {
			while (begin.next != null) {
				if (begin.next.data < begin.data) {
					return sorted;
				} else {
					begin = begin.next;
				}
			}

		sorted = true;
		}

	return sorted;	
	}
    
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public int get(int index) {
        return nodeAt(index).data;
    }

    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current !=  null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

   
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    
    
}
