
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int intVal = Integer.valueOf( lukija.nextLine() );

        for ( int i = intVal; i <= 100; i++ ) {

            System.out.println( i );

        }

    }
}
