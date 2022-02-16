
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while(true){

            String filmName = lukija.nextLine();
            
            if( filmName.isEmpty() ){
                
                System.out.println("Ohjelman maksimipituus?");
                int filmDurationResponse = Integer.valueOf( lukija.nextLine());

                for( TelevisioOhjelma tv : ohjelmat ){
                    if( tv.getPituus() == filmDurationResponse ){
                        System.out.println(tv);
                    }
                }

                break;
            }
            
            int filmDuration = Integer.valueOf( lukija.nextLine());

            ohjelmat.add( new TelevisioOhjelma(filmName, filmDuration) );
        }

    }
}
