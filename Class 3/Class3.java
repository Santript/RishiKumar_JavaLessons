import java.util.Random;
public class Class3{
	public static void main(String[]args){
		// int num = 8;
		// // num = 10;
		// // System.out.println(num);

		// //+=  -=  *=  /=  %
		// int newNum = num -= 3; // num = num - 3
		// System.out.println(newNum); //5

		// int num2 = 7;
		// int remainder = num % num2;
		// System.out.println("This is the remainder: "+remainder);

		// boolean val = true;
		// boolean newVal = !val; //false

		// System.out.println(newVal);

		// char ch = 'B';

		// String str = "hello there";
		// int len = str.length(); // 11
		// int index = str.indexOf("o"); //4
		// String partial = str.substring(2,4); //ll

		// System.out.println(len);
		// System.out.println(index);
		// System.out.println(partial);


		//Math : Math.max()  Math.min()  Math.sqrt()  Math.pow()  Math.abs()  Math.random()

		// int max = Math.max(238,10); // 238
		// int min = Math.min(238,10); //10
		// System.out.println("This is the bigger number: "+max);
		// System.out.println("This is the smaller number: "+min);
		// int num = 3;
		// double squareRoot = Math.sqrt(num);
		// System.out.println("This is the square root: "+squareRoot); // 5.0
		// double power = Math.pow(num,2);
		// System.out.println("This is the power: "+power); //900

		// int num2 = 45;
		// int abs = Math.abs(num2);
		// System.out.println("This is the absolute value: "+abs); //45

		// int random = (int)((Math.random()*6)+1);
		// System.out.println("This is a random number: "+random);

		//Random Class --> .nextInt()  .nextDouble()  

		// Random rand = new Random();
		// int randomInt = rand.nextInt(6);
		// double randomDouble = rand.nextDouble();
		// System.out.println("Random integer numbers: "+randomInt);
		// System.out.println("Random decimal numbers: "+randomDouble);


		// true && true = true
		// true && false = false
		// false && true = false
		// false && false = false

		// true || true = true
		// true || false = true
		// false || true = true
		// false || false = false

		// &&  ||

		// boolean val = true;
		// boolean val2 = false;

		// System.out.println(val && val2); // true && false = false
		// System.out.println(val || val2); // true || false = true


		//Relational operators:  >  <  >=  <=  ==  !=

		int num = 300;
		int num2 = 500; 

		//System.out.println(num != num2); // 300 != 300  =  false


		// if(num == num2){
		// 	System.out.print("num and num2 are equal!");
		// }
		// else{
		// 	System.out.println("num and num2 are NOT equal!");
		// }

		// if(num > num2){
		// 	System.out.println("num is greater than num2");
		// }
		// else if(num2 > num){
		// 	System.out.println("num2 is greater than num");
		// }
		// else{
		// 	System.out.println("num and num2 are both EQUAL");
		// }

		int newNum = 36;

		if(newNum % 2 == 0){
			System.out.println("newNum is even");
		}
		else{
			System.out.println("newNum is odd");
		}


	}
}