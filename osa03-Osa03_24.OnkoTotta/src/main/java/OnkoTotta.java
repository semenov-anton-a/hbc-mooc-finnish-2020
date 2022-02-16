
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        
        System.out.println("Kirjoita merkkijono:");
        String strValue = lukija.nextLine();
        
        if( ! strValue.equals("totta") ){
            System.out.println("Koitappa uudelleen!");
        }else{
            System.out.println("Oikein meni!");
        }



    }
}
