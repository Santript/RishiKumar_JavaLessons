public class Student1 implements GPA{ //implements the interface, which is called "GPA"

	//declaring all the instance variables or attributes
	private int grade1;
	private int grade2;
	private int grade3;
	private int grade4;
	private int grade5;

	//Constructor in order to create object in Main.java
	public Student1(int grade1, int grade2, int grade3, int grade4, int grade5){
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
		this.grade5 = grade5;
	}

	//same method which is defined in the GPA.java, which is the interface
	// total score / number of grades = GPA
	//@return the final GPA based on the grades inputted in the object parameter
	public double calculateGPA(){
		double totalScore = this.grade1 + this.grade2 + this.grade3 + this.grade4 + this.grade5;
		double finalGPA = totalScore / 5;

		return finalGPA;
	}
}