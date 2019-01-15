package object.oriented.java.figures;

import object.oriented.java.SystemException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    private Square square;

    @Before
    public void before() throws SystemException {
        square = new Square(111);
    }


    @Test
    public void squareBaseSetterTest() throws SystemException {
        square.setBase(1);
        assertEquals(1, square.getBase());
    }

    @Test
    public void squareBaseSetterHighValueTest() throws SystemException {
        square.setBase(300);
        assertEquals(111, square.getBase());
    }

    @Test
    public void squareBaseSetterLowValueTest() throws SystemException {
        square.setBase(0);
        assertEquals(111, square.getBase());
    }

    @Test
    public void squareBaseSetterDoubleTest() throws SystemException {
        square.setBase(new Double(1.0));
        assertEquals(1, square.getBase());
    }

    @Test
    public void squareBaseSetterStringTest() {
        square.setBase("1");
        assertEquals(1, square.getBase());
    }

    @Test
    public void getAreaTest() throws SystemException {
        square.setBase(2);
        assertEquals(4, square.getArea(), 0);
    }

}