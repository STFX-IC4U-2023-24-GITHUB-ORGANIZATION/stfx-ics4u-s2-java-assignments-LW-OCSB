package lessons;

public class TwoDimensionArrays {

	public static void main(String[] args) {
		
		// dataType[][] variableName = new dataType[3][3];
		
		// Examples:
		String[][] twoDStrings = new String[4][3];
		int[][] twoDInts = new int[2][2];
		
		// Alternatively, create in 2 lines:
		double[][] twoDDoubles;
		twoDDoubles = new double[7][7];
		
		// Assigning data to 2D Arrays:
		twoDInts[0][0] = 7;
		twoDInts[0][1] = 4;
		twoDInts[1][0] = 8;
		twoDInts[1][1] = 13;
		
		// Accessing data from 2D Arrays:
		System.out.println(twoDInts[1][1]);
		
		// Command to determine number of rows:
		System.out.println("Number of rows: " + twoDInts.length);
		
		// Command to determine number of columns:
		System.out.println("Number of columns: " + twoDInts[0].length);
		
		// Accessing all contents (use nested loops)
		
		// loop through all rows:
		for (int i=0; i<twoDInts.length; i++)  {
			
			// loop through all columns:
			for (int j=0; j<twoDInts[0].length; j++)  {
				
				System.out.println(twoDInts[i][j]);
			}
		}

	}

}
