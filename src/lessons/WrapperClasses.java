package lessons;
import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		
		// You can't put primitives in ArrayLists
		// Java provides classes which correspond to EVERY primitive type
		// Wrapper classes encapsulate, or wrap primitives within an object
		
		// Wrapper classes include:
		
		/*
			Byte - wraps byte
			Short - short
			Integer - int
			Long - long
			Float - float
			Double - double
			Character - char
			Boolean - boolean
		 */
		
		// ArrayList
		ArrayList<Boolean> myArrayList = new ArrayList();
		
		// Wrapper classes 
		boolean myBoolean1 = true;
		Boolean myBoolean2 = true;

		myArrayList.add(myBoolean1);  // converted boolean to Boolean "boxing"
		myArrayList.add(myBoolean2);
		
	
		
		
	}

}
