public class Circle implements Shape{
	private double radius;
	private final double pi = 3.14;

	public Circle(){
		this.radius = 5.0;
	}

	public Circle(double radius){
		this.radius = radius;
	}

	//Area = pi * radius ^2
	public double area(){
		return this.pi * Math.pow(this.radius,2);
	}

	// P = 2 * pi * radius
	public double perimeter(){
		return 2 * this.pi * this.radius;
	}
}