
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // Alla on ohjelma tehtävässä toteuttamiesi hakualgoritmien testaamiseen.

        // Scanner lukija = new Scanner(System.in);
        // ArrayList<Kirja> kirjat = new ArrayList<>();
        // System.out.println("Kuinka monta kirjaa luodaan?");
        // int kirjoja = Integer.valueOf(lukija.nextLine());
        // for (int i = 0; i < kirjoja; i++) {
        //     kirjat.add(new Kirja(i, "nimi kirjalle " + i));
        // }

        // System.out.println("Millä tunnuksella haetaan kirjaa?");
        // int haettava = Integer.valueOf(lukija.nextLine());

        // System.out.println("");
        // System.out.println("Haetaan peräkkäishaulla:");
        // long alku = System.currentTimeMillis();

        // int perakkaishakuId = perakkaishaku(kirjat, haettava);
        // System.out.println("Haku kesti " + (System.currentTimeMillis() - alku) + " millisekuntia.");

        // if (perakkaishakuId < 0) {
        //     System.out.println("Ei löytynyt.");
        // } else {
        //     System.out.println("Löytyi! " + kirjat.get(perakkaishakuId));
        // }

        // System.out.println("");

        // System.out.println("");
        // System.out.println("Haetaan binäärihaulla:");

        // alku = System.currentTimeMillis();

        // int binaarihakuId = perakkaishaku(kirjat, haettava);
        // System.out.println("Haku kesti " + (System.currentTimeMillis() - alku) + " millisekuntia.");

        // if (binaarihakuId < 0) {
        //     System.out.println("Ei löytynyt.");
        // } else {
        //     System.out.println("Löytyi! " + kirjat.get(binaarihakuId));
        // }


        binarySearch();

    }

    public static int perakkaishaku(ArrayList<Kirja> kirjat, int haettavaId) {
        int i = 0;
        for (Kirja book : kirjat) {
            if (book.getId() == haettavaId) {
                return i;
            }
            i++;
        }
        return -1;
    }
    
    //https://www.youtube.com/watch?v=074rf3JuLiE
    public static int binaarihaku(ArrayList<Kirja> kirjat, long haettavaId) {
        
        int target = (int) haettavaId;
        int low = 0;
        int high = kirjat.size()-1;
        while( low <= high ){
            int mid = low + (high - low) / 2; 
            
            if( target == kirjat.get(mid).getId() ){
                return mid;
            }else{
                if( target < kirjat.get(mid).getId() ){
                    high = mid - 1;
                }else if( target > kirjat.get(mid).getId() ){
                    low = mid + 1;
                }else{
                    return mid;
                }
            }

        }
        return -1;
    }
    
    public static void binarySearch(){
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        int elemCount = 814205;
        // int elemCount = 100;
        for (int i = 0; i < elemCount; i++) {
            kirjat.add(new Kirja(i, "nimi kirjalle " + i));
        }

        int needle = 100500;
        int low = 0;
        int high = kirjat.size() - 1;
        int i = 0;

        while( low <= high ){
        
            System.out.println("\n");
            System.out.println("====== ITERAROR =======");
            System.out.println("Iterator : " + i++);
            System.out.println("Low : " + low);
            System.out.println("ArraySize = " + high);
            
            int mid = low + (high - low) / 2; 
            
            System.out.println("Math Midlle Index as : "+low+" + ("+high+" - "+low+") / 2");
            System.out.println( "Midlle Inx = "+mid);
            System.out.println("========================\n");
            
            if (needle == kirjat.get(mid).getId() ) {
                System.out.println("INDEX IS FOUND ! ");
                System.out.println( kirjat.get(mid) );
                break;

            } else {

                System.out.println("Check : " + kirjat.get(mid).getId() + " > " + needle+"\n");

                if ( needle < kirjat.get(mid).getId() ) {
                    System.out.println("TRUE : LEFT SIDE");
                    high = mid - 1;
                    System.out.println("Search size (" + (mid-low) + ") between " + low + "/" + mid);

                } else if( needle > kirjat.get(mid).getId() ){
                    System.out.println("FALSE : RIGHT SIDE");
                    low = mid + 1;
                    System.out.println("Search size (" + (high - mid) + ") between " + mid + "/" + high);
                }else{
                    System.out.println( kirjat.get(mid) );
                    break;
                }
            }
        }
    }
}
