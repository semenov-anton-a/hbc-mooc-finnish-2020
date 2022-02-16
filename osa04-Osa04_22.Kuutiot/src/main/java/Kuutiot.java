
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while(true){
            String lineReq = lukija.nextLine();
            
            if( lineReq.equals("loppu") ){
                break;
            }

            int intVal = Integer.valueOf( lineReq );
            System.out.println( intVal * intVal * intVal );
        }
    }
}
