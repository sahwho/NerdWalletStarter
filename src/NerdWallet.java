import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class NerdWallet {
	public enum Preference {
		CASHBACK, TRAVELREWARDS, DEFAULT
	}
	public static void main(String[] args) {
		
		// create an ArrayList<CreditCard> to hold the info from the file
		ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
		
		try {
			Scanner in = new Scanner(new FileReader("C:\\Users\\SAHUVIKA\\eclipse-workspace\\NWInstructor\\src\\cards.txt"));
			while (in.hasNext()) {
				// TODO: implement logic here
				
				String s = in.next();
				// Note: in.next() will give you the line from the file cards.txt as a String
				// you'll need to parse the input and invoke the correct constructor based on 
				// what kind of derived card is, then add it to the ArrayList.
			}
		} catch (FileNotFoundException e) {//could throw exception if file not found
			e.printStackTrace();
		}
		
		Scanner userInput = new Scanner(System.in);
		String runAgain;
		Preference p = Preference.DEFAULT;
		
		//event loop:
		do {
			String pref;
			do {
				System.out.println("Which is more valuable to you, Cash Back or Travel Rewards? (enter \"CASH\" or \"TRAVEL\")");
				pref = userInput.nextLine();
			} while (!(pref.trim().toUpperCase().equals("CASH") || pref.trim().toUpperCase().equals("TRAVEL")));
			
			if (pref.trim().toUpperCase().equals("CASH")) {
				p = Preference.CASHBACK;
			} else if (pref.trim().toUpperCase().equals("TRAVEL")) {
				p = Preference.TRAVELREWARDS;
			}
			
			ArrayList<CreditCard> filteredCards = filter(cards, p);
			insertionSort(filteredCards);
			
			//TODO: using a for-each loop, print each card after sorting on separate lines
			
			System.out.println("Want to run the card suggestion code again? (enter \"Y\" or \"N\")");
			runAgain = userInput.nextLine();
		} while (runAgain.trim().toUpperCase().equals("Y"));
	}
	
	//TODO: implement
	//@Param Preference p: whether the user prefers CashBack or TravelRewards
	//@Returns an ArrayList of CreditCard Objects, which will in actuality
	//be of the derived type, either CashBackCard or TravelRewardsCard
	public static ArrayList<CreditCard> filter(ArrayList<CreditCard> cards, Preference p) {
		return null;
	}
	
	//TODO: implement`
	public static void insertionSort(ArrayList<CreditCard> cards) {
		
	}
}
