import java.util.ArrayList;
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> numCollection = new ArrayList<Integer>();

        while(true){
            int input = Integer.parseInt( lukija.nextLine() );
            
            if( input > 0 ){
                numCollection.add( input );
            }

            if( input == 0 && numCollection.size() == 0){
                System.out.println("keskiarvon laskeminen ei ole mahdollista");
                break;
            }

            if( input == 0 ){
                double res = (double)numCollection.stream().mapToDouble( d->d ).average().orElse(0.0);
                System.out.println(res);
                break;
            }
        }
    }
}
