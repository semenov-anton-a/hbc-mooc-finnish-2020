
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Rating rating = new Rating();

        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        
        while(true) {
            int scanerInt = Integer.valueOf(lukija.nextLine());

            if( scanerInt == -1 ){
                System.out.println( "Pisteiden keskiarvo (kaikki): "+rating.getAllRating() );
                System.out.println( "Pisteiden keskiarvo (hyväksytyt): "+rating.getApprovedRating() );
                System.out.println( "Hyväksymisprosentti: "+rating.getApprovedRatingProcent() );
                System.out.println( "Arvosanajakauma: " + rating.printValues() );
                break;
            }   

            if( scanerInt > 0 && scanerInt < 100 ){
                rating.addRating( scanerInt );
            }
            
        }

    }
}