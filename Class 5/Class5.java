import java.util.Scanner;
import java.util.Arrays;
public class Class5{
	public static void main(String[]args){
		// Scanner scan = new Scanner(System.in);
		// System.out.println("What is your name: ");
		// String name = scan.next();

		// System.out.println(name);

		// for(int i = 0 ; i <= 10 ; i+=1){
		// 	System.out.print(i);
		// }

		// int j = 0;
		// while(j <= 10){
		// 	System.out.print(j);
		// 	j+=1;
		// }

		// int[] arr = {2,6,1};
		// System.out.println(Arrays.toString(arr));
		// System.out.println(arr.length);

		String[] arr = {"hello", "bye", "cake"};
		for(String element : arr){
			System.out.print(element + " ");
		}
		System.out.println();

		int[]array = new int[5]; //create a new array with a specified length
		System.out.println(Arrays.toString(array));

		array[0] = 20; //reassigning the values of a specific element of the array
		array[4] = 12;
		System.out.println(Arrays.toString(array));

		int[]nums = new int[10];
		for(int i = 0 ; i < nums.length ; i+=1){
			nums[i] = i;
		}
		System.out.println(Arrays.toString(nums));

		int[]num = new int[20];
		int count = 10;
		for(int j = 0 ; j < num.length ; j++){
			num[j] = count;
			count+=10;
		}
		System.out.println(Arrays.toString(num));


		double[] dArr = {2.2,4.5,6.9,1.9,13.12};
		int length = dArr.length;
		double max = 0;
		for(int x = 0 ; x < length ; x++){
			if(dArr[x] > max){
				max = dArr[x];
			}
		}
		System.out.println("This is the maximum value: "+max);


		double[] array2 = {2.2,4.5,6.9,1.9,13.12};
		double newMax = 0.0;
		for(double element2 : array2){
			if(element2 > newMax){
				newMax = element2;
			}
		}
		System.out.println("This is the maximum value: "+newMax);
	}
}