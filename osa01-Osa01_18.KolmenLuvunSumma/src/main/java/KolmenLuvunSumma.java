
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int numVar1 = Integer.valueOf( lukija.nextLine() );
        System.out.println("Syötä toinen luku!");
        int numVar2 = Integer.valueOf( lukija.nextLine() );
        System.out.println("Syötä kolmas luku!");
        int numVar3 = Integer.valueOf( lukija.nextLine() );
    
        
        System.out.println("Lukujen summa on "+( numVar1 + numVar2 + numVar3) );
    }
}
