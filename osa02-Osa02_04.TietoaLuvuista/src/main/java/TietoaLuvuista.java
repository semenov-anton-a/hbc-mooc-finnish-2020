
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int intVal = Integer.valueOf( lukija.nextLine() );
        int intVal2 = Integer.valueOf( lukija.nextLine() );

        
        if( intVal == intVal2 ){
            System.out.println( "Luku "+intVal+" on yhtä suuri kuin luku "+intVal+"." );
            return;
        }

        if( intVal > intVal2 ){
            System.out.println( "Luku "+intVal+" on suurempi kuin luku" + intVal2 );
        }else{
            System.out.println( "Luku "+intVal+" on pienempi kuin luku" + intVal2 );
        }


    }
}
