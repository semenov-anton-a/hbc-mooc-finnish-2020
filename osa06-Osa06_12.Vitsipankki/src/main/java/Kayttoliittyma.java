import java.util.Scanner;

public class Kayttoliittyma {

    private Scanner scannerLine;
    private Vitsipankki jokeBoxObj = new Vitsipankki();

    public Kayttoliittyma(Vitsipankki jokeBoxObj, Scanner scannerLine) {
        this.scannerLine = scannerLine;
        this.jokeBoxObj = jokeBoxObj;
    }

    public void kaynnista() {

        // Vitsipankki jokeBoxObj;
        loop : while (true) {
            System.out.println("Komennot:");
            System.out.println(" 1 - lisää vitsi");
            System.out.println(" 2 - arvo vitsi");
            System.out.println(" 3 - listaa vitsit");
            System.out.println(" X - lopeta");

            String scannerLine = this.scannerLine.nextLine();
            
            switch (scannerLine){
                case ""  : break;
                case "X" : break loop;
                case "1" :
                    System.out.println("Kirjoita lisättävä vitsi:");
                    scannerLine = this.scannerLine.nextLine();
                    this.jokeBoxObj.lisaaVitsi(scannerLine);
                    break;
                case "2" :
                    System.out.println("Arvotaan vitsi.");
                    System.out.println( this.jokeBoxObj.arvoVitsi() );
                    break;
                case "3" :
                    this.jokeBoxObj.tulostaVitsit();
                    break;
            }


        }

    }
}