package lessons;
import java.util.Scanner;

public class MenuReview {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while (choice != 3)  {
			
			System.out.println("Menu Options: ");
			System.out.println("1. Enter 12 integers.");
			System.out.println("2. Do something ..");
			System.out.println("3. Exit");
			System.out.println("Choice: ");
			
			choice = sc.nextInt();
			
			if (choice == 1)  {
				enterTwelveIntegersMethod();
			}
		}

	}

	public static void enterTwelveIntegersMethod()  {
		
		// method code ...
	}
	
}
