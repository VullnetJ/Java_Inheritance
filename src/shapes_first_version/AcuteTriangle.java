package shapes_first_version;

public class AcuteTriangle extends Shape {
	protected double base;
	protected double side;
	
	public AcuteTriangle(double base, double side) {
		this.base = base;
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return 0.5 * base * side;
	}

	@Override
	public String toString() {
		return "AcuteTriangle: (" + x + ", " + y + "), area = " + getArea();
	}
}
