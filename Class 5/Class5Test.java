public class Class5Test{
	public static void main(String[]args){
		//public --> access method from any class
		//privaate --> only can access method from the current class
		//static --> don't have to create a new object if method is static
		//void --> no return statements
		for(String element : args){
			System.out.println(element);
		}
	}
}