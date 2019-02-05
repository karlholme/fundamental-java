package streams;

import java.util.List;

/**
 * MapInterface är en metod som används om man vill operera på varje objekt i in lista. Den tar ett argumnet, som
 * representerar varje objekt i strömmen och som man sedan kan opperera på. MapInterface returnerar en ström vilket
 * gör att man for använda .collect-metoden om man vill returnera en lista.
 */
public class Map {

    /**
     * Använd java MapInterface MapInterface-metod och returnera en lista där alla namn i filen names.txt är
     * med stora bokstäver
     */
    public List<String> namesToUpperCase(List<String> names) {
        return null;
    }


    /**
     * Se nu till att använda streams och addera ett på varje tal i listan med nummer.
     */
    public List<Integer> addOneToAll(List<Integer> numbers) {
        return null;
    }

}
