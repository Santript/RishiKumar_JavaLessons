public class Pen{
	private double size; //creating instance variables or attributes of a pen
	private String color;
	private String brand;

	public Pen(double size, String color, String brand){ //constructor --> allows you to create new pen objects
		this.size = size; //"this" referrs to the instance variables that you defined above ^
		this.color = color;
		this.brand = brand;
	}

	public double getSize(){ //creating new function called "getSize" and it returns the size of the pen object
		return this.size;
	}

	public String getColor(){ //creating new function called "getColor" and it returns the color of the pen object
		return this.color;
	}

	public String getBrand(){ //creating new function called "getBrand" and it returns the brand of the pen object
		return this.brand;
	}

	@Override //this isn't needed by the way
	public String toString(){ //when you print out a pen object using print statment, then it will print out using this format
		return "This " + this.brand + " pen is " + this.color + " and is " + this.size + " inches long!";
	}
}