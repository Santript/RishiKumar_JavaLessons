public class Class2HW{
	public static void main(String[]args){

		boolean value = true;
		//The "!" operator is representative of "not"
		boolean newValue = !value;
		//This is the new value: false
		System.out.println("This is the new value: "+newValue);


		char grade = 'A';
		//I got an A on my test!
		System.out.println("I got an "+grade+" on my test!");


		String str = "This is how you declare and initialize a string.";
		int lengthOfString = str.length();
		int index = str.indexOf("and");
		String partialString = str.substring(8,11);

		System.out.println("This is the length of the string: " + lengthOfString);
		System.out.println("This is the index of the word and: " + index);
		System.out.println("This is a word from the original string: " + partialString);

	}
}