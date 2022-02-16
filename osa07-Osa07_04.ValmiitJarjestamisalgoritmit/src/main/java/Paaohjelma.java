import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};

        String testiArr[] = {"f", "b", "a", "d", "e", "c"};

        jarjesta(taulukko);
        jarjesta(testiArr);


        ArrayList<String> testikoodiaList = new ArrayList<String>();
        testikoodiaList.add("e");
        testikoodiaList.add("b");
        testikoodiaList.add("c");
        testikoodiaList.add("r");
        testikoodiaList.add("a");
        jarjestaMerkkijonot(testikoodiaList);

        ArrayList<Integer> testikoodiaInt = new ArrayList<Integer>();
        testikoodiaInt.add(2);
        testikoodiaInt.add(6);
        testikoodiaInt.add(4);
        testikoodiaInt.add(7);
        testikoodiaInt.add(9);
        jarjestaLuvut(testikoodiaInt);

    }

    /** ARRAY */
    public static void jarjesta(int[] taulukko){
        Arrays.sort(taulukko);
        System.out.println( Arrays.toString(taulukko) );
    }
    public static void jarjesta(String[] taulukko){
        Arrays.sort(taulukko);
        System.out.println( Arrays.toString(taulukko) );
    }

    /** LIST */
    public static void jarjestaLuvut(ArrayList<Integer> luvut){
        Collections.sort(luvut);
        System.out.println(luvut);
    }

    public static void jarjestaMerkkijonot(ArrayList<String> merkkijonot){
        Collections.sort(merkkijonot);
        System.out.println(merkkijonot);
    }
}
