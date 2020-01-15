package control.flow;

/*
 * Följande problem skall lösas med hjälp av if-satser!
 */
public class IfStatements {

    /*
     * Den här metoden får in ett land som en sträng, till exempel "Sweden". Er uppgift är att returnera landets talade språk.
     * Om den inte får in 'Sweden' eller 'Norway' så skall den returnera "Most likely English".
     */
    public String getSpokenLanguageUsingIf(String country) {
        if (country == "Sweden") {
            return "Swedish";
        } else if (country == "Norway") {
            return "Norwegian";
        } else {
            return "Most likely English";
        }
    }

    /*
     * Den här metoden skall ta emot en veckodag som en sträng, och sedan returnera veckodagens nummer.
     * Måndag skall alltså returnera 1, och torsdag 4 osv.
     */
    public int getWeekdaysNumber(String weekday) {

        if (weekday.equals("Monday")) {
            return 1;
        } else if (weekday.equals("Tuesday")) {
            return 2;
        } else if (weekday.equals("Friday")) {
            return 5;
        } else if (weekday.equals("Saturday")) {
            return 6;
        } else {
            return 7;
        }
    }

    /*
     * Den här metoden skall returnera det talade spåket, men bara OM det är en person. För vi vet ju alla att till
     * exempel hundar har lite svårt med språket. Btw, här kan det vara bra att använda den logiska operatorn: &&
     */
    public String getSpokenLanguageIfItIsAPerson(String fromCountry, String typeOfCreature) {

        if (typeOfCreature.equals("Person")) {
            return getSpokenLanguageUsingIf(fromCountry);
        }
        return null;
    }

    /*
     * Nu skall ni klassificera personer efter hur många år de arbetat i branchen. Dvs:
     *      - Trainee är de som jobbat ett år eller mindre
     *      - Junior är de som jobbat mer än ett men 3 eller färre år
     *      - Standard är de som jobbat mer än 3, men mindre, eller = med 5
     *      - Senior är de som jobbat minst 5 år.
     */
    public String classifyConsultant(int yearsOfExperience) {
        if (yearsOfExperience <= 1) {
            return "Trainee";
        } else if (yearsOfExperience > 1 && yearsOfExperience <= 3) {
            return "Junior";
        } else if (yearsOfExperience > 3 && yearsOfExperience <= 5) {
            return "Standard";
        } else if (yearsOfExperience > 5) {
            return "Senior";
        }
        return "";
    }
}
