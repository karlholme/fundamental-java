package streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MixedTest {

    Mixed mixed = new Mixed();

    List<String> participantNames = Arrays.asList("karl", "morgan", "sandra", "shakar", "rebecca", "sara", "yngve", "simon", "sofia", "caroline", "karl");

    @Test
    public void getAllPersonsWithFiveLettersSortedTest() {
        assertEquals(mixed.getAllPersonsWithFiveLettersSorted(participantNames), Arrays.asList("simon", "sofia", "yngve"));
    }

    @Test
    public void getAllPersonsThatDontStartWithSInCAPITALSTest() {
        assertEquals(mixed.getAllPersonsThatDontStartWithSInCAPITALS(participantNames),
                Arrays.asList("CAROLINE", "KARL", "KARL", "MORGAN", "REBECCA", "YNGVE"));
    }

}