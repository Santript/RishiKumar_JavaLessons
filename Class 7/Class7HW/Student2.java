public class Student2 implements GPA{ //implements the interface, which is called "GPA"

	//declaring all the instance variables or attributes
	private int grade1;
	private int grade2;
	private int grade3;
	private int grade4;
	private int grade5;
	private int grade6;
	private int grade7;

	//Constructor in order to create object in Main.java
	public Student2(int grade1, int grade2, int grade3, int grade4, int grade5, int grade6, int grade7){
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
		this.grade5 = grade5;
		this.grade6 = grade6;
		this.grade7 = grade7;
	}

	//same method which is defined in the GPA.java, which is the interface
	// total score / number of grades = GPA
	//@return the final GPA based on the grades inputted in the object parameter
	public double calculateGPA(){
		double totalScore = this.grade1 + this.grade2 + this.grade3 + this.grade4 + this.grade5 + this.grade6 + this.grade7;
		double finalGPA = totalScore / 7;

		return finalGPA;
	}
}