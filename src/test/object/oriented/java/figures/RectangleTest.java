package object.oriented.java.figures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void before() {
        rectangle = new Rectangle();
    }

    @Test
    public void circleRadiusSetterTest() {
        rectangle.setHeight(1);
        rectangle.setBase(2);
        assertEquals(2, rectangle.getRadius());
    }

    @Test
    public void circleRadiusSetterDoubleTest() {
        rectangle.setHeight(2.0);
        rectangle.setBase(2.0);
        assertEquals(4, rectangle.getRadius());
    }

    @Test
    public void circleRadiusSetterStringTest() {
        rectangle.setHeight("3");
        rectangle.setBase("3");
        assertEquals(9, rectangle.getRadius());
    }

    @Test
    public void getAreaTest() {
        rectangle.setHeight(1);
        rectangle.setBase();
        assertEquals(3.14, rectangle.getArea());
    }

}