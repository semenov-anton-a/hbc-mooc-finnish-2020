
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna tunnus:");
        String userName = lukija.nextLine();
        
        System.out.println("Anna salasana:");
        String password = lukija.nextLine();


        if( userName.equals("aleksi") && password.equals("tappara")){
            System.out.println("Olet kirjautunut järjestelmään");
            return;
        }

        if( userName.equals("elina") && password.equals("kissa")){
            System.out.println("Olet kirjautunut järjestelmään");
            return;
        }

        System.out.println("Virheellinen tunnus tai salasana!");
        
    }
}
