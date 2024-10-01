package lab1;

abstract class Shape {
	
	protected int sides;
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	abstract public int getArea();
	
}

class Rectangle extends Shape {
	
	protected int length;
	protected int width;
	
	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
		this.sides = 4;
	}
	
	public void optionSetter (String option, int value) {
		
		switch (option.toLowerCase()) {
			case "length":
				this.length = value;
				break;
			case "width":
				this.width = value;
				break;
			default:
				System.out.println("Invalid option entered");
				break;
		}
	}
	
	public String optionGetter(String option) {
		switch (option.toLowerCase()) {
			case "length":
				return "length is " + this.length;
			case "width":
				return "width is " + this.width;
			case "sides":
				return "rectangle has " + this.sides + "sides";
			default:
				return "Invalid option";
		}
	}
	
	
	@Override
	public int getArea() {
		int area = this.length * this.width;
		return area;
	}
	
}


class Circle extends Shape {
	private int radius;
	
	public Circle (int radius) {
		this.radius = radius;	
		this.sides = 1;
	}
	
public void optionSetter (String option, int value) {
		
		switch (option.toLowerCase()) {
			case "radius":
				this.radius = value;
				break;
			default:
				System.out.println("Invalid option entered");
				break;
		}
	}
	
	public String optionGetter(String option) {
		switch (option.toLowerCase()) {
			case "radius":
				return "length is " + this.radius;
			case "sides":
				return "width is " + this.sides;
			default:
				return "Invalid option";
		}
	}

	@Override
	public int getArea() {
		int area = this.radius * this.radius * 3;
		return area;
		/** This method returns an integer and not a double, so we cannot use pi as 3.14 or return a decimal.*/
	}
}


class Ellipse extends Rectangle {

	private int length;
	private int width;


	public Ellipse(int length, int width) {

		super(length, width);

		this.length = length;
		this.width = width;
		this.sides = 1;
	}

	@Override
	public String optionGetter(String option) {
		switch (option.toLowerCase()) {
			case "sides":
				return "ellipse has " + this.sides + " sides";
			default:
				super.optionGetter(option);
				return "0";
		}
	}

	public int getArea() {
		int area = this.length * this.width * 3;
		return area;
		/** This method returns an integer and not a double, so we cannot use pi as 3.14 or return a decimal.**/
	}

	}


