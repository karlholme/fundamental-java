package education.java.fundamentals;

import java.util.Iterator;
import java.util.List;

public class IfStatements {
    /*
     * Lös kommande problem med hjälp av if-satser:
     * Kika gärna på enhetstesterna för att få lite ledtrådar.
     */

    public String getSpokenLanguageUsingIf(String country) {
        return "fix me using if statements";
    }

    /*
     * Den här metoden skall ta emot en veckodag som en sträng, och sedan reurnera veckodagens nummer.
     */

    public int getWeekdaysNumber(String weekday) {
        return -1;
    }

    /*
     * Här kan det vara bra att använda den logiska operatorn: &&
     */
    public String getSpokenLanguageIfItIsAPerson(String country, String typeOfCreature) {
        if(country.equals("Sweden") && typeOfCreature.equals("Person")) {
            return "swedish";
        }
        return null;
    }

    /*
     * Den här metoden skall returnera:
     *    Infat om åldern är under 2
     *    Chuld im personen är mellan 2 och 18
     *    Adult om peronen är mellan 19 och 49
     *    Middle Aged om personen är mellan 50 och 64
     *    Senior om personen är över 64.
     */
    public String classifyPersonByAge(int age){
        return "Return persons classification";
    }
}
