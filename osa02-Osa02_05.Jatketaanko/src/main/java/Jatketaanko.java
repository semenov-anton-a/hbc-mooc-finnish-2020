
import java.util.Scanner;

public class Jatketaanko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while(true){
            System.out.println("Jatketaanko?");
            String str = lukija.nextLine();
            if( str.equals("ei") ){
                System.out.println(str);
                break;
            }
        }
    }
}
