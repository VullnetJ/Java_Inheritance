package shapes_first_version;

import java.util.ArrayList;
import java.util.List;

public class ShapesProgram {

	public static void main(String[] args) {
		List<Shape> shapeList = new ArrayList<Shape>();

		Circle circle = new Circle(3);
		Rectangle rectangle = new Rectangle(4, 6);
		AcuteTriangle triangle = new AcuteTriangle(2, 4);
		
		circle.move(2,  2);
		rectangle.move(3, 3);
		
		shapeList.add(circle);
		shapeList.add(rectangle);
		shapeList.add(triangle);
				
		for (Shape shape : shapeList) {
			System.out.println(shape);
		}
		
	}

}
