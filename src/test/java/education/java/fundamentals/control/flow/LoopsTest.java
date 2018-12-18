package education.java.fundamentals.control.flow;

import education.java.fundamentals.control.flow.Loops;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class LoopsTest {
    Loops loops = new Loops();

    @Test
    public void sumOfIntArray() {
        int[] numbers = new int[]{4, 5, 6, 7, 8, 9, 3};

        assertEquals(42, loops.sumArrayOfIntegers(numbers));
    }

    @Test
    public void containsUsingForEach() {
        List<String> toppings = Mockito.spy(new ArrayList<String>());
        toppings.add("ketchup");
        toppings.add("mustard");
        toppings.add("mayonnaise");
        toppings.add("onion");

        assertEquals(true, loops.containsUsingForEach(toppings, "mustard"));
        assertEquals(false, loops.containsUsingForEach(toppings, "gurkmajonäs"));

        verify(toppings, times(0)).contains(any());
        verify(toppings, atLeast(1)).iterator();
    }

    @Test
    public void getWithoutUsingGet() {
        List<String> toppings = Mockito.spy(new ArrayList<String>());
        toppings.add("ketchup");
        toppings.add("mustard");
        toppings.add("mayonnaise");
        toppings.add("onion");

        assertEquals("mayonnaise", loops.getWithoutUsingGet(toppings, 2));

        verify(toppings, times(0)).get(anyInt());

    }

}