
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mistä luetaan?");
        String fileName = lukija.nextLine();
        // String fileName = "reseptit.txt";

        // DEBUG
        ReseptFile reseptCollection = new ReseptFile(fileName);

        // reseptCollection.showReseptListHashMap();
        runWhile( reseptCollection, lukija );

    }

    private static void runWhile( ReseptFile reseptCollection, Scanner lukija ) {
        whileLoop: while (true) {
            System.out.println("Komennot:");
            System.out.println(reseptCollection.printOptions());

            System.out.println("Syötä komento:");
            String reqScaner = lukija.nextLine();

            switch (reqScaner) {
                case "lopeta":
                    break whileLoop;

                case "listaa":
                    System.out.println("\nReseptit:");

                    reseptCollection.reseptList();

                    System.out.println(""); // Empty line
                    break;

                /** HAE NIMI */
                case "hae nimi":
                    System.out.println("Mitä haetaan:");
                    String resept = lukija.nextLine();

                    System.out.println("\nReseptit:");

                    reseptCollection.reseptByName(resept);

                    System.out.println(""); // Empty line
                    break;

                /** HAE KEITOAIKKA */
                case "hae keittoaika":
                    System.out.println("Keittoaika korkeintaan:");
                    int reseptTime = Integer.valueOf(lukija.nextLine());

                    System.out.println("\nReseptit:");

                    reseptCollection.reseptByTime(reseptTime);

                    System.out.println(""); // Empty line
                    break;

                /** HAE AINE */
                case "hae aine":
                    System.out.println("Mitä raaka-ainetta haetaan:");
                    String reseptProduct = lukija.nextLine();

                    System.out.println("\nReseptit:");

                    reseptCollection.reseptByProduct(reseptProduct);

                    System.out.println(""); // Empty line
                    break;
            }
        }

    }

}
