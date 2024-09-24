package lab1;

abstract class Shape {
	
	private int sides;
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	abstract public int getArea();
	
}

class Rectangle extends Shape {
	
	private int side1;
	private int side2;
	
	public Rectangle (int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public void optionSetter (int option, int value) {
		
		switch (option) {
			case 1:
				this.side1 = value;
				break;
			case 2:
				this.side2 = value;
				break;
			default:
				System.out.println("Invalid option entered");
				break;
		}
	}
	
	public String optionGetter(String option) {
		switch (option.toLowerCase()) {
			case "side1":
				return "Side 1 is " + this.side1;
			case "side2":
				return "Side 2 is " + this.side2;
			default:
				return "Invalid option";
		}
	}
	
	
	@Override
	public int getArea() {
		int area = this.side1 * this.side2;
		return area;
	}
	
}


