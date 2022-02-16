
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == 9999) {

                // New Array un sort
                ArrayList<Integer> listaSorted = new ArrayList<>(lista);
                
                Collections.sort( listaSorted );
                
                int intNeedle = listaSorted.get(0);
                
                System.out.println( "Pienin luku on "+listaSorted.get(0)  );
                for(int i =0; i < lista.size(); i++){
                    if( lista.get(i) == intNeedle ){
                        System.out.println("Pienin luku löytyy indeksistä "+i);
                    }
                }

                break;
            }

            lista.add(luettu);
        }

    }
}
