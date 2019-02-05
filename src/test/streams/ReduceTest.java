package streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReduceTest {

    Reduce reduce = new Reduce();

    List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

    @Test
    public void sumAllValuesTest() {
        assertEquals(reduce.sumAllValues(numbers), 120);
    }

}
