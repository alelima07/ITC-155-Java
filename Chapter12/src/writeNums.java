
public class writeNums {

	public static void main(String[] args) {
		
				writeNbrs(4);	
				System.out.println();	
				writeNbrs(0);	
			}
			
		// method that accepts an integer as a parameter
			public static void writeNbrs (int n) {
				
	
				if (n < 1) {
					throw new IllegalArgumentException();
					
		
				} else if (n == 1) {
					System.out.print("1");
					
				} else {
					writeNbrs(n-1);
					System.out.print(", " + n);
					
				} 
			} 
		} 
