public class Three extends Two{
	public int print_three(){
		return 3;
	}

	public void print_hello(){
		super.print_hello();
		System.out.println("Hello from three.java");
	}

	public void print_bye(){
		super.print_bye();
		System.out.println("Good bye from three.java");
	}
}