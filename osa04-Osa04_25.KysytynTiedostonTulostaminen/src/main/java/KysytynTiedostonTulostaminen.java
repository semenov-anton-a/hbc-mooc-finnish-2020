
import java.nio.file.Paths;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println( "Minkä tiedoston sisältö tulostetaan?" );

        String fileName = lukija.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileName))) {

            
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }
}
