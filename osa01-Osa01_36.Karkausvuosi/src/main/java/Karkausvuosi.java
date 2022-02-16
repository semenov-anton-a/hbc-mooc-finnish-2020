
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna vuosi:");
        int intValue = Integer.valueOf( lukija.nextLine() );

//intValue % 100 == 0 || intValue % 400 == 0
        System.out.println( intValue % 4);

        if( intValue % 4 == 0 && (intValue % 100 != 0 || intValue % 400 == 0) ){
            System.out.println("Vuosi on karkausvuosi.");
        }else{
            System.out.println("Vuosi ei ole karkausvuosi.");
        }
    }
}