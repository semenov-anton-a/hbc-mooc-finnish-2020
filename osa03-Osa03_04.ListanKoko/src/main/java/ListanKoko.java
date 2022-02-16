
import java.util.ArrayList;
import java.util.Scanner;

public class ListanKoko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                System.out.println( "Yhteensä: "+lista.size() );
                break;
            }

            lista.add(luettu);
        }

    }
}
