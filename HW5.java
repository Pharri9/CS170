/*Patrick Harris
Pharri9
Section 004
I worked on the assignment alone, using only this semester's materials' 
and notes'. */
public class HW5 {

	/* the method removeRepeatsFor(String repeats) uses a for loop to remove consecutive repeated letters out of an imputed word
	@ param a string with or without repeats 
	@ return a string without repeats
	*/ 
	public static String removeRepeatsFor(String repeats) {

		String withoutRepeats = "";

		for (int i = 0; i <repeats.length(); i++) {
			char letter1 = repeats.charAt(i);
			
			//occurs when there are two or more characters left
			if (i +1  <repeats.length()) {
				char letter2 = repeats.charAt(i +1);
			
				if (letter1 != letter2) {
				withoutRepeats = withoutRepeats + letter1;

			// occurs when there is one character left
		}} else {
				withoutRepeats = withoutRepeats + letter1;
				return withoutRepeats;
			}
		}
		return withoutRepeats;
	}


	/* the method removeRepeatsWhile(String repeats) uses a while loop to remove consecutive repeated letters from the imputed string
	@param a string with or without repeats
	@return a string without repeats */

	public static String removeRepeatsWhile(String repeats) {

		String withoutRepeats = "";
		int i = 0;
		char letter1;
		char letter2;
		while (i < repeats.length()) {

		//occurs when there are two or more characters left
		if (i + 1 < repeats.length()) { 
			letter1 = repeats.charAt(i); 
			letter2 = repeats.charAt(i+1);
		if (letter1 != letter2) {
		withoutRepeats = withoutRepeats + letter1;
		} 
		i= i+1; }

		// occurs when there is one character left
		else {
			letter1 = repeats.charAt(i);
			withoutRepeats = withoutRepeats + letter1; 
			return withoutRepeats; 
		}} return withoutRepeats; 
	}
	/* the method removeRepeatsRecursive(String repeats) uses recursion to remove consecutive repeated letters from an imputed string
	@param a string with or without repeats
	@return a string without repeats */
	
	public static String removeRepeatsRecursive(String repeats) {

		//occurs when there are two or more characters left
		if (repeats.length() > 1) {
			char letter1 = repeats.charAt(0);
			char letter2 = repeats.charAt(1);
			int length = repeats.length();

			//occurs when the letters are different and there are two or more characters left
			if (letter1 != letter2) {
				String withoutRepeats = letter1 + removeRepeatsRecursive(repeats.substring(1, length));
				return withoutRepeats; 
		} 
			//occurs when the letters are the same and there are two or more characters left	
			else if (letter1 == letter2) {
				String withoutRepeats = removeRepeatsRecursive(repeats.substring(1,repeats.length()));
				return withoutRepeats; 
		}} 
			// occurs when there is only one character left
			else {
				char letter1 = repeats.charAt(0);
				String withoutRepeats = letter1 + "";
				return withoutRepeats;
			}   
			return "";
	} 

	/* the method commonNums(int[] first, int[] second) counts the number of elements two arrays have in common 
	@param two integer arrays of any size without repeated numbers 
	@return an integer representing the number of values the arrays have in common 
	*/
	public static int commonNums(int[] first, int[] second) {

		//this variable will count the number of elements the arrays have in common
		int count = 0;

		//this loop changes what value in the first array is being inspected
		for (int indexFirst = 0; indexFirst < first.length; indexFirst++) {

			//this loop changes what value in the first array is being inspected
			for (int indexSecond =0; indexSecond< second.length; indexSecond++) {
				if (first[indexFirst] == second[indexSecond]) {
					count ++;
			}	}
			
		} return count;
	}

	/* The method luhnChecksum(int[] cardNumbers) determines whether an imputed credit card number is valid
	@param an integer array representing a creditcard number 
	@return an integer representing the Checksum value of the creditcard*/
	public static int luhnChecksum(int[] cardNumbers) {
		
		//these variables will keep track of the Checksum and term values in the credit card
		int checkSum = 0;
		int term = 0;

		// runs when there is a number left to be read from the credit card, computes the Checksum algorithm
		for(int i=0; i<cardNumbers.length; i++){

			// multiplies every other term by two
			if(i%2==0){
				term = cardNumbers[i]*2;
				//checks if the number is less than ten
				if (term>=10){
					term = term/10 + term%10;
				} 
				checkSum += term;
			// adds every other term to the checkSum
			} else {
				term = cardNumbers[i];
				checkSum += term;
			}
		} 
		return checkSum;
	}
	public static void main(String [] args) {
		System.out.println(removeRepeatsFor("aaaabbc@@"));
		System.out.println(removeRepeatsWhile("aaabbbcad"));
		int[] first = new int[3];
		first[0] = 2;
		first[1] = 0;
		first[2] = 3;
		int[] second = new int[2];
		second[0] = 2;
		second[1] = 3;
		System.out.println(removeRepeatsRecursive("aaabbbcad"));
		System.out.println(commonNums(first, second));
		int[] cardNumbers = new int[6];
		cardNumbers[0] = 4;
		cardNumbers[1] = 5;
		cardNumbers[2] = 6;
		cardNumbers[3] = 3;
		cardNumbers[4] = 9;
		cardNumbers[5] = 2;
		System.out.println(luhnChecksum(cardNumbers));
	}

}
