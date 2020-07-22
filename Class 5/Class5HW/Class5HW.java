import java.util.Scanner; //importing Scanner from Java class
import java.util.Arrays; //importing Arrays from Java class
public class Class5HW{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in); //creating a new scanner object called "scan"
		System.out.print("How long do you want the array to be?"); //prompt the user for the length of the array
		int num = scan.nextInt(); //whatever number the user types in will be stored in this variable

		int[] arr = new int[num]; //creating new array called "arr" and setting it to the length of the variable num^
		System.out.println(Arrays.toString(arr)); //printing out the array using Arrays.toString (should print out a bunch of 0's)

		int count = 0; //creating new variable called count and setting it to 0
		for(int i = 0 ; i < arr.length ; i+=1){ // looping through the elements of the array and assigning them to all even numbers
			arr[i] = count; //setting element to the value of count
			count+=2; //incrementing count by two every time the loop reiterates. Without this, the array will always have 0s.
		}
		System.out.println(Arrays.toString(arr)); //printing out the new array with all even numbers.
	}
}