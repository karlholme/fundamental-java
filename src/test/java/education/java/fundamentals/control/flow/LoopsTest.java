package education.java.fundamentals.control.flow;

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
    public void sumArrayOfIntegers() {
        int[] first_test = new int[]{4, 5, 6, 7, 8, 9, 3};
        assertEquals(42, loops.sumArrayOfIntegers(first_test));
        int[] second_test = new int[]{4, 5, 6, 7, 80, 9, -3};
        assertEquals(108, loops.sumArrayOfIntegers(second_test));
    }

    @Test
    public void containsUsingForEach() {
        List<String> toppings = Mockito.spy(new ArrayList<String>());
        fillListWithNiceToppings(toppings);

        assertEquals(true, loops.containsUsingForEach(toppings, "mustard"));
        assertEquals(false, loops.containsUsingForEach(toppings, "gurkmajonäs"));

        verify(toppings, times(0)).contains(any());
        verify(toppings, atLeast(1)).iterator();
    }

    @Test
    public void containsUsingWhile() {
        List<String> toppings = Mockito.spy(new ArrayList<String>());
        fillListWithNiceToppings(toppings);

        assertEquals(true, loops.containsUsingWhile(toppings, "mustard"));
        assertEquals(false, loops.containsUsingWhile(toppings, "gurkmajonäs"));

        verify(toppings, times(0)).contains(any());
        verify(toppings, times(0)).iterator();
    }

    @Test
    public void containsUsingDoWhile() {
        List<String> toppings = Mockito.spy(new ArrayList<String>());
        fillListWithNiceToppings(toppings);

        assertEquals(true, loops.containsUsingWhile(toppings, "mustard"));
        assertEquals(false, loops.containsUsingWhile(toppings, "gurkmajonäs"));

        verify(toppings, times(0)).contains(any());
        verify(toppings, times(0)).iterator();
    }

    @Test
    public void getWithoutUsingGet() {
        List<String> toppings = Mockito.spy(new ArrayList<String>());
        fillListWithNiceToppings(toppings);

        assertEquals("mayonnaise", loops.getWithoutUsingGet(toppings, 2));
        verify(toppings, times(0)).get(anyInt());

    }

    private void fillListWithNiceToppings(List<String> listToFill) {
        listToFill.add("ketchup");
        listToFill.add("mustard");
        listToFill.add("mayonnaise");
        listToFill.add("onion");
        listToFill.add("roasted onions");
        listToFill.add("bostons cucumber");
        listToFill.add("shrimp salad");
    }

}