import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Main
{
	// Generic method to randomize a list in Java using Fisher–Yates shuffle
	public static<T> void shuffle(List<T> list){
		Random random = new Random();

		// start from the end of the list
		for (int i = list.size() - 1; i >= 1; i--){
			// get a random index `j` such that `0 <= j <= i`
			int j = random.nextInt(i + 1);

			// swap element at i'th position in the list with the element at
			// randomly generated index `j`
			T obj = list.get(i);
			list.set(i, list.get(j));
			list.set(j, obj);
		}
	}

	// Optimized mix of the word letters 
	public static String swap (String word) {
		int idem = 0; // Nb of letters at same place after shuffle
		int percent; // Percent of similarity between word and swappedword
		ArrayList<String> charList = new ArrayList<String>(); // List containing letters
		for (int i=0; i<word.length(); i++) { // Read each letter of word
			String strElem = Character.toString(word.charAt(i)); // Convert char i of word into string
			charList.add(strElem); // Add letter to a list
		}
		shuffle(charList); // Mix list first time
		String swappedword = String.join("", charList); // List elements concatenate into string
		for (int i=0; i<word.length(); i++) { // Read each letter of the swappedword
			if (word.charAt(i) == swappedword.charAt(i)){ // Check same letters at same place between word/swappedword
				idem++; // Nb of same letters
			}
		}
		percent = idem/(word.length()*100); // Percent of similarity between word and swapped word
		while (percent>=10 || word.charAt(0) == swappedword.charAt(0)){ // Remix until similarty low enough and first letter different
			shuffle(charList);
			swappedword = String.join("", charList);
			for (int j=0; j<word.length(); j++) {
				if (word.charAt(j) == swappedword.charAt(j)){
					idem++;
				}
			}
			percent = idem/(word.length()*100);

		}
		return swappedword;
	}

	public static void main(String[] args)
	{
		System.out.println(swap("lorenzo"));
	}




}