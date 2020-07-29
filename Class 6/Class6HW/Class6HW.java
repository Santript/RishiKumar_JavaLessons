import java.util.ArrayList; //importing ArrayLists from java
public class Class6HW{
	public static void main(String[]args){
		ArrayList<String> fruits = new ArrayList<String>(); //creating new String arraylist called fruits
		fruits.add("orange"); //adding fruits(strings) to the "fruits" arraylist that I created
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("blueberry");
		fruits.add("melon");

		for(String element : fruits){ //printing out each element of the fruits arraylist
			System.out.println(element);
		}

		System.out.println(); //these print statements are just to add a space for clarity
		System.out.println();

		fruits.set(3,"strawberry"); //setting bluberry, which is at index 3, to "strawberry"

		for(String element : fruits){
			System.out.println(element);
		}

		System.out.println();
		System.out.println();

		System.out.println(fruits.get(1)); //gets the string element at index 1 of the "fruits" arraylist

		System.out.println();
		System.out.println();

		fruits.remove(1); //removes the element at index 1 of "fruits" arraylist

		for(String element : fruits){
			System.out.println(element);
		}
	}
}