public class Main{
	public static void main(String[]args){
		Student1 first = new Student1(1,4,2,4,3);
		Student2 second = new Student2(4,4,1,4,0,4,3);

		System.out.println("This is the GPA for the first student: "+ first.calculateGPA());
		System.out.println("This is the GPA for the second student: "+ second.calculateGPA());
	}
}