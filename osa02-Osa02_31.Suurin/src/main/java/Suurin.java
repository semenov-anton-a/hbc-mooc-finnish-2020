import java.util.Arrays;
import java.util.Collections;

public class Suurin {

    public static int suurin(int luku1, int luku2, int luku3) {
        Integer[] intArray = new Integer[] { luku1, luku2, luku3 };
        Arrays.sort(intArray, Collections.reverseOrder());
        return intArray[0];
    }

    public static void main(String[] args) {
        int vastaus = suurin(2, 7, 3);
        System.out.println("Suurin: " + vastaus);
    }
}
