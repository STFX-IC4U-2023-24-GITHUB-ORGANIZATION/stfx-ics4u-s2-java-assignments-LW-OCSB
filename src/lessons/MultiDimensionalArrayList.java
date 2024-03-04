package lessons;
import java.util.ArrayList;

public class MultiDimensionalArrayList {

	public static void main(String[] args) {

		// ArrayLists used for rows
		ArrayList<String> row1 = new ArrayList();
		ArrayList<String> row2 = new ArrayList();
		ArrayList<String> row3 = new ArrayList();
		ArrayList<String> row4 = new ArrayList();
		
		// ArrayList to hold rows
		ArrayList<ArrayList<String>> myList = new ArrayList();
		
		// Add data to row1
		row1.add("2010");
		row1.add("Nissan");
		row1.add("Altima");
		row1.add("Gold");
		
		// Add data to row2
		row2.add("2019");
		row2.add("Honda");
		row2.add("Accord");
		row2.add("White");
		
		// Add data to row3
		row3.add("2010");
		row3.add("Toyota");
		row3.add("Corola");
		row3.add("Black");
		
		// Add data to row4
		row4.add("2000");
		row4.add("Volkswagen");
		row4.add("Beetle");
		row4.add("Blue");
		
		// add rows to main list
		myList.add(row1);
		myList.add(row2);
		myList.add(row3);
		myList.add(row4);
		
		// print entire list
		//System.out.println(myList);
		 
		// loop through the list to control access/printing
		for (int i=0; i<myList.size(); i++)  {
			
			// temp test
			System.out.println(myList.get(i));
		}
		
		
	}

}
