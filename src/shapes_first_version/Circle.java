package shapes_first_version;

public class Circle extends Shape {
	protected int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle: (" + x + ", " + y + "), area = " + getArea();
	}
}
