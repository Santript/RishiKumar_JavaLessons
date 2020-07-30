public class Student{
	private String name; //these are instance variables or attributes
	private int age;
	private int grade;

	//Constructor
	public Student(String name, int age, int grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public int getGrade(){
		return this.grade;
	}

	public String toString(){
		return "I am " + this.name + ". I am " + this.age + " years old and I am in grade " + this.grade + "!";
	}
}