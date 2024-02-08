package lessons;

public class FibonacciCLI {

	public static void main(String[] args) {
	
		//  Fibonacci sequence:
		//  0  1  1  2  3  5  8  13
		
		int sequenceNumber = 7;
		System.out.println(fibonacci(sequenceNumber));
	}

	// HANDLE CASES:
	// 1. negative numbers (and Strings, etc ..) - DONE
	// 2. first in sequence  - DONE
	// 3. second in sequence - DONE
	// 4. third in sequence - DONE
	// 5. fourth in sequence ...  *****
	
	// DESCRIPTION - Returns value of Fibonacci sequence number.
	//				 Returns -1 for invalid input (zero and negative integers).
	// PARAMETERS - int s
	// RETURN TYPE - int
	public static int fibonacci(int s)  {
		
		int first = 0;
		int second = 1;
		int third = 0;
		
		if (s <= 0)
			return -1;
		
		else if (s == 1)
			return first;
		
		else if (s == 2)
			return second;
		
		else {
			
			for (int i=0; i<s-2; i++)  {
				
				third = first + second;
				first = second;
				second = third;
			}
			
			return third;
		}
	}
	
}
