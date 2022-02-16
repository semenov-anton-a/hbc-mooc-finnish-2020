
import java.util.Scanner;

public class Tunnussana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 

        System.out.println("Tunnussana?");
        String result = lukija.nextLine();

        if( result.equals("Wattlebird") ){
            System.out.println("Hus siitä!");
            return;   
        }

        if( result.equals("Caput Draconis") ){
            System.out.println("Tervetuloa!");
            
        }

    }
}
