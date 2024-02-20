package lessons;

public class OneDimensionalArrays {

	public static void main(String[] args) {
		
		// Java Arrays, single identifier with indexes (starting at 0)
		// holds ELEMENTS of any SINGLE TYPE (primitives, objects)
		// NOT dynamic (can't grow after creation)
		// Syntax:
		//
		// datatype[] arrayIdentifier = new datatype[arraySize];
		
		// EXAMPLES:
		
		String[] myStringArray = new String[13];
		int[] myIntarray = new int[7];
		
		// ALTERNATIVELY:
		
		String[] myStringArray2;   // declaration
		myStringArray2 = new String[13];  // memory allocation
		
		// WORKING EXAMPLE 1:
		int[] myIntArray2 = new int[3];
		myIntArray2[0] = 15;
		myIntArray2[1] = 18;
		myIntArray2[2] = 5;
		
		// WORKING EXAMPLE 2:
		int[] myIntArray3 = {15, 66, 35};
		
		// Array "Method"
		System.out.println(myIntArray3.length);
		
		// Loop through array:
		for (int i=0; i<myIntArray3.length; i++)  {
			
			System.out.println(myIntArray3[i]);
		}
		
		// ArrayIndexOutOfBounds Excpetion Error:
		System.out.println(myIntArray3[4]);

	}

}
