package collections;

import java.util.*;

/**
 * De vanligaste datasamlingarna som används inom Java-världen går, lite förenklat, att dela upp i tre kategorier.
 * Ordnade listor, dictionaries/maps och set. Ornade listor, såsom till exempel ArrayList, har ni redan fått arbeta
 * med. Dessa sparar värderna i en ordnad lista där elementen ligger kvar på samma plats där de stoppades in.
 * Dictionary/Maps arbetar istället med nycklar som leder till ett visst värde. Set har ett antal olika implementationer
 * men gernerellt går det att säga att de inte kan innehålla några dubletter. Oordnat.
 */
public class SetInterfaceExercises {

    /**
     * Returnera nu listan som metoden tar in fast utan dubletter.
     */
    public Set<String> getParticipantsWithoutDuplicates(List<String> participants) {
        return null;
    }

    /**
     * returnera listan som ett Set och se till att det inte finns några dubletter
     * och att den är sortterad.
     */
    public SortedSet<String> getSortedWithoutDuplicates(List<String> participants) {
        return null;
    }

    /**
     * Set har en del andra egenskaper som kan vara användbara. Ta nu Set:et som metoden tar in och returnera ett Set
     * som bara innehåller de jämna talen. Det kan vara bra att kolla på dokumentationen för Set<>.
     */
    public Set<Integer> getEvenNumbers(Set<Integer> oneToFifteen) {
        return null;
    }

}
