
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        
        int intVar = Integer.valueOf( lukija.nextLine() );
        
        int secPerDay = 86400;
        
        System.out.println(intVar * secPerDay);
        
        
    }
}
