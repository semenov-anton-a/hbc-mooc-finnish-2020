
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);


        /**
         * PART 1
         */
        int summa = 0;
        int iterator = 0;
        int intEven = 0;
        int intOdd = 0;
        while ( true ) {
            System.out.println( "Syötä luvut:" );
            int intVal = Integer.valueOf( lukija.nextLine() );

            if( intVal == -1 ){
                System.out.println( "Kiitos ja näkemiin!" );
                System.out.println("Summa: "+summa);
                System.out.println("Lukuja: "+iterator);
                System.out.println("Keskiarvo: "+ ( (double)summa / (double)iterator ));
                
                System.out.println("Parillisia  : "+intEven );
                System.out.println("Parittomia  : "+intOdd );
                
                break;

            }else if( intVal != -1 ){
                
                if( intVal % 2 == 0 ){
                    intEven++;
                }else{
                    intOdd++;
                }

                iterator++;
                summa = intVal + summa;
            }
        }
        


        
        /** PART 2 */




    }
}
