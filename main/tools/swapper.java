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

	public static ArrayList swap (String word) {
    	ArrayList<String> charList = new ArrayList<String>();
    	for (int i=0; i<word.length(); i++) {
        	String strElem = Character.toString(charAt(i));
        	charList.add(strElem);
    	}
    	shuffle(charList);
    	return charList;
	}

	public static void main(String[] args)
	{
		System.out.println(swap("bonjour"));
	}
}