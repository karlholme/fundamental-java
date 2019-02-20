package collections;

import java.util.*;

/**
 * OBS, BRÖJA MED SetInterfaceExercises OM DU INTE REDAN GJORT DET!
 * Map är, som nämnt, ett interface där implementationerna använder sig av en nykel som returnerar ett visst värde. Till
 * exempel skulle en map kunna vara BirthdayByName där ett visst namn (nyckeln) returnerar dennes födelsedag (värdet).
 * Man kan jämföra map med en karta (map på engelska!) där en viss plats på kartan, syftar till exakt en geografisk plats.
 */
public class MapInterfaceExercise {

    /**
     * Ta names och använd som nycklar i en Map, och numbers som dess korresponderade värden och returner Map:en. Du
     * kan anta att listorna är lika långa.
     */
    public java.util.Map<String, Integer> getAsMap(List<String> names, List<Integer> numbers) {
        return null;
    }

    /**
     * Använd den metoden du just skrivit ovan och skapa en Map med namn och nummer. returnera sedan värdet som nykeln
     * "participant" ger. "Sandra" skall till exempel returnera 3.
     */
    public int getParticipantsNumber(List<String> names, List<Integer> numbers, String participant) {
        return 0;
    }

    /**
     * Returnera nu alla nycklar som finns i hasmapen. Enhetstestet kräver att getAsMap() är löst och fungerar som den skall.
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
