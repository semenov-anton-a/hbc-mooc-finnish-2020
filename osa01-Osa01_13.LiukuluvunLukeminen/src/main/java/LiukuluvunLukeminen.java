
import java.util.Scanner;

public class LiukuluvunLukeminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä luku!");

        double doubleInterger = Double.valueOf( lukija.nextLine() );

        System.out.println("Syötit luvun "+doubleInterger);

    }
}
