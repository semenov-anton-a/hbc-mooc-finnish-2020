
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int intVal = Integer.valueOf( lukija.nextLine() );

        if( intVal <= 0 ){
            System.out.println( intVal * -1 );
        }else{
            System.out.println( intVal );

        }

    }
}
