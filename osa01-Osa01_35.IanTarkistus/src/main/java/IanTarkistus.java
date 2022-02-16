
import java.util.Scanner;

public class IanTarkistus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka vanha olet?");
        int intValue = Integer.valueOf( lukija.nextLine() );

        if( intValue >= 0 && intValue <= 120 ){
            System.out.println("OK");
        }else{
            System.out.println("Mahdotonta!");
        }

    }
}
