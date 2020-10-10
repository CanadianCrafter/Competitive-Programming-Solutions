import java.util.Scanner;
public class CCC02J2AmeriCanadian {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word;
		String newWord;
		
		do{
			word = input.next(); //asks for each word
			if (word.equals("quit!")) {
				break;
			}
			newWord = canadian(word);
			System.out.println(newWord);
			
		}while(word !="quit!");
		
	}

	private static String canadian(String word) {
		String newWord;
		String subString;
 
		if (word.length() > 4 && word.substring(word.length()-2, word.length()).equals("or")
				&& word.charAt(word.length()-3) != 'a' && word.charAt(word.length()-3) != 'e' 
				&& word.charAt(word.length()-3) != 'i'
						&& word.charAt(word.length()-3) != 'o' 
						&& word.charAt(word.length()-3) != 'u' && word.charAt(word.length()-3) != 'y'){
			subString = word.substring(0, word.length()-2);
			newWord = subString + "our";
		}
		else {
			newWord = word;
		}
	

		return newWord;
	}
}
