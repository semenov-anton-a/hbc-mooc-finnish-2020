
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        String responce = "Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.\nMinkä niminen tarinassa esiintyvä hahmo on?";
        System.out.println( responce );
        String userName = lukija.nextLine();
        
        System.out.println("Mikä hahmon ammatti on?");
        String userProf = lukija.nextLine();
        
        String tarina = "Tässä tarina:\n";
                tarina += "Olipa kerran "+userName+", joka oli ammatiltaan "+userProf+".\n";
                tarina += "Matkatessaan töihin, "+userName+" mietti arkeaan.\n";
                tarina += "Ehkäpä "+userName+" ei olekaan koko elämäänsä "+userProf+".";
        System.out.println(tarina);
    }
}
