
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<String> usersName = new ArrayList<String>();
        ArrayList<Integer> usersAge = new ArrayList<Integer>();
        
        while (true) {
            String strVal = lukija.nextLine();
            String [] lineArr = strVal.split(",");

            if( strVal.equals("") ){
                
                Collections.sort(usersName, 
                    Collections.reverseOrder( Comparator.comparing(String::length) )
                );
                
                double ageSumma = 0;
                for( Integer i : usersAge ){
                    ageSumma += i;
                }

                System.out.println("Pisin nimi: "+ usersName.get(0) );
                System.out.println("Syntymävuosien keskiarvo: "+ (ageSumma / usersAge.size()) );
                
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
