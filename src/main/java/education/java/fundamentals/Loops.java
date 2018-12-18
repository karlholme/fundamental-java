package education.java.fundamentals;

import java.util.List;


    /*
     * Nu kommer ni få testa att lösa några uppgifter med hjälp av de olika typerna av loopar som finns i javas collections-bibloteket
     */
public class Loops {
    /*
     * Här skall ni summera alla tal i listan som kommer in.
     */
    public int sumArrayOfIntegers(int[] numbers) {
        return -1;
    }

    /*
     *
     */
    public boolean containsUsingForEach(List<String> collection, String item) {
        return false;
    }

    public boolean containsUsingWhile(List<String> numbers, String item) {
        boolean found = false;
        int index = 0;

        while(!found && index < numbers.size()) {
            if(numbers.get(index).equals(item)) {
                found = true;
            }
            index++;
        }
        return found;
    }

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
