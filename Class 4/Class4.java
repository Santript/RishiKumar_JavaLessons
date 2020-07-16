import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Class4{
	public static void main(String[]args){
		// Random rand = new Random();
		// // .nextInt()  .nextDouble()
		// int randomNum = rand.nextInt(6);
		// double randomNum2 = rand.nextDouble();
		// System.out.println(randomNum2);

		// System.out.println(true || false); //true

		// int num = 100;
		// int num2 = 200;

		// if(num > num2){
		// 	System.out.println("True");
		// }
		// else if(num2 > num){
		// 	System.out.println("False");
		// }
		// else{
		// 	System.out.println("Equal");	
		// }

		//  .nextInt()  .next()  .hasNextInt()  .hasNext()
		// Scanner scan = new Scanner(System.in);

		// System.out.println("How old are you?");
		
		// if(scan.hasNextInt()){
		// 	int age = scan.nextInt();
		// 	System.out.println("You are "+age);
		// }
		// else{
		// 	System.out.println("Please type in a number.");
		// }

		// Scanner scan = new Scanner(System.in);
		// System.out.print("Type in a number: ");
		// int num = scan.nextInt();

		// if(num % 2 == 0){
		// 	System.out.println("Even");
		// }
		// else{
		// 	System.out.println("Odd");
		// }

		//for(Statement1 ; statement 2 ; statement 3){

		//}

		// 0 1 2 3 4 5 6 7 8 9 10
		// for(int i = 0 ; i <= 100 ; i+=1){
		// 	System.out.print(i + " ");
		// }

		// Scanner scan = new Scanner(System.in);
		// System.out.print("Enter in a min value: ");
		// int min = scan.nextInt();
		// System.out.print("Enter in a max value: ");
		// int max = scan.nextInt();

		// for(int j = min ; j <= max ; j+=2){
		// 	System.out.print(j + " ");
		// }

		// int i = 0;
		// while(i <= 10){
		// 	System.out.print(i + " ");
		// 	i+=1;
		// }
		// int val = 10;

		// while(val > 5){
		// 	System.out.println("Food");
		// }

		int arr[] = {5,6,7,12,45};
		//           0 1 2 3  4
		String strArr[] = {"hello","bye","food"};
		int arrayLength = arr.length; //5
		//System.out.println(arr); //12
		// arr[4] = 11;
		// System.out.println(Arrays.toString(arr));
		// // Arrays.toString()
		// System.out.println(Arrays.toString(strArr));
		// System.out.println(arrayLength);
		 for(int i = 0 ; i < arrayLength ; i+=1){
		 	System.out.print(arr[i] + " ");
		 }

		 

	}
}