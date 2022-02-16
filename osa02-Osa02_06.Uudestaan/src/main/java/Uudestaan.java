
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while(true){

            System.out.println( "Syötä luku" );
            int intVal = Integer.valueOf(lukija.nextLine());

            if( intVal == 4 ){
                System.out.println(intVal);
                break;
            }

        }


    }
}
