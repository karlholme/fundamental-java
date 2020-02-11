package control.flow;

import org.junit.Ignore;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SwitchStatementsTest {

    SwitchStatements switchStatements = new SwitchStatements();

    @Test
    public void manyLanguagesUsingSwitchTest() {
        String swedenLanguage = switchStatements.getSpokenLanguageUsingSwitch("Sweden");
        String norwayLanguage = switchStatements.getSpokenLanguageUsingSwitch("Norway");
        String denmarkLanguage = switchStatements.getSpokenLanguageUsingSwitch("Denmark");
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
        assertEquals("Spanish", spainLanguage);
        assertEquals("Spanish", mexicoLanguage);
        assertEquals("Most likely English", unknownCountryLanguage);
    }

    @Test
    public void getWeekdayAsStringTest() {
        assertEquals("Monday", switchStatements.getWeekdayAsString(1));
        assertEquals("Tuesday", switchStatements.getWeekdayAsString(2));
        assertEquals("Friday", switchStatements.getWeekdayAsString(5));
        assertEquals("Saturday", switchStatements.getWeekdayAsString(6));
        assertEquals("Sunday", switchStatements.getWeekdayAsString(7));assertEquals("Error", switchStatements.getWeekdayAsString(9));
    }

    private String randomString() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, StandardCharsets.UTF_8);
    }
}
