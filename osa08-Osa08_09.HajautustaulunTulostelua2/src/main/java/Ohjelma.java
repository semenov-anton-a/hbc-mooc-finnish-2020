
import java.util.HashMap;
import java.util.Map.Entry;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!

        HashMap<String, Kirja> taulu = new HashMap<>();
        taulu.put("tunteet", new Kirja("Järki ja tunteet", 1811, "..."));
        taulu.put("luulot", new Kirja("Ylpeys ja ennakkoluulo", 1813, "...."));

        tulostaArvot(taulu);
        System.out.println("---");
        tulostaArvoJosNimessa(taulu, "ennakko");
    }

    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        for( Entry<String, Kirja> book : hajautustaulu.entrySet() ) {
            System.out.println( book.getValue() );
        }
    }

    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono) {
        for( Entry<String, Kirja> book : hajautustaulu.entrySet() ) {
            if( book.getValue().getNimi().contains(merkkijono) ){
                System.out.println( book.getValue() );
            }
        }
    }
}
// OUTPUT
// Nimi: Ylpeys ja ennakkoluulo (1813)
// Sisältö: ...
// Nimi: Järki ja tunteet (1811)
// Sisältö: ...
// ---
// Nimi: Ylpeys ja ennakkoluulo (1813)
// Sisältö: ...