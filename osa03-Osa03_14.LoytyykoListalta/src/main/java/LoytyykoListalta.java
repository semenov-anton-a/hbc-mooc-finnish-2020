
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                
                System.out.println("Ketä etsitään?");
                luettu = lukija.nextLine();

                if( lista.contains(luettu) ){
                    System.out.println( luettu + "löytyi!" );
                }else{
                    System.out.println( luettu + "ei löytynyt!" );
                };

                break;
            }

            lista.add(luettu);
        }

    }
}
