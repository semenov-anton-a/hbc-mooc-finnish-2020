
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();

        int arrI = 0;
        while (true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            


            if (nimi.isEmpty()) {
                break;
            }

            System.out.println("Syötä kirjan julkaisuvuosi.");
            int julkaisuvuosi = Integer.valueOf(lukija.nextLine());
            
            Kirja kirja = new Kirja(nimi, julkaisuvuosi);
            
            if ( ! kirjat.contains( kirja ) )
            {
                System.out.println(" add ");
                kirjat.add( kirja );
                
            }else{
                System.out.println("no ADD");
            }
        }

        // Huom! Älä muuta tätä tulostusta!
        System.out.println("Kiitos! Kirjoja lisätty: " + kirjat.size());
    }   
}


