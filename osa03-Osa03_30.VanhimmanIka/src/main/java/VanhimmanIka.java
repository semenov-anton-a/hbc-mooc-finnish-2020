
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<Integer> age = new ArrayList<Integer>();

        while (true) {
            String strVal = lukija.nextLine();
            String [] lineArr = strVal.split(",");

            if( strVal.equals("") ){
                Collections.sort(age, Collections.reverseOrder());
                System.out.println( "Vanhimman ikä: "+age.get(0) );
                break;
            }
            
            // Add Age nummeber
            if( lineArr.length > 1 )    {
                age.add( Integer.valueOf( lineArr[1] ) );
            }
        }


    }
}
