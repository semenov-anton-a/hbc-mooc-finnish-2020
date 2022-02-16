
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> usersName = new ArrayList<String>();
        ArrayList<Integer> usersAge = new ArrayList<Integer>();

        while (true) {
            String strVal = lukija.nextLine();
            String [] lineArr = strVal.split(",");

            if( strVal.equals("") ){
                ArrayList<Integer> tempUsersAgeArr = new ArrayList<>( usersAge );
                Collections.sort( tempUsersAgeArr, Collections.reverseOrder());
                int indexOfAgesArr = usersAge.indexOf( tempUsersAgeArr.get(0) );
                System.out.println( "Vanhimman nimi: " +usersName.get( indexOfAgesArr ) );
                break;
            }
            
            // Add Age nummeber
            if( lineArr.length > 1 ) {
                usersName.add( lineArr[0] );
                usersAge.add( Integer.valueOf(lineArr[1]) );
            }
        }
    }

}
