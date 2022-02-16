
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.

        System.out.println("Mikä tulostetaan?");
        String value = lukija.nextLine();

        int i = 0;
        while ( i < 3) {
            System.out.print(value);
            ++i;            
        }



    }
}
