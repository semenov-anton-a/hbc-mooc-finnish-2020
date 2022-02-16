
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);


        System.out.println( "Anna ensimmäinen luku:" );
        int intValue = Integer.valueOf( lukija.nextLine() );

        if( intValue < 0 ){
            System.out.println("Arvosana: mahdotonta!");
        }else if( intValue <= 49){
            System.out.println("Arvosana: hylätty");
        }else if( intValue >= 50 && intValue <= 59){
            System.out.println("Arvosana: 1");            
        }else if( intValue >= 60 && intValue <= 69){
            System.out.println("Arvosana: 2");
        }else if( intValue >= 70 && intValue <= 79){
            System.out.println("Arvosana: 3");
        }else if( intValue >= 80 && intValue <= 89){
            System.out.println("Arvosana: 4");
        }else if( intValue >= 90 && intValue <= 100){
            System.out.println("Arvosana: 5");
        }else if( intValue > 100){
            System.out.println("Arvosana: uskomatonta!");
        }
    }
}
