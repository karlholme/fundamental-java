package object.oriented.java.figures;

import object.oriented.java.SystemException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void before() throws SystemException {
        rectangle = new Rectangle(100, 100);
    }

    @Test
    public void rectangleSetterTest() throws SystemException {
        rectangle.setBase(2);
        assertEquals(2, rectangle.getBase());
    }

    @Test
    public void rectangleSetterHighValueTest() throws SystemException {
        rectangle.setBase(300);
        assertEquals(100, rectangle.getBase());
    }

    @Test
    public void rectangleSetterLowValueTest() throws SystemException {
        rectangle.setBase(0);
        assertEquals(100, rectangle.getBase());
    }

    @Test
    public void rectangleDoubleSetterTest() throws SystemException {
        rectangle.setBase(2.0);
        assertEquals(2, rectangle.getBase());
    }

    @Test
    public void rectangleStringSetterTest() {
        rectangle.setBase("3");
        assertEquals(3, rectangle.getBase());
    }

    @Test
    public void getAreaTest() throws SystemException {
        rectangle.setHeight(4);
        rectangle.setBase(4);
        assertEquals(16, rectangle.getArea(), 0);
    }

}