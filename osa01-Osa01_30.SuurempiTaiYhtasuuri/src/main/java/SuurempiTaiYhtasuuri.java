
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);


        System.out.println( "Anna ensimmäinen luku:" );
        int intValue = Integer.valueOf( lukija.nextLine() );
        
        System.out.println( "Anna toinen luku:" );
        int intValue2 = Integer.valueOf( lukija.nextLine() );

        if( intValue > intValue2 ){
            System.out.println("Suurempi luku: "+intValue);
        }else if( intValue2 > intValue ){
            System.out.println("Suurempi luku: "+intValue2);          
        }else if( intValue == intValue2 ){
            System.out.println("Luvut ovat yhtä suuret!");
        }
    }
}
