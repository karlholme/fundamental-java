package control.flow;

import java.util.List;

/*
 * KAFFEPAUS om ni inte redan tagit kaffe! Och även om ni gjort det, ta en tilL!
 * Nu kommer ni få testa att lösa några uppgifter med hjälp av olika typer av
 * loopar som en vanligtvis använder sig av inom Java.
 */
public class Loops {

    /*
     *  Denna metod skall summera alla tal i en lista som skickas in.
     */
    public int sumArrayOfIntegers(int[] numbers) {
        return 0;
    }

    /*
     *  Nu skall ni skriva era egna contains-metoder, och detta på några olika sätt.
     *  En containsmetod tar in en lista som första argument, och ett objekt som andra.
     *  Sedan vill den returnera True om objektet finns i listan, och annars False.
     *  Såklart så får ni inte använda java.lang.Strings contains-metod.
     */


    /*
     *  Här skall ni använda Javas förkortade for-loop. A.k.a. foreach-loop:
     *    for(itemInList x : list) {}
     */
    public boolean containsUsingForEach(List<String> collection, String item) {
        return true;
    }

    /*
     * Nu skall ni skriva en metod med samma funktionalitet, men genom att använda
     * en while-loop:
     *    while(condition) {}
     */
    public boolean containsUsingWhile(List<String> numbers, String item) {
        return true;
    }

    /*
     *  Nu skall ni göra en tredje metod med samma funktionalitet. Men nu med
     *  do-while-loopen:
     *     do {} while(condition)
     */
    public boolean containsUsingDoWhile(List<String> numbers, String item) {
        return false;
    }

    /*
     * Den här uppgiften är meningen att vara svår, om du tycker den är övermäktig så kan du gå vidare.
     * Nu får ni flera listor i en lista. Dvs en lista i två dimensioner. Er uppgift är att returnera värdet
     * på den positionen som efterfågas. Nu är dock index specificerat med både en bokstav och en
     * siffra. Dvs, D2 skall alltså returnera värdet på fjärde raden (D) andra kolumnen.
     * Ibland kan det vara till hjälp av rita upp listan för hand!
     */
    public String getLoopInALoop(List<List<String>> collection, String position) {
        return null;
    }

}
