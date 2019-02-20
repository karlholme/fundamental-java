package collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MapInterfaceExerciseTest {

    MapInterfaceExercise mapInterfaceExercise = new MapInterfaceExercise();

    List<String> participantNames = Arrays.asList("karl", "morgan", "sandra", "shakar", "rebecca", "sara", "yngve", "simon", "sofia", "caroline", "karl");
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

    @Test
    public void getAsHashMaoTest() {
        java.util.Map participants = mapInterfaceExercise.getAsMap(participantNames, numbers);
        assertEquals(participants.get("karl"), 11);
        assertEquals(participants.get("sandra"), 3);
        assertEquals(participants.get("sara"), 6);
        assertEquals(participants.get("caroline"), 10);
    }

    @Test
    public void getParticipantsNumberTest() {
        assertEquals(mapInterfaceExercise.getParticipantsNumber(participantNames, numbers, "karl"), 11);
        assertEquals(mapInterfaceExercise.getParticipantsNumber(participantNames, numbers, "sandra"), 3);
        assertEquals(mapInterfaceExercise.getParticipantsNumber(participantNames, numbers, "caroline"), 10);
    }

    @Test
    public void getKeysTest() {
        java.util.Map participants = mapInterfaceExercise.getAsMap(participantNames, numbers);
        assertTrue(mapInterfaceExercise.getKeys(participants).containsAll(participantNames));
    }

    @Test
    public void getValuesTest() {
        java.util.Map participants = mapInterfaceExercise.getAsMap(participantNames, numbers);
        assertEquals(mapInterfaceExercise.getValues(participants).size(), 10);
    }

}