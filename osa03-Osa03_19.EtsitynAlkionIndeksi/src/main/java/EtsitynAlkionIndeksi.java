
import java.util.Scanner;
import java.util.stream.IntStream;

public class EtsitynAlkionIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[10];
        taulukko[0] = 6;
        taulukko[1] = 2;
        taulukko[2] = 8;
        taulukko[3] = 1;
        taulukko[4] = 3;
        taulukko[5] = 0;
        taulukko[6] = 9;
        taulukko[7] = 7;

        System.out.print("Mitä etsitään? ");
        int etsittava = Integer.valueOf(lukija.nextLine());

        // Toteuta etsimistoiminnallisuus tänne
        int inx = 0;
        while( inx < taulukko.length ){

            if( taulukko[inx] == etsittava ){
                System.out.println("Luku "+etsittava+" löytyy indeksistä "+inx+'.');
            }
            inx++;
        }

        System.out.println("Lukua "+etsittava+" ei löydy.");

    }

}
