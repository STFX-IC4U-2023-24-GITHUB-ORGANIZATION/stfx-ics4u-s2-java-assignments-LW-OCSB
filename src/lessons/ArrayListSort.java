package lessons;
import java.util.ArrayList;    // library for ArrayLists:
import java.util.Comparator;   // library for sorting inside ArrayLists:


public class ArrayListSort {

	public static void main(String[] args) {
		
		// variables
		ArrayList<String> row1 = new ArrayList();
		
		// add elements to Arraylist:
		row1.add("B");
		row1.add("A");
		row1.add("E");
		row1.add("D");
		row1.add("C");
		
		// print list
		System.out.println(row1);
		
		// append a new string to the end of Arraylist:
		row1.add("F");
		System.out.println(row1);
		
		// insert element inside list (will move everthing over)
		row1.add(2, "G");
		System.out.println(row1);
		
		// access elements by index
		System.out.println(row1.get(3));
		
		// check if list contains an element
		System.out.println(row1.contains("R"));
		System.out.println(row1.contains("A"));
		
		// find index of element in list
		System.out.println(row1.indexOf("C"));
		row1.add("C");
		System.out.println(row1);
		System.out.println(row1.indexOf("C"));

		// remove element in list
		row1.remove("G");
		System.out.println(row1);
		
		// display size
		System.out.println(row1.size());
		
		// Sort list ascending (numbers or letters)
		row1.sort(Comparator.naturalOrder());
		System.out.println(row1);
		
		// Sort list descending (numbers or letters)
		row1.sort(Comparator.reverseOrder());
		System.out.println(row1);
		
		// clear list
		row1.clear();
		System.out.println(row1);
		
	}

}
