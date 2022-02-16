
import java.util.Scanner;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);


        while(true){
            System.out.println("Syötä luku");
            int intVal = Integer.valueOf(lukija.nextLine());
            
            if( intVal < 0){
                System.out.println("Epäkelpo luku");
            }else if( intVal == 0 ){
                break;
            }else if( intVal >= 1 ){
                System.out.println( intVal * intVal );
            }

        }

    }
}
