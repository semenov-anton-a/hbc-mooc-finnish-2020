
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int count = 0;
        while(true){

            String lineReq = lukija.nextLine();
            if( lineReq.equals("loppu") ){
                System.out.println(count);
                break;
            }
            count++;
        }

    }
}
