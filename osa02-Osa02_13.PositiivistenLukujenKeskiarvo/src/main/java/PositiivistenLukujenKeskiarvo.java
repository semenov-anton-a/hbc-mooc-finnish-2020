
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int iterator = 0;
        int summa = 0;

        
        while(true){

            System.out.println("Syötä luku");
            int intVal = Integer.valueOf( lukija.nextLine() );

            if( intVal == 0 && iterator == 0 ){
                System.out.println("keskiarvon laskeminen ei ole mahdollista");
                break;
            }else if( intVal == 0 && iterator > 0){
                // iterator--;
                Double result = (double) summa / iterator;
                System.out.println( result );
                break;
            }
            
            if( intVal >= 0 ){
                iterator++;
                summa = intVal + summa;                
            }


        }   
    }
}
