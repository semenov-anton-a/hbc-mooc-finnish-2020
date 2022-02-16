
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        LiquidContainer firstContainer = new LiquidContainer();
        LiquidContainer secondContainer = new LiquidContainer();

        loop : while (true) {
            
            System.out.println("Ensimmäinen: " + firstContainer );
            System.out.println("Toinen: " + secondContainer );
            System.out.print("> ");
            
            String scannerLine = lukija.nextLine();
            String scannerData[] = scannerLine.split(" ");

            switch (scannerData[0]) {
                case "lopeta" : break loop;
                case "lisaa" :
                    // Method is add liquid quantity
                    firstContainer.addLiquidQuantity( Integer.valueOf(scannerData[1]) );
                    break;
                case "siirra" : 
                    // Object firstContainer;
                    // Method is move liquid quantity to new liquidContainer object
                    // or make new liquidContainer object
                    firstContainer.moveLiquidQuantity(
                        secondContainer,
                        Integer.valueOf(scannerData[1]) 
                    );
                    break;
                case "poista" :
                    // Method is remove liquid quantity 
                    secondContainer.removeLiquidQuantity( Integer.valueOf(scannerData[1]) ) ;
                    break;
            }

           

        }
    }

}
