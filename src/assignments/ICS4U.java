package assignments;

public class ICS4U {

	// DESCRIPTION - Calculates factorial of non-negative integer.  Returns -1 if parameter is negative.
	// PARAMETERS - int n
	// RETURN - int
	public static int factorial(int n)  {
		
		int answer = 1;
		
		if (n < 0)  
			// sentinel value
			return -1;
		
		else if ( (n == 0) || (n == 1) )
			return answer;
		
		else  {
			
			while (n > 1)  {
			
				answer = n * answer;
				n--;
			}
			
			return answer;
		}
	}
	
	
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
	
	
	// DESCRIPTION - Displays "Hello World!" to console
	// PARAMETER - NA
	// RETURN TYPE - void
	protected static void helloWorld()  {
			
		System.out.println("Hello World!");
	}
	
}
