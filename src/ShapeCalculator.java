
public class ShapeCalculator {

	public int calculateSquarePerimeter(int side) {
		return side * 4;
	}

	public int calculateRectanglePerimeter(int length, int width) {
		return (length * 2) + (width * 2);
	}

	public double calculateCircleArea(int radius) {
		return radius * radius * Math.PI;
	}

	public double calculateCirclePerimeter(int radius) {
		return 2 * radius * Math.PI;
	}
}
