
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int iterator = 0;
        int summa = 0;
        while(true){
            
            System.out.println("Syötä luku");

            int intVal = Integer.valueOf(lukija.nextLine());
            
            summa = intVal + summa;
            iterator++;
            

            if( intVal == 0 ){
                iterator--;
                System.out.println( "Lukuja yhteensä "+ iterator );
                System.out.println( "Lukujen summa "+ summa );
                break;
            }
        }

        
    }
}
