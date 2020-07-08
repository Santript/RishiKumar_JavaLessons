public class Class2{
	public static void main(String[]args){
		//camel casing
		// int myAge = 16;
		// String myName = "Santript Sharma";

		// double num  = 5.2;
		// System.out.println(num); //5
		// num = 7.5;
		// System.out.println(num); //7

		// //Incrementing and decrementing  +=   -=   *=   /=

		// int number = 8;
		// int second = 2;
		// // number = number + 4
		// number /= 5; // 4
		// System.out.println(number);

		//mod --> "%"

		// int num = 25;
		// int num1 = 3;

		// int mod = num % num1; // 1

		// System.out.println(mod);

		// //boolean and char
		// boolean val = true;
		// boolean otherVal = false;

		// //  !

		// boolean newVal = !otherVal;
		// System.out.println(newVal); //true


		char character = 'X';
		System.out.println("This is character: "+character);

		// .substring()  .indexOf()  .length()
		// S  a  n  t  r  i  p  t    S  h  a  r  m  a
		// 0  1  2  3  4  5  6  7  8 9 10  11 12 13 14
		String str = "Santript Sharma";
		int lengthOfName = str.length(); // 8
		int index = str.indexOf("ma");
		String partial = str.substring(6,7); // "pt"
		System.out.println("The length is: " + lengthOfName);
		System.out.println("The index of the string is: " + index); // 13
		System.out.println("This is the partial string: "+partial);


	}
}