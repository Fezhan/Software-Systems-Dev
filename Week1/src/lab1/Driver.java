package lab1;

public class Driver {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5,7);
		Rectangle rect2 = new Rectangle(9,10);
		
		System.out.println("The area of rectangle 1 is " + rect1.getArea());
		rect1.optionSetter("length", 20);
		System.out.println("length of rectangle 1 is " + rect1.optionGetter("length"));
		System.out.println("The area of rectangle 1 is " + rect1.getArea());
		
		System.out.println("The area of rectangle 2 is " + rect2.getArea());
		System.out.println("The value of side1 for rectangle 2 is " + rect2.optionGetter("side1"));
	
	
	
		Circle circ1 = new Circle(5);
		Circle circ2 = new Circle(7);

		System.out.println("\nThe area of circle 1 is " + circ1.getArea());
		circ1.optionSetter("radius", 3);
		System.out.println("New radius of circle 1 is " + circ1.optionGetter("radius"));
		System.out.println("The area of circle 1 is " + circ1.getArea() + " and it has " + circ1.getSides() + " sides");

		System.out.println("The area of circle 2 is " + circ2.getArea());
		System.out.println("The value of the radius of circle 2 is " + circ2.optionGetter("radius"));



		Ellipse ell1 = new Ellipse(5,6);
		Ellipse ell2 = new Ellipse(7,8);
		
		ell1.optionSetter("length", 3);
		System.out.println("\n" + ell1.getArea());
		System.out.println(ell1.optionGetter("sides"));

		ell2.optionSetter("width", 20);
		System.out.println(ell2.getArea() );

	}
}
