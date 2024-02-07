package lessons;

public class FactorialCLI {

	public static void main(String[] args) {


		int myInteger = 4;
		
		System.out.println(factorial(myInteger));
		

	}
	
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
}
