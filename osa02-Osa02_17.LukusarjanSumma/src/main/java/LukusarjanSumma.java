
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println( "Mihin asti?" );
        int intStart = Integer.valueOf(lukija.nextLine());
    
        int summa = 0;
        for( int i = 1; i <= intStart; i++ ) {
            summa = summa + i;
        }

        System.out.println( "Summa on "+summa );
    
    }
}
