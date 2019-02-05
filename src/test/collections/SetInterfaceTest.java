package collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SetInterfaceTest {

    SetInterface SetInterface = new SetInterface();

    List<String> participantNames = Arrays.asList("karl", "morgan", "sandra", "shakar", "rebecca", "sara", "yngve", "simon", "sofia", "caroline", "karl");


    Set<String> participantNamesSorted = new TreeSet<>(Arrays.asList("caroline", "karl", "morgan" ,"rebecca", "sandra", "sara", "shakar", "simon", "sofia", "yngve"));

    @Test
    public void getSortedWithoutDoublicatesTest() {
        Set<String> sortedSet = SetInterface.getSortedWithoutDoublicates(participantNames);
        assertEquals(sortedSet, participantNamesSorted);
    }

}