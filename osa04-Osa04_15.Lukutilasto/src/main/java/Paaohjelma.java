
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!

        // System.out.println("ok");
        // task1();
        // task2();
        // task3( lukija );
        task4( lukija );

    }


    // TASK 1
    public static void task1(){
        Lukutilasto tilasto = new Lukutilasto();
        tilasto.lisaaLuku(3);
        tilasto.lisaaLuku(5);
        tilasto.lisaaLuku(1);
        tilasto.lisaaLuku(2);
        System.out.println("Määrä: " + tilasto.haeLukujenMaara());
    }

    // TASK 2
    public static void task2(){
        Lukutilasto tilasto = new Lukutilasto();
        
        tilasto.lisaaLuku(3);
        tilasto.lisaaLuku(5);
        tilasto.lisaaLuku(1);
        tilasto.lisaaLuku(2);

        System.out.println("Määrä: " + tilasto.haeLukujenMaara());
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Keskiarvo: " + tilasto.keskiarvo());
    }

    // TASK 3
    public static void task3( Scanner lukija ){
        Lukutilasto tilasto = new Lukutilasto();
        System.out.println("Anna lukuja:");
        

        while (true) {
            
            int intLine = Integer.valueOf( lukija.nextLine() );
            if (intLine == -1) {
                System.out.println( "Summa: " + tilasto.summa() );
                System.out.println( "Summa: " + tilasto.summa() );
                break;
            }
            
            tilasto.lisaaLuku( intLine );
        }
    }

    // TASK 4
    public static void task4( Scanner lukija ){
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto even = new Lukutilasto();
        Lukutilasto odd = new Lukutilasto();
        
        System.out.println("Anna lukuja:");

        
        while (true) {
            
            int intLine = Integer.valueOf( lukija.nextLine() );
            if (intLine == -1) {
                
                System.out.println( "Summa: " + tilasto.summa() );
                System.out.println( "Parillisten summa: " + even.summa() );
                System.out.println( "Parittomien summa: " + odd.summa() );
                
                break;
            }

            tilasto.lisaaLuku(intLine);

            if( intLine%2 == 0 ){
                even.lisaaLuku( intLine );
            }

            if( intLine%2 != 0 ){
                odd.lisaaLuku( intLine );
            }
        }
    }
    

}
