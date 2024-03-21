package lessons;

public class RandomNumbers {

	public static void main(String[] args) {
		
		int n = 3;

		// Random number between 0 to n.
		System.out.println(   (int)(Math.random() * (n+1))   );

		// Random number between 1 to n.
		System.out.println(   (int)(Math.random() * n)  + 1  );

	}

}
