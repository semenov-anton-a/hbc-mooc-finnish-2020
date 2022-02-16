
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int intVal  = Integer.valueOf( lukija.nextLine() );
        int intVal2 = Integer.valueOf( lukija.nextLine() );

        double rootNum = Math.sqrt( intVal + intVal2 );

        System.out.println( rootNum );

    }
}

