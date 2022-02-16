
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {

        // TEST 1, 2
        // Arvosanarekisteri rekisteri = new Arvosanarekisteri();
        // rekisteri.lisaaArvosanaPisteidenPerusteella(93);
        // rekisteri.lisaaArvosanaPisteidenPerusteella(91);
        // rekisteri.lisaaArvosanaPisteidenPerusteella(92);
        // rekisteri.lisaaArvosanaPisteidenPerusteella(88);

        // System.out.println( rekisteri.arvosanojenKeskiarvo() );
        // System.out.println( rekisteri.koepisteidenKeskiarvo() );


        // TEST 3
        // 82 83 96 51 48 56 61
        Scanner lukija = new Scanner(System.in);

        Arvosanarekisteri rekisteri = new Arvosanarekisteri();

        Kayttoliittyma kali = new Kayttoliittyma(rekisteri, lukija);
        kali.kaynnista();

        // System.out.println( rekisteri.arvosanojenKeskiarvo() );
        // System.out.println( rekisteri.koepisteidenKeskiarvo() );

        // System.out.println( "Koepisteiden keskiarvo: " + rekisteri.koepisteidenKeskiarvo() );
        // System.out.println( "Arvosanojen keskiarvo: " + rekisteri.arvosanojenKeskiarvo() );

    }
}
