
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println( "Mikä tiedosto luetaan?" );

        ArrayList<String> fileLineArr = new ArrayList<String>();
        try( Scanner file = new Scanner( Paths.get(lukija.nextLine()) ) ){

            while( file.hasNextLine() ){
                // fileLineArr.add( file.nextLine() );
                String[] lineArr = file.nextLine().split(",");
                
                String ageStr = "";
                int ageInt = Integer.valueOf( lineArr[1] );
                
                ageStr = (ageInt == 1)?"vuosi":"vuotta";

                System.out.println( lineArr[0] + ", ikä:"+lineArr[1]+ " "+ageStr  );

            }



        }catch( Exception e ){
            System.out.println("Error "+ e.getMessage());
        }

    }
}
