
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        String star = "";
        for(int i=1; i <= maara; i++) {
            star += "*";
        }
        System.out.println(star);
    }

    public static void tulostaNelio(int sivunpituus) {
        // tehtävän toinen osa
        String star = "";

        for(int i=1; i <= sivunpituus; i++) {
            star += "*";
        }

        for(int i=1; i <= sivunpituus; i++) {
            System.out.println(star);
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        String star = "";

        for(int i=1; i <= leveys; i++) {
            star += "*";
        }

        for(int i=1; i <= korkeus; i++) {
            System.out.println(star);
        }

    }

    public static void tulostaKolmio(int koko) {
        // tehtävän neljäs osa
        for(int i=1; i <= koko; i++){
            starPrint( i );
        }
    }

    public static void starPrint( int math ){
        String star = "";
        for(int i=1; i <= math; i++) {
            star += "*";
        }
        System.out.println( star );
    }
}
