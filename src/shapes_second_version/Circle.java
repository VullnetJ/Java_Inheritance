package shapes_second_version;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius; 
	}
		
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius; 
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle: (" + getX() + ", " + getY() + "), area = " + getArea();
	}
}