
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        tulostaLukuunAsti( Integer.valueOf(lukija.nextLine()) );
    }


    public static void tulostaLukuunAsti(int luku){

        for(int i = 1; i <= luku; i++){
            System.out.println(i);
        }

    }   
}
