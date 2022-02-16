
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        // Voit kokeilla ohjelmasi toimintaa täällä

        // Viisari viisari = new Viisari( 60 );
        // int i = 0;
        // while ( i < 101) {
        //     viisari.etene();
        //     System.out.println(viisari + " arvo: "+ viisari.arvo() );
        //     i++;
        // }

        

        // int ii = 0;
        // while(ii < 101){
        //     sekuntikello.etene();
        //     System.out.println(sekuntikello);
        //     ii++;
        // }

        Sekuntikello sekuntikello = new Sekuntikello();
        int laskuri  = 0;
        while (true) {

            // System.out.println(sekuntikello + " > "+ laskuri++);
            System.out.println(sekuntikello);
            sekuntikello.etene();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
