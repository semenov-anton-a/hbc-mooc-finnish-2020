
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();


        ArrayList<String> dataArr = new ArrayList<String>();

        try( Scanner file = new Scanner( Paths.get( tiedosto ))  ){

            while( file.hasNextLine() ){
                dataArr.add( file.nextLine() );
            }

            System.out.println("Mitä etsitään?");

            if( dataArr.contains(etsittava) ){
                System.out.println("Löytyi!");
            }else{
                System.out.println("Ei löytynyt.");
            }

        }catch(Exception e){
            System.out.println("Tiedoston "+tiedosto+" lukeminen epäonnistui.");
        }


    }
}
