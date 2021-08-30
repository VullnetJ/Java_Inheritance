package shapes_first_version;

public class Rectangle extends Shape {
	protected double height;
	protected double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return height * width;
	}

	@Override
	public String toString() {
		return "Rectangle: (" + x + ", " + y + "), area = " + getArea();
	}
}
