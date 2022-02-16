
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);


        int intVal = Integer.valueOf( lukija.nextLine() );

        for ( int i = 0; i <= intVal; i++ ) {

            System.out.println( i );

        }

    }
}
