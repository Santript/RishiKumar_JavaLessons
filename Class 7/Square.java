public class Square implements Shape{
	private double side;

	public Square(){
		this.side = 5.0;
	}

	public Square(double side){
		this.side = side;
	}

	public double area(){
		return Math.pow(this.side,2);
	}

	public double perimeter(){
		return 4 * this.side;
	}
}