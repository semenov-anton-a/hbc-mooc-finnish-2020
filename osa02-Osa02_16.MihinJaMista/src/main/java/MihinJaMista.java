
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.println( "Mihin asti?" );
        int intEnd = Integer.valueOf(lukija.nextLine());
        
        System.out.println( "Mistä lähtien?" );
        int intStart = Integer.valueOf(lukija.nextLine());


        for( int i = intStart; i <= intEnd; i++ ){
            System.out.println( i );
        }   

    }
}
