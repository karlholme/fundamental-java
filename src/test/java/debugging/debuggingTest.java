package debugging;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

@Ignore
public class debuggingTest {

    Debugging debugging = new Debugging();

    @Test
    public void TringleAreaTest() {
        assertEquals(0.5, debugging.countArea(1, 1, "Trangle"),  0.001);
    }

    @Test
    public void SquareAreaTest() {
    assertEquals(9, debugging.countArea(3, 4, "Square"));
    }

    @Test
    public void CircleAreaTest() {
        assertEquals(3.14, debugging.countArea(1, 1, "Circle"), 0.01);
    }

}
