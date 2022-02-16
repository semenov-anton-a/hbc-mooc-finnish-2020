
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while(true)
        {
            String inputStr = lukija.nextLine();
            
            if( inputStr.equals("loppu") ){
                
                
                break;
            }

            int intNum = Integer.parseInt(inputStr);

            System.out.println( intNum * intNum * intNum );

        }


    }
}
