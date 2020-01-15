package control.flow;

/*
 * Lös följande problem med hjälp av Switch-satser.
 */
public class SwitchStatements {

    /*
     * Likt "GetSpokenLanguageUsingIf() så skall denna returnera det talade språket för landet.
     * Nu med hjälp av en switch-sats. De länder som vi vill ha svar på är:
     *  Sweden, Norway, Denmark, Finland, Germany, France, Spain, Mexico
     *  Och såklart resten. ("Most likley English").
     */
    public String getSpokenLanguageUsingSwitch(String country) {

        switch (country) {
            case "Sweden":
                return "Swedish";
            case "Norway":
                return "Norwegian";
            case "Denmark":
                return "Danish";
            case "Finland":
                return "Finish";
            case "Germany":
                return "German";
            case "France":
                return "French";
            case "Spain":
                return "Spanish";
            case "Mexico":
                return "Spanish";
            default:
                return "Most likely English";
        }
    }

    /*
     * Den här metoden är den motsatta mot getWeekdaysNumber(), från den förra delen.
     * Den här kommer ta in ett nummner, och skall returnera den korresponderande veckordagens namn. Om fel värde skickas in returnera "Error".
     */
    public String getWeekdayAsString(int weekdayNumber) {

        switch (weekdayNumber) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Tuesday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                return "Error";
        }
    }
}
