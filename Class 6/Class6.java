import java.util.ArrayList;
public class Class6{
	public static void main(String[]args){
		// int[] arr = {12,34,89,10};
		// for(int element : arr){
		// 	System.out.println(element);
		// }

		// double[] arr2 = new double[10];

		// arr2[2] = 34;

		// for(double element2 : arr2){
		// 	System.out.println(element2);
		// }

		// ArrayLists --> .add()  .get()  .set()  .remove()  .size()  .clear()

		ArrayList<String> cars = new ArrayList<String>(); //creating arraylist called cars
		cars.add("Honda"); //0
		cars.add("Toyota"); //1
		cars.add("Audi"); //2
		cars.add("Benz"); //3
		cars.add("Kia"); //4

		System.out.println();
		//System.out.println(cars.get(3)); //Benz

		cars.set(4,"BMW");

		cars.remove(0);

		//String --> .length()
		//Arrays --> .length
		//ArrayList --> .size()
		System.out.println();
		System.out.println(cars.size()); //4

		cars.clear();

		for(String element : cars){
			System.out.println(element);
		}

		ArrayList<Integer> integerAL = new ArrayList<Integer>();
		integerAL.add(10);
		integerAL.add(12);
		integerAL.add(20);
		integerAL.add(98);

		for(int element : integerAL){
			System.out.println(element);
		}
	}
}
