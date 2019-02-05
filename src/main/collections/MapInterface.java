package collections;

import java.util.*;
import java.util.stream.Stream;

/**
 * Java collections ramverket har ett antal interface som en kan använda. Bland annat List<> som ni
 * säkert känner till väl. Men också MapInterface<> som tillskillnad från list sparar data med en nyckel.
 * Till exempel så kan det se ut såhär: MapInterface<String, Integer>, då har den alltså en nyckel som är
 * en sträng, och ett tillhörande värde som är en Integer.
 */
public class MapInterface {

    /**
     * Ta nu names och lägg som nycklar i en MapInterface, och numbers och lägg som värden och returnera mappen.
     */
    public java.util.Map<String, Integer> getAsHasMap(List<String> names, List<Integer> numbers) {
        return null;
    }

    /**
     * Använd den metoden du just skrivit, och skapa en MapInterface. returnera sedan värdet som nykeln "participant" ger.
     */
    public int getParticipantsNumber(List<String> names, List<Integer> numbers, String participant) {
        return 0;
    }

    /**
     * Returnera nu alla nycklar som finns i hasmapen. Testet kräverr att getAsHasMap() fungerar som den skall.
     */
    public Set<String> getKeys(java.util.Map<String, Integer> valuesPerParticipant) {
        return null;
    }

    /**
     * Returnera nu alla värden som en lista.
     */
    public Collection<Integer> getValues(java.util.Map<String, Integer> valuesPerParticipant) {
        return null;
    }
}
