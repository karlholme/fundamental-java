package control.flow;

import org.junit.Ignore;
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
    public void getSpokenLanguageUsingIfTest() {
        String swedenLanguage = ifStatements.getSpokenLanguageUsingIf("Sweden");
        String norwayLanguage = ifStatements.getSpokenLanguageUsingIf("Norway");
        String unknownCountryLanguage = ifStatements.getSpokenLanguageUsingIf(randomString());

        assertEquals("Swedish", swedenLanguage);
        assertEquals("Norwegian", norwayLanguage);
        assertEquals("Most likely English", unknownCountryLanguage);
    }

    @Test
    public void getWeekdaysNumberTest() {
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
    public void getSpokenLanguageIfItIsAPersonTest() {
        String personSpeakingSwedish = ifStatements.getSpokenLanguageIfItIsAPerson("Sweden", "Person");
        String pigNotSpeakingSwedish = ifStatements.getSpokenLanguageIfItIsAPerson("Sweden", "Pig");
        String personSpeakingNorwegian = ifStatements.getSpokenLanguageIfItIsAPerson("Norway", "Person");
        String cowThatDoesntSpeakNorwegian = ifStatements.getSpokenLanguageIfItIsAPerson("Norway", "Cow");
        String catThatDoesntSpeakDanish = ifStatements.getSpokenLanguageIfItIsAPerson("Denmark", "Cat");

        assertEquals("Swedish", personSpeakingSwedish);
        assertEquals("Norwegian", personSpeakingNorwegian);
        assertNotEquals("Swedish", pigNotSpeakingSwedish);
        assertNotEquals("Norwegian", cowThatDoesntSpeakNorwegian);
        assertNotEquals("Danish", catThatDoesntSpeakDanish);
    }

    @Test
    public void classifyConsultantTest() {
        assertEquals("Trainee", ifStatements.classifyConsultant(0));
        assertEquals("Trainee", ifStatements.classifyConsultant(1));
        assertEquals("Junior", ifStatements.classifyConsultant(2));
        assertEquals("Junior", ifStatements.classifyConsultant(3));
        assertEquals("Standard", ifStatements.classifyConsultant(4));
        assertEquals("Standard", ifStatements.classifyConsultant(5));
        assertEquals("Senior", ifStatements.classifyConsultant(6));
        assertEquals("Senior", ifStatements.classifyConsultant(25));
    }

    private String randomString() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}
