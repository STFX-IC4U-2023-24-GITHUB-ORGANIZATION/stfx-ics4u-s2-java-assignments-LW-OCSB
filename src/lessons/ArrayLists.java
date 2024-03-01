package lessons;

// must import library for Arraylists:
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		/*  ARRAYS - fixed size upon creation
         *         - can hold PRIMITIVES and OBJECTS
		 *         - must create methods to manipulate contents
		 *         - uses less memory than arraylists
		 * 
		 *  ARRAYLISTS - dynamic (not fixed in size)
		 *             - can ONLY hold OBJECTS
		 *             - contains predefined methods to manipulate contents
		 *             - uses more memory than arrays
		 */
		
		// There are several ways to create ArrayLists in Java:
		
		// Can specify size upon creation (not useful)
		// ArrayList<Object-type> variableName = new ArrayList<Object-type>(<size>);
		ArrayList<String> myArrayList1 = new ArrayList<String>(10);
		
		// Can create empty list
		// ArrayList<Object-type> variableName = new ArrayList<Object-type>();
		ArrayList<String> myArrayList2 = new ArrayList<String>();
		
		// Most common way to create ArrayLists:
		// ArrayList<Object-type> variableName = new ArrayList<>();
		ArrayList<String> myArrayList3 = new ArrayList<>();
		
		// Easiest way to create ArrayLists:
		// ArrayList<Object-type> variableName = new ArrayList();
		ArrayList<String> myArrayList4 = new ArrayList();
		
		// WORKING EXAMPLE
		ArrayList<String> students = new ArrayList();
		
		// Add class to list:
		students.add("Jordan");
		students.add("Sage");
		students.add("Ayden");
		students.add("Nicholas");
		
		// print whole list
		System.out.println(students);
		
		// print size of list
		System.out.println(students.size());
	
		// loop through list
		for (int i=0; i<students.size(); i++)  {
			
			System.out.println(students.get(i));
		}
		
		// optional method for looping ArrayLists
		for (String i : students)  {
			System.out.println(i);
		}
	}

}
