
import java.util.Scanner;

public class KertolaskuJaKaava {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int numVar1 = Integer.valueOf( lukija.nextLine() );
        System.out.println("Syötä toinen luku!");
        int numVar2 = Integer.valueOf( lukija.nextLine() );

        System.out.println(numVar1+" * "+numVar2+" = "+(numVar1*numVar2) );
    }
}
