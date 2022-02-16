
import java.util.ArrayList;
import java.util.Scanner;

public class Esineet {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        
        while(true) {

            String strName = lukija.nextLine();
            if( strName.isEmpty() ){

                for(Esine esine : esineet ){
                    System.out.println(esine);
                }

                break;
            }            
            esineet.add( new Esine( strName ) );
        }


    }   
}
