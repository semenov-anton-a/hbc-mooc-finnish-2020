
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class VieraslistaTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        
        // ArrayList<String> lista = new ArrayList<>();
        // toteuta tiedoston lukeminen tässä.
        ArrayList<String> dataArr = new ArrayList<>();
        String tiedosto = lukija.nextLine();
        System.out.println("");

        try ( Scanner dataFile = new Scanner( Paths.get( tiedosto )) ) {

            while (dataFile.hasNextLine()) {
                dataArr.add(dataFile.nextLine());
            }

            System.out.println("Syötä nimiä, tyhjä rivi lopettaa.");
            
            while (true) {
                
                String nimi = lukija.nextLine();
                
                if (nimi.isEmpty()) {
                    break;
                }
                
                if ( dataArr.contains(nimi) ){
                    System.out.println("Nimi on listalla.");
                }else{
                    System.out.println("Nimi ei ole listalla.");
                }

            }

            System.out.println("Kiitos!");

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage() );
        }

    }
}
