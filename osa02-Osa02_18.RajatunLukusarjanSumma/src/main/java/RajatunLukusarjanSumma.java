
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int intStart = Integer.valueOf(lukija.nextLine());
        int intEnd = Integer.valueOf(lukija.nextLine());
    
        int summa = 0;
        for( int i = intStart; i <= intEnd; i++ ) {
            summa = summa + i;
        }

        System.out.println( "Summa on "+summa );    
    }
}
