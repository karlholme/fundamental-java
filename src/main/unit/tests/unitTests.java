package unit.tests;


import java.util.List;

/**
 * Skriv enhetstester som säkertställer att logiken i följande metoder är korrekt. Om logiken är fel, se till att ändra
 * den så det blir korrekt. För att skapa en testmetod kan man högerklicka på classens namn nedan och välja Generate
 * och sen 'Tests'. Då skapas en klass där man kan lägga testerna. Sedan kan ni tjuvkika på de andra test-klasserna
 * för att få lite hjälp kring hur man kan skriva.
 *
 */
public class unitTests {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Matchesmetoden kikar på om en sträng matchar med ett Regual expression (regex). Försök att lista ut vad regexet
     * gör. Till er hjälp så kan ni använda regex101.com, en fantastisk hemsida för att lära sig, och testa sina regex.
     */
    public boolean validCustomerID(String customerID) {
        return customerID.matches("[12][90][0-9]{6}-[0-9]{4}");
    }

    public String getWordAsUpperCase(String word) {
        return word.toUpperCase();
    }

    public int sumList(List<Integer> numbers) {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    /**
     * Den här metoden känner ni kanske igen sen tidigare. Och om ni inte tog bort testet för den i mergen från develop,
     * försök att inte tjuvkika på det testet utan lös uppgiften själv, eller med hjälp av en kompis.
     */
    public String getLoopInALoop(List<List<String>> collection, String index) {
        return collection
                .get(Character.getNumericValue(index.charAt(0))-10)
                .get(Integer.valueOf(index.substring(1))-1);
    }

}
