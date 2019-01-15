package object.oriented.java.figures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void before() {
         triangle = new Triangle();
    }

    @Test
    public void TriangleBaseSetterTest() {
        triangle.setBase(1);
        assertEquals(1, triangle.getBase());
    }

    @Test
    public void TriangleBaseDoubleSetterTest() {
        triangle.setBase(new Double(1.0));
        assertEquals(1, triangle.getBase());
    }

    @Test
    public void TriangleBaseStringSetterTest() {
        triangle.setBase("1");
        assertEquals(1, triangle.getBase());
    }

    @Test
    public void getAreaTest() {
        triangle.setBase(1);
        assertEquals(1.5, triangle.getArea());
    }

}