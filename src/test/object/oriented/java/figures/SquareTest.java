package object.oriented.java.figures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    private Square square;

    @Before
    public void before() {
        square = new Square();
    }


    @Test
    public void squareBaseSetterTest() {
        square.setBase(1);
        assertEquals(1, square.getBase());
    }

    @Test
    public void squareBaseSetterDoubleTest() {
        square.setBase(new Double(1.0));
        assertEquals(1, square.getBase());
    }

    @Test
    public void squareBaseSetterDoubleTest() {
        square.setBase("1");
        assertEquals(1, square.getBase());
    }

    @Test
    public void getAreaTest() {
        square.setBase(2);
        assertEquals(4, square.getArea());
    }

}