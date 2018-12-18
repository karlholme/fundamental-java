package education.java.fundamentals.control.flow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import java.nio.charset.Charset;
import java.util.Random;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(MockitoJUnitRunner.class)
public class IfStatementsTest {

    private IfStatements ifStatements = new IfStatements();

    @Test
    public void getSpokenLanguageUsingIf() {
        String swedenLanguage = ifStatements.getSpokenLanguageUsingIf("Sweden");
        String norwayLanguage = ifStatements.getSpokenLanguageUsingIf("Norway");
        String unknownCountryLanguage = ifStatements.getSpokenLanguageUsingIf(randomString());

        assertEquals("Swedish", swedenLanguage);
        assertEquals("Norwegian", norwayLanguage);
        assertEquals("Most likely English", unknownCountryLanguage);
    }

    @Test
    public void returnSpokenLanguageIfPerson() {
        String personSpeakingSwedish = ifStatements.getSpokenLanguageIfItIsAPerson("Sweden", "Person");
        String pigNotSpeakingSwedish = ifStatements.getSpokenLanguageIfItIsAPerson("Sweden", "Pig");
        String personSpeakingNorwegian = ifStatements.getSpokenLanguageIfItIsAPerson("Norway", "Person");
        String dogThatDoesntSpeakNorwegian = ifStatements.getSpokenLanguageIfItIsAPerson("Norway", "Person");
        String catThatDoesntSpeakDanish = ifStatements.getSpokenLanguageIfItIsAPerson("Denmark", "Cat");

        assertEquals("Swedish", personSpeakingSwedish);
        assertEquals("Norwegian", personSpeakingNorwegian);
        assertNotEquals("Swedish", pigNotSpeakingSwedish);
        assertNotEquals("Norwegian", dogThatDoesntSpeakNorwegian);
        assertNotEquals("Danish", catThatDoesntSpeakDanish);
    }


    @Test
    public void getWeekday() {
        int monday = ifStatements.getWeekdaysNumber("Monday");
        int tuesday = ifStatements.getWeekdaysNumber("Tuesday");
        int friday = ifStatements.getWeekdaysNumber("Friday");
        int saturday = ifStatements.getWeekdaysNumber("Saturday");
        int sunday = ifStatements.getWeekdaysNumber("Sunday");

        assertEquals(monday, 1);
        assertEquals(tuesday, 2);
        assertEquals(friday, 5);
        assertEquals(saturday, 6);
        assertEquals(sunday, 7);
    }

    @Test
    public void classifyPersonByAge() {
        assertEquals("Infant", ifStatements.classifyPersonByAge(1));
        assertEquals("Child", ifStatements.classifyPersonByAge(3));
        assertEquals("Child", ifStatements.classifyPersonByAge(4));
        assertEquals("Child", ifStatements.classifyPersonByAge(5));
        assertEquals("Child", ifStatements.classifyPersonByAge(6));
        assertEquals("Adult", ifStatements.classifyPersonByAge(25));
        assertEquals("Adult", ifStatements.classifyPersonByAge(26));
        assertEquals("Adult", ifStatements.classifyPersonByAge(27));
        assertEquals("Adult", ifStatements.classifyPersonByAge(28));
        assertEquals("Adult", ifStatements.classifyPersonByAge(29));
        assertEquals("Adult", ifStatements.classifyPersonByAge(30));
        assertEquals("Adult", ifStatements.classifyPersonByAge(35));
        assertEquals("Middle Aged", ifStatements.classifyPersonByAge(50));
        assertEquals("Senior", ifStatements.classifyPersonByAge(80));
    }

    private String randomString() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}
