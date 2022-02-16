
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        int intNeedle = 0;

        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                System.out.println("Mitä etsitään?");
                intNeedle = Integer.valueOf(lukija.nextLine());
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        for(int i =0; i < lista.size(); i++){
            if( lista.get(i) == intNeedle ){
                System.out.println("Luku "+intNeedle+" on indeksissä "+i);
            }
        }

        // toteuta tänne toiminnallisuus luvun etsimiseen
    }
}
