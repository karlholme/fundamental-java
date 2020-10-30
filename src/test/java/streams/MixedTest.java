package streams;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Ignore
public class MixedTest {

    Mixed mixed = new Mixed();

    List<String> participantNames = Arrays.asList("karl", "morgan", "sandra", "shakar", "rebecca", "sara", "yngve", "simon", "sofia", "caroline", "karl");
    List<List<String>> LoremIpsum = Arrays.asList(
            Arrays.asList("Lorem", "ipsum", "dolor", "sit", "amet,", "consectetur", "adipisicing", "elit,", "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua."),
            Arrays.asList("Ut", "enim", "ad", "minim", "veniam,", "quis", "nostrud", "exercitation", "ullamco", "laboris", "nisi", "ut", "aliquip", "ex", "ea", "commodo", "consequat."),
            Arrays.asList("Duis", "aute", "irure", "dolor", "in", "reprehenderit", "in", "voluptate", "velit", "esse", "cillum", "dolore", "eu", "fugiat", "nulla", "pariatur."),
            Arrays.asList("Excepteur", "sint", "occaecat", "cupidatat", "non", "proident,", "sunt", "in", "culpa", "qui", "officia", "deserunt", "mollit", "anim", "id", "est", "laborum."));

    @Test
    public void getAllPersonsWithFiveLettersSortedTest() {
        assertEquals(Arrays.asList("simon", "sofia", "yngve"), mixed.getAllPersonsWithFiveLettersSorted(participantNames));
    }

    @Test
    public void getAllPersonsThatDontStartWithSInCAPITALSTest() {
        assertEquals(Arrays.asList("CAROLINE", "KARL", "KARL", "MORGAN", "REBECCA", "YNGVE"), mixed.getAllPersonsThatDontStartWithSInCAPITALS(participantNames));
    }

    @Test
    public void sumAllWordsTest() {
        assertEquals(69, mixed.sumAllWords(LoremIpsum));
    }

}