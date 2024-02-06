package lessons;
import java.util.Scanner;


public class AddCalculator {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;
		
		System.out.println("Enter first number: ");
		
		try {
			input1 = sc.nextInt();
		}
		
		catch(Exception e)  {
			
			System.out.println(e);
			System.exit(0);
		}
		
		System.out.println("Enter second number: ");

		try  {
			input2 = sc.nextInt();
		}
		
		catch(Exception e2)  {
			
			System.out.println(e2);
			System.exit(0);
		}
		
		System.out.println("Sum of " + input1 + " and " + input2 + " is: " + (input1 + input2));
	}

}
