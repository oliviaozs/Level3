import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

	@Test
	public void test() {
		StringManipulator sm = new StringManipulator();
		assertEquals("sdrawkcab", sm.reverseWord("backwards"));
		assertEquals("CAPITAL", sm.capitalizeWord("capital"));
		assertEquals("lowercase", sm.uncapitalizeWord("LOWERCASE"));
	}

	@Test
	public void testShapeCalculator() {
		ShapeCalculator sc = new ShapeCalculator();
		assertEquals(16, sc.calculateSquarePerimeter(4));
		assertEquals(12, sc.calculateRectanglePerimeter(2, 4));
		assertEquals(Math.PI, sc.calculateCircleArea(1), 0.001);
		assertEquals(2 * Math.PI, sc.calculateCirclePerimeter(1), 0.001);
	}

}
