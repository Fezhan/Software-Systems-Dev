package lab1;

public class Driver {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5,7);
		Rectangle rect2 = new Rectangle(9,10);
		
		System.out.println("The area of rectangle 1 is " + rect1.getArea());
		rect1.optionSetter(1, 20);
		System.out.println("The area of rectangle 1 is " + rect1.getArea());
		
		System.out.println("The area of rectangle 2 is " + rect2.getArea());
		System.out.println("The value of side1 for rectangle 2 is " + rect2.optionGetter("side1"));
	}
}
