package control.flow;

import java.util.ArrayList;
import java.util.List;

/*
 * Nu kommer ni få testa att lösa några uppgifter med hjälp av olika typer av
 * loopar som en vanligtvis använder sig av inom java.
 */
public class Loops {

    /*
     *  Denna metod skall summera alla tal i den lista som skickas in.
     */
    public int sumArrayOfIntegers(int[] numbers) {
        return -1;
    }


    /*
     *  Nu skall ni skriva era egna contains-metoder. Och det på några olika sätt.
     *  En containsmetod tar in en lista som första argument, och ett objekt som andra.
     *  Sedan vill den returnera true om objektet finns i listan, och annars false.
     *  Såklart så får ni inte använda java.lang.Strings contains-metod.
     */


    /*
     *  Här skall ni använda javas förkortade for-loop. A.k.a. foreach-loop:
     *    for(itemInList x : list) {}
     */
    public boolean containsUsingForEach(List<String> collection, String item) {
        return false;
    }


    /*
     * Nu skall ni skriva en metod med samma funktionalitet, men genom att använda
     * en while-loop:
     *    while(condition) {}
     */
    public boolean containsUsingWhile(List<String> numbers, String item) {
        return false;
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
     * Nu får ni flera listor i en lista. Dvs en lista i 2 dimensioner. Er uppgift är att returnera värdet
     * på den positionen som efterfågas (index). Nu är dock index specificerat med både en bokstav och en
     * siffra. Dvs, D2 skall alltså returnera värdet i den 4e columnen (D) på den
     * andra (2) raden.
     */
    public String getLoopInALoop(List<List<String>> collection, String index) {
        return "";
    }

}
