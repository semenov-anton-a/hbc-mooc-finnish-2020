
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                Collections.sort(lista, Collections.reverseOrder());
                break;
            }

            lista.add(luettu);
        }
        
        System.out.println("");
        System.out.println( lista.get(0) );

        // toteuta listan suurimman luvun selvittäminen tänne
    }
}
