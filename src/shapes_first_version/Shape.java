package shapes_first_version;

public abstract class Shape {
	protected int x;
	protected int y;
	
	public Shape() {
		x = 0;
		y = 0;
	}	
	
	// Abstract method!
	public abstract double getArea();
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Some shape: (" + x + ", " + y + "), area = " + getArea();
	}
}
