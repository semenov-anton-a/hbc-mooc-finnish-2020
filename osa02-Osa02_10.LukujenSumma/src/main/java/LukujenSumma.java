
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 0;
        while(true){
            
            System.out.println("Syötä luku");

            int intVal = Integer.valueOf(lukija.nextLine());
            
            summa = intVal + summa;

            if( intVal == 0 ){
                System.out.println( "Lukujen summa "+ summa );
                break;
            }
        }

    }
}
