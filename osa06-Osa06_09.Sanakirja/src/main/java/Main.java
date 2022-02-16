
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kokeile sovelluksen osien yhteistoimintaa täällä

        // Default Exemple
        // Sanakirja kirja = new Sanakirja();
        // kirja.lisaa("yksi", "one");
        // kirja.lisaa("kaksi", "two");

        // System.out.println(kirja.kaanna("yksi"));
        // System.out.println(kirja.kaanna("kaksi"));
        // System.out.println(kirja.kaanna("kolme"));

        // TEST 1
        // Scanner lukija = new Scanner(System.in);
        // Sanakirja kirja = new Sanakirja();

        // Tekstikayttoliittyma kayttoliittyma = new Tekstikayttoliittyma(lukija,
        // kirja);
        // kayttoliittyma.kaynnista();

        // TEST 2
        Scanner lukija = new Scanner(System.in);
        Sanakirja kirja = new Sanakirja();

        Tekstikayttoliittyma kayttoliittyma = new Tekstikayttoliittyma(lukija, kirja);
        kayttoliittyma.kaynnista();
        // System.out.println( kirja.kaanna("hauki") ); // tulostaa merkkijonon "pike"
    }

}
