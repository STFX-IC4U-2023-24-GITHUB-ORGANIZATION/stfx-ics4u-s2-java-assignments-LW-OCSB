package lessons;
import java.util.ArrayList;

public class ArrayListsAgain {

	public static void main(String[] args) {

		ArrayList<Integer> orderedCards = new ArrayList();
		ArrayList<Integer> gameBoard = new ArrayList();
		
		// populate orderedCards
		for (int i=0; i<8; i++)  {
			orderedCards.add(i);
			orderedCards.add(i);
		}
		
		System.out.println(orderedCards);
		
		// remove first element of orderedCards and put in gameBoard
		gameBoard.add(orderedCards.get(0));
		orderedCards.remove(0);
		
		System.out.println("Ordered Cards: " + orderedCards);
		System.out.println("Game Board: " + gameBoard);
	}

}
