import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeTest {
	
	@Test
	void testSmallArea() {
		Shape octagon = new Octagon(10);
		Shape hexagon = new Hexagon(10);
		Shape dodecagon = new Dodecagon(10);
		
		assertEquals(octagon.getArea(), 482.84271247461896);
		assertEquals(hexagon.getArea(), 259.8076211353316);
		assertEquals(dodecagon.getArea(), 1119.6152422706632);
	}
	
	@Test
	void testMediumArea() {
		Shape octagon = new Octagon(50);
		Shape hexagon = new Hexagon(50);
		Shape dodecagon = new Dodecagon(50);
		
		assertEquals(octagon.getArea(), 12071.067811865474);
		assertEquals(hexagon.getArea(), 6495.19052838329);
		assertEquals(dodecagon.getArea(), 27990.38105676658);
	}
	
	@Test
	void testLargeArea() {
		Shape octagon = new Octagon(100);
		Shape hexagon = new Hexagon(100);
		Shape dodecagon = new Dodecagon(100);
		
		assertEquals(octagon.getArea(), 48284.2712474619);
		assertEquals(hexagon.getArea(), 25980.76211353316);
		assertEquals(dodecagon.getArea(), 111961.52422706631);
	}
	
	@Test
	void testSmallPerimeter() {
		Shape octagon = new Octagon(10);
		Shape hexagon = new Hexagon(10);
		Shape dodecagon = new Dodecagon(10);
		
		assertEquals(octagon.getPerimeter(), 80.0);
		assertEquals(hexagon.getPerimeter(), 60.0);
		assertEquals(dodecagon.getPerimeter(), 120.0);
	}
	
	@Test
	void testMediumPerimeter() {
		Shape octagon = new Octagon(50);
		Shape hexagon = new Hexagon(50);
		Shape dodecagon = new Dodecagon(50);
		
		assertEquals(octagon.getPerimeter(), 400.0);
		assertEquals(hexagon.getPerimeter(), 300.0);
		assertEquals(dodecagon.getPerimeter(), 600.0);
	}
	
	@Test
	void testLargePerimeter() {
		Shape octagon = new Octagon(100);
		Shape hexagon = new Hexagon(100);
		Shape dodecagon = new Dodecagon(100);
		
		assertEquals(octagon.getPerimeter(), 800.0);
		assertEquals(hexagon.getPerimeter(), 600.0);
		assertEquals(dodecagon.getPerimeter(), 1200.0);
	}

}
