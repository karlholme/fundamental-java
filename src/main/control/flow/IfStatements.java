package control.flow;

/*
 * Hej, följande problem skall hjälpas med hjälp av if-satser!
 */
public class IfStatements {

    /*
     * Den här metoden får in ett land. Till exempel "Sweden". Er uppgift är att reutrnera landets talade språk.
     * Om den inte får in 'Swedish' eller 'Norwegian' så skall den returnera "Most likely English".
     */
    public String getSpokenLanguageUsingIf(String country) {
        if(country == "Sweden") {
            return "Swedish";
        } else if(country == "Norway") {
            return "Norwegian";
        } else {
            return "Most likely English";
        }
    }


    /*
     * Den här metoden skall ta emot en veckodag som en sträng, och sedan reurnera veckodagens nummer.
     * Måndag skall alltså returnera 1, och torsdag 4.
     */
    public int getWeekdaysNumber(String weekday) {
        return -1;
    }


    /*
     * Den här metoden skall reurnera det pratade spåket, men bara OM det är en person. För vi vet ju alla att till
     * exempel hundar har lite svårt med språket. Btw, här kan det vara bra att använda den logiska operatorn: &&
     */
    public String getSpokenLanguageIfItIsAPerson(String fromCountry, String typeOfCreature) {
        return null;
    }


    /*
     * Nu skall ni klassificera personer efter deras ålder. Dvs:
     *      - Trainee är de som jobbat under ett år
     *      - Junior är de som jobbat mer än ett, men mindre än 3
     *      - Normal är de som jobbat mer än 3, men mindre än 5
     *      - Senior är de som jobbat minst 5 år.
     */
    public String classifyConsultant(int age){
        return "";
    }
}
