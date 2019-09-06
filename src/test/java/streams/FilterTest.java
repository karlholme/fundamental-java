package streams;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FilterTest {

    Filter filter = new Filter();

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<String> participantNames = Arrays.asList("karl", "morgan", "sandra", "shakar", "rebecca", "sara", "yngve", "simon", "sofia", "caroline", "karl");

    @Test
    public void noLowerThan5Test() {
        List<Integer> filteredList = filter.noLowerThan5(numbers);
        assertEquals(filteredList.get(0), 6, 0);
    }

    @Test
    public void startsWidthS() {
        List<String> filteredList = filter.startsWidthS(participantNames);
        assertEquals(filteredList.stream().filter(x -> !x.matches("s.*")).count(), 0);
    }

    @Test
    public void howManyStartsWidthSTest() {
        assertEquals(filter.howManyStartsWidthS(participantNames), 5);
    }
}