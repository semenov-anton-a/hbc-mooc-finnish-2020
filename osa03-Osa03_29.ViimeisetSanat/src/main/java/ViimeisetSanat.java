
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String strVal = lukija.nextLine();
            String [] lineArr = strVal.split(" ");

            if( strVal.equals("") ){
                break;
            }else if( lineArr.length > 1 ){
                System.out.println( lineArr[lineArr.length -1 ] );
            }else{
                System.out.println(strVal);
            }
        }


    }
}
