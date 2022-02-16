
import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        // String txt = lukija.nextLine();
        String txt = String.valueOf(lukija.nextLine());

        // Integer
        System.out.println("Syötä kokonaisluku!");
        int intVar = Integer.valueOf(lukija.nextLine());

        // Double
        System.out.println("Syötä liukuluku!");
        double doubleVar = Double.valueOf(lukija.nextLine());
        
        //Boolean
        System.out.println("Syötä totuusarvo!");
        boolean boolVar = Boolean.valueOf(lukija.nextLine());

        // OUTPUT
        System.out.println("Syötit merkkijonon " +txt);
        System.out.println("Syötit kokonaisluvun "+intVar);
        System.out.println("Syötit liukuluvun "+doubleVar);
        System.out.println("Syötit totuusarvon "+boolVar);
    }
}
