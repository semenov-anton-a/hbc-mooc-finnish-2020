
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int iterator = 0;
        while(true){
            
            System.out.println("Syötä luku");

            int intVal = Integer.valueOf(lukija.nextLine());
            iterator++;
            
            if( intVal == 0 ){
                iterator--;
                System.out.println( "Lukuja yhteensä "+ iterator );
                break;
            }
        }

    }
}
