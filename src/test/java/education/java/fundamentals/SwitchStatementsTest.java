package education.java.fundamentals;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SwitchStatementsTest {

    SwitchStatements switchStatements = new SwitchStatements();

    @Test
    public void manyLanguagesUsingSwitch() {
        String swedenLanguage = switchStatements.getSpokenLanguageUsingSwitch("Sweden");
        String norwayLanguage = switchStatements.getSpokenLanguageUsingSwitch("Norway");
        String denmarkLanguage = switchStatements.getSpokenLanguageUsingSwitch("Danish");
        String finlandLanguage = switchStatements.getSpokenLanguageUsingSwitch("Finland");
        String germanyLanguage = switchStatements.getSpokenLanguageUsingSwitch("Germany");
        String franceLanguage = switchStatements.getSpokenLanguageUsingSwitch("France");
        String spainLanguage = switchStatements.getSpokenLanguageUsingSwitch("Spain");
        String mexicoLanguage = switchStatements.getSpokenLanguageUsingSwitch("Mexico");
        String unknownCountryLanguage = switchStatements.getSpokenLanguageUsingSwitch(randomString());

        assertEquals("Swedish", swedenLanguage);
        assertEquals("Norwegian", norwayLanguage);
        assertEquals("Danish", denmarkLanguage);
        assertEquals("Finnish", finlandLanguage);
        assertEquals("German", germanyLanguage);
        assertEquals("French", franceLanguage);
        assertEquals("Spannish", spainLanguage);
        assertEquals("Spannish", mexicoLanguage);
        assertEquals("Most likely English", unknownCountryLanguage);
    }

    @Test
    public void getWeekdayAsString() {
        assertEquals(switchStatements.getWeekdayAsString(1), "Monday");
        assertEquals(switchStatements.getWeekdayAsString(2), "Tuesday");
        assertEquals(switchStatements.getWeekdayAsString(5), "Friday");
        assertEquals(switchStatements.getWeekdayAsString(6), "Saturday");
        assertEquals(switchStatements.getWeekdayAsString(7), "Sunday");
    }

    private String randomString() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}
