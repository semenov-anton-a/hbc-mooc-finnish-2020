
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        

        int intStart = Integer.valueOf(lukija.nextLine());
        // int intEnd = Integer.valueOf(lukija.nextLine());
    
        int summa = 1;
        for( int i = 1; i <= intStart; i++ ) {
            summa = summa * i;

            System.out.println(i);
        }

        System.out.println( "Summa on "+summa );   
    }
}
