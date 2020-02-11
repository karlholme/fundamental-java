package collections;

import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

@Ignore
public class SetInterfaceExercisesTest {

    SetInterfaceExercises setInterfaceExercises = new SetInterfaceExercises();
    List<String> participantNames = Arrays.asList("karl", "morgan", "sandra", "shakar", "rebecca", "sara", "yngve", "simon", "sofia", "caroline", "karl");
    Set<String> participantNamesSorted = new TreeSet<>(Arrays.asList("caroline", "karl", "morgan" ,"rebecca", "sandra", "sara", "shakar", "simon", "sofia", "yngve"));

    Set<Integer> oneToFifteen = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
    Set<Integer> oneToFifteenOnlyEven = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14));

    @Test
    public void getParticipantsWithoutDuplicatesTest() {
        assertEquals(1, setInterfaceExercises.getParticipantsWithoutDuplicates(participantNames).stream().filter(x -> x.equals("karl")).count());
    }

    @Test
    public void getSortedWithoutDuplicatesTest() {
        Set<String> sortedSet = setInterfaceExercises.getSortedWithoutDuplicates(participantNames);
        assertEquals(sortedSet, participantNamesSorted);
    }

    @Test
    public void getEvenNumbersTest() {
        assertEquals(oneToFifteenOnlyEven, setInterfaceExercises.getEvenNumbers(oneToFifteen));
    }

}