
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        Integer intVar = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        Integer intVar2 = Integer.valueOf(lukija.nextLine());

        System.out.println( intVar +" + "+intVar2+" = "+(intVar+intVar2) );
        System.out.println( intVar +" - "+intVar2+" = "+(intVar-intVar2) );
        System.out.println( intVar +" * "+intVar2+" = "+(intVar*intVar2) );

        Double result = Double.valueOf(intVar) / Double.valueOf(intVar2);
        System.out.println( intVar +" / "+intVar2+" = "+ result );

    }
}
