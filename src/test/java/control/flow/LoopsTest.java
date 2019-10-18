package control.flow;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class LoopsTest {
    private Loops loops = new Loops();

    @Test
    public void sumArrayOfIntegersTest() {
        int[] first_test = new int[]{4, 5, 6, 7, 8, 9, 3};
        assertEquals(42, loops.sumArrayOfIntegers(first_test));

        int[] second_test = new int[]{4, 5, 6, 7, 80, 9, -3};
        assertEquals(108, loops.sumArrayOfIntegers(second_test));
    }

    @Test
    public void containsUsingForEachTest() {
        List<String> toppings = Mockito.spy(new ArrayList<>());
        fillListWithNiceToppings(toppings);

        assertTrue(loops.containsUsingForEach(toppings, "mustard"));
        assertFalse(loops.containsUsingForEach(toppings, "gurkmajonäs"));

        verify(toppings, never()).contains(any());
        verify(toppings, atLeast(1)).iterator();
    }

    @Test
    public void containsUsingWhileTest() {
        List<String> toppings = Mockito.spy(new ArrayList<String>());
        fillListWithNiceToppings(toppings);

        assertTrue(loops.containsUsingWhile(toppings, "mustard"));
        assertFalse(loops.containsUsingWhile(toppings, "gurkmajonäs"));

        verify(toppings, never()).contains(any());
        verify(toppings, never()).iterator();
    }

    @Test
    public void containsUsingDoWhileTest() {
        List<String> toppings = Mockito.spy(new ArrayList<String>());
        fillListWithNiceToppings(toppings);

        assertTrue(loops.containsUsingDoWhile(toppings, "mustard"));
        assertFalse(loops.containsUsingDoWhile(toppings, "gurkmajonäs"));

        verify(toppings, never()).contains(any());
        verify(toppings, never()).iterator();
    }

    @Test
    public void getLoopInALoopTest() {
        List<List<String>> secretMessage = new ArrayList<>();

        ArrayList<String> A = new ArrayList<>();
        A.add("H");
        A.add("F");
        A.add("C");
        A.add("L");
        secretMessage.add(A);

        ArrayList<String> B = new ArrayList<>();
        B.add("V");
        B.add("W");
        B.add("X");
        B.add("Y");
        secretMessage.add(B);

        ArrayList<String> C = new ArrayList<>();
        C.add("K");
        C.add("G");
        C.add("S");
        C.add("C");
        secretMessage.add(C);

        ArrayList<String> D = new ArrayList<>();
        D.add("T");
        D.add("Y");
        D.add("X");
        D.add("P");
        secretMessage.add(D);

        assertEquals("P", loops.getLoopInALoop(secretMessage, "D4"));
        assertEquals("G", loops.getLoopInALoop(secretMessage, "C2"));
        assertEquals("X", loops.getLoopInALoop(secretMessage, "B3"));
        assertEquals("F", loops.getLoopInALoop(secretMessage, "A2"));
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
