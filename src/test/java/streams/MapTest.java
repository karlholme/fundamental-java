package streams;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@Ignore
public class MapTest {

    Map map = new Map();
    List<String> participantNames = Arrays.asList("karl", "morgan", "sandra", "shakar", "rebecca", "sara", "yngve", "simon", "sofia", "caroline", "karl");

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    @Test
    public void namesToUpperCaseTest() throws IOException {
        List<String> names = map.namesToUpperCase(participantNames);
        assertEquals(names.stream().filter(x -> x.matches(".*[a-z].*")).collect(Collectors.toList()).size(), 0);
    }

    @Test
    public void addOneToAll() throws IOException {
        List<Integer> names = map.addOneToAll(numbers);
        assertTrue(names.get(0) == 2);
        assertTrue(names.get(1) == 3);
        assertTrue(names.get(2) == 4);
        assertTrue(names.get(3) == 5);
    }

}