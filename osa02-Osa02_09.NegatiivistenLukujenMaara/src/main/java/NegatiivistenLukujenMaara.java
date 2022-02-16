
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int iterator = 0;
        while(true){
            
            System.out.println("Syötä luku");

            int intVal = Integer.valueOf(lukija.nextLine());
            
            if( intVal == 0 ){
                System.out.println( "Negatiivisia lukuja yhteensä "+ iterator-- );
                break;
            }

            if( intVal < 0 ){
                iterator++;
            }
        }

    }
}
