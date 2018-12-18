package education.java.fundamentals.control.flow;

import java.util.List;

    /*
     * Nu kommer ni få testa att lösa några uppgifter med hjälp av de olika typerna av loopar som en vanligtvis använder i java.
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
     *  Containsmetoden tar in en lista som första argument, och ett objekt som andra.
     *  Sedan vill den returnera true om objektet finns i listan, och annars false.
     *  Såklart så får ni använda java.lang.Strings contains-metod.
     *
     *  Här skall ni använda javas förkortade for-loop. Aka foreach-loop:
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
     *  vår favvo, do while-loopen:
     *     do {} while(condition)
     */
    public boolean containsUsingDoWhile(List<String> numbers, String item) {
        return false;
    }

    /*
     * Nu till en lite svårare uppgift. Här får ni inte använda collections.get()-metoden.
     * Nu gäller det att tänkta utanför boxen!
     */
    public String getWithoutUsingGet(List<String> collection, int index) {
        return "fix me without using collection.getWithoutUsingGet(index);";
    }

}
