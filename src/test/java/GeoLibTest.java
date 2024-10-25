import Planimetry.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class GeoLibTest {
    Random random = new Random();

    @Test
    public void sameRectangles() {
        Rectangle rectangle1 = new Rectangle(3, 6);
        Rectangle rectangle2 = new Rectangle(6, 3);
        assertEquals(rectangle1, rectangle2);
    }

    @Test
    public void similarRectangles() {
        Rectangle rectangle1 = new Rectangle(3.1, 6);
        Rectangle rectangle2 = new Rectangle(6, 3);
        assertNotEquals(rectangle1, rectangle2);
    }

    @Test
    public void similarAreaPerimeterButDifferentType() {
        Rectangle rectangle = new Rectangle(6, 6);
        Square square = new Square(6);
        assertEquals(rectangle, square);
    }

    @Test
    public void similarArea() {
        Square square = new Square(12);
        square.printInfo();
        Triangle triangle = new Triangle(18, 16,24.08);
        triangle.printInfo();
        assertNotEquals(square, triangle);
    }

    @Test
    public void compareSqr() {
        List<Square> squares = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            squares.add(new Square(random.nextDouble()*100));
        }
        squares.forEach(Square::introduce);
        squares.sort(Comparator.comparing(PlanarShape::area));
        System.out.println("=========");
        squares.forEach(Square::introduce);
    }
}
