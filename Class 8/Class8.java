public class Class8{
	public static void main(String[]args){
		// String[] strArray = {"hello", "bye", "fish", "dish", "bone"};
		// System.out.println(stringCount(strArray, 5));

		// System.out.println();

		// System.out.println(repeatWordSep("Hello","AND",5));
		// System.out.println(sumOfDigits(989));
		//System.out.println(reversedWord("table"));
		//System.out.println(hasLastSameDigit(13,22)); //false
		System.out.println(isPalindrome("hello")); //true

	}

	//Given an array of strings, return the number of strings with the specified length

	public static int stringCount(String[]str, int length){
		int count = 0;
		for(int i = 0 ; i < str.length ; i++){
			if(str[i].length() == length){
				count+=1;
			}
		}
		return count;
	}

	//Given a word, a separator, and a number, return the wrod and separator with the count of occurences based on the number
	// repeatWordSep("Word","X",3) --> WordXWordXWord
	public static String repeatWordSep(String word, String separator, int numOccurences){
		String finalString = "";
		finalString += word; // finalString = finalString + word;

		numOccurences--; //numOccurences = numOccurences - 1

		for(int i = 0 ; i < numOccurences ; i++){
			finalString += separator;
			finalString += word;
		}
		return finalString;
	}

	//Given a number, return the sum of its digits
	//sumOfDigits(12) --> 3
	//sumOfDigits(234) --> 9

	public static int sumOfDigits(int num){
		int sum = 0;
		while(num > 0){
			int mod = num % 10;
			sum = sum + mod;
			num /= 10; // num = num / 10
		}
		return sum;
	}

	//Given a string, return the same string reversed
	//reverseString("hello") --> olleh
	//String word = "hello";
	//print(word.charAt(1)) --> 'e'
	public static String reversedWord(String word){
		String reversedWord = "";
		for(int i = word.length() - 1 ; i >=0 ; i--){
			reversedWord += word.charAt(i);
		}
		return reversedWord;
	}

	//given two integers, return whether they have the same last digit
	//hasLastSameDigit(12,22) --> true
	//hasLastSameDigit(10,23) --> false
	// 256784 --> 256784 % 10 = 4

	public static boolean hasLastSameDigit(int num1, int num2){
		if((num1 % 10) == (num2 % 10)){
			return true;
		}
		else{
			return false;
		}
	}

	//Given a string, return whether it is a palindrome
	// racecar
	public static boolean isPalindrome(String word){
		String reversedWord = "";
		for(int i = word.length() - 1 ; i >=0 ; i--){
			reversedWord += word.charAt(i);
		}
		if(word.equals(reversedWord)){
			return true;
		}
		else{
			return false;
		}
	}
}