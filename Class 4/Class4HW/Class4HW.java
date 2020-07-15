import java.util.Scanner;
public class Class4HW{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your first name?");
		String userFirstName = scan.next();
		System.out.println("Nice to meet you "+userFirstName+ "!");

		System.out.println();
		System.out.println();
		Scanner scan2 = new Scanner(System.in);
		System.out.print("What grade are you in?");

		if(scan2.hasNextInt()){
			int grade = scan2.nextInt();
			System.out.println("You are in grade "+grade);
		}
		else{
			System.out.println("Wrong formatting. Please type in your grade.");
		}

		System.out.println();
		System.out.println();

		String str[] = {"hello", "bye", "cookies", "cake", "fruit"};
		int strLen = str.length;

		for(int i = 0 ; i < strLen ; i+=1){
			System.out.print(str[i] + " ");
		}
		System.out.println();
		for(int j = 0 ; j < strLen ; j+=2){
			System.out.print(str[j] + " ");
		}
	}
}