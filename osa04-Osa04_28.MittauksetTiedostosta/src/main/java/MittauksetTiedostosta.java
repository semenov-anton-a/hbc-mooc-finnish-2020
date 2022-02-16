
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());

        ArrayList<Integer> intLineFiles = new ArrayList<Integer>();

        try( Scanner file = new Scanner( Paths.get(tiedosto)) ){
            // Read File 
            while( file.hasNextLine() ){
                intLineFiles.add( Integer.valueOf(file.nextLine()) );
            }

            Collections.sort( intLineFiles );
            
            int count =  0;
            for( Integer line : intLineFiles ){
                if( alaraja <= line && ylaraja >= line ){
                    // System.out.println( line );
                    count++;
                }
            }

            System.out.println("Lukuja: "+count );

            // System.out.println(intLineFiles);


        }catch( Exception e ){
            System.out.println("Error");
        }


    }

}
