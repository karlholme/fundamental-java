package streams;


import java.util.List;
import java.util.stream.Collectors;

/**
 * Eftersom alla dessa metoder returnerar ett stream-objekt går dessa att kedja och man kan då
 * uppnå väldigt trevliga effekter.
 */
public class Mixed {

    /**
     * Skriv en metod som reutrnerar de personer som har 5 bokstäver i namnet, sorterat
     * i bokstavsordning. (tips: använd sorted()-funktionen).
     */
    public List<String> getAllPersonsWithFiveLettersSorted(List<String> names) {
        return null;
    }

    /**
     * Den här metoden skall returnera en lista med de personerna som inte börjar på s,
     * i bokstavordning och emd stora bokstäver.
     */
    public List<String> getAllPersonsThatDontStartWithSInCAPITALS(List<String> names) {
        return null;
    }
}
