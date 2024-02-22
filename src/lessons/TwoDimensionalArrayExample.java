package lessons;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
		
		// variables
		double retailValue = 0.0;
		double totalTax = 0.0;
		int totalNumBars = 0;
		final double TAX_RATE = 0.13;
		double grandTotal = 0.0;
		int rows = 4;
		int cols = 2;
		double[][] chocolateInventory = new double[rows][cols];
		
		// Kit Kat
		chocolateInventory[0][0] = 5;
		chocolateInventory[0][1] = 2.50;
		
		// Aero
		chocolateInventory[1][0] = 103;
		chocolateInventory[1][1] = 1.99;
		
		// Mr. Big
		chocolateInventory[2][0] = 2;
		chocolateInventory[2][1] = 2.25;
		
		// O Henry
		chocolateInventory[3][0] = 18;
		chocolateInventory[3][1] = 2.39;
		
		// Total number of chocolate bars:
		for (int i=0; i<rows; i++)  {
			
			totalNumBars = totalNumBars + (int)chocolateInventory[i][0];
		}
		
		System.out.println("Total number of chocolate bars: " + totalNumBars);
		
		//  Total retail value (without tax)

		// loop through all rows
		for (int i=0; i<rows; i++)  {
				
			retailValue = retailValue + chocolateInventory[i][0] * chocolateInventory[i][1];
		}
		
		System.out.println("Total retail value: $" + retailValue);
		
		// Add tax and round answer:
		grandTotal = retailValue + (retailValue * TAX_RATE);
		
		grandTotal = grandTotal * 100;
		grandTotal = Math.round(grandTotal);
		grandTotal = grandTotal / 100;
		
		System.out.println("Total value with tax: $" + grandTotal);
		
	}

}
