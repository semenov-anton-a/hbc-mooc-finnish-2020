
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Lahjan suuruus?");

        Double lahjaSumma = Double.valueOf( lukija.nextLine() );
        Double result = 0.0;

        if( lahjaSumma >= 5000 && lahjaSumma <= 25000 ){
            result = Double.valueOf( 100 + ( lahjaSumma - 5000 ) * 0.08 );

        }else if( lahjaSumma >= 25000 && lahjaSumma <= 55000 ){
            result = Double.valueOf( 1700 + ( lahjaSumma - 25000 ) * 0.10 );

        }else if( lahjaSumma >= 55000 && lahjaSumma <= 200000 ){
            result = Double.valueOf( 4700 + ( lahjaSumma - 55000 ) * 0.12 );

        }else if( lahjaSumma >= 200000 && lahjaSumma <= 1000000 ){
            result = Double.valueOf( 22100 + ( lahjaSumma - 200000 ) * 0.15 );

        }else if( lahjaSumma >= 1000000 ){
            result = Double.valueOf( 142100 + ( lahjaSumma - 1000000 ) * 0.17 );
        }

        if( lahjaSumma < 5000 ){
            System.out.println("Ei veroa!");    
        }else{
            System.out.println("Vero: " + result);
        }

    }
}
