
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while(true){

            String strLine = lukija.nextLine();
            String[] strLineArr = strLine.split(" ");

            if( strLine.equals("") ){
                break;
            }else if( strLineArr.length > 1 ){
                for (int i = 0; i < strLineArr.length; i++) {
                    System.out.println( strLineArr[i] );
                }   
            }else{
                System.out.println(strLine);
            }




        }


    }
}
