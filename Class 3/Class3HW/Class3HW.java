import java.util.Scanner; //this is used to access the Scanner class from Java
public class Class3HW{
	public static void main(String[]args){
		Scanner scr = new Scanner(System.in); //creating a new Scanner object from the Scanner class
		System.out.println("Enter in a time between 0 (12:00 AM) and 23 (11:00 PM): ");
		int time = scr.nextInt(); //this stores the time that the user inputs into a variable called "time"

		if(time >= 0 && time < 12){
			System.out.println("It is morning!");
		}
		else if(time >= 12 && time < 17){
			System.out.println("It is afternoon!");
		}
		else if(time >= 17 && time < 24){
			System.out.println("It is evening!");
		}
		else{
			System.out.println("Your number isn't between 0 and 23!");
		}

	}
}