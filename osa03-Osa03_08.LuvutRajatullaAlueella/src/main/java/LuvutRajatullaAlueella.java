
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
            
                System.out.println("Mistä?");
                int intStart = Integer.valueOf(lukija.nextLine());
                
                System.out.println("Mihin?");
                int intEnd = Integer.valueOf(lukija.nextLine());
                
                try {
                    luvut.get( intStart );
                    luvut.get( intEnd );

                    for (int i = intStart; i <= intEnd; i++){
                        System.out.println( luvut.get( i ) );
                    }

                } catch ( IndexOutOfBoundsException e ) {
                    System.out.println("Error");
                    return;
                }

                break;
            }

            luvut.add(luku);
        }

    }
}
