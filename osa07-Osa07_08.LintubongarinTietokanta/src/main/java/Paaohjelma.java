import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map.Entry;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);

        runApp(lukija);
    }

    private static void runApp( Scanner lukija ){

        Birds birdsDb = new Birds();
        String birdName;
        // WHILE
        loop : while(true)
        {
            System.out.println("?");
            String reqScanner = lukija.nextLine();
            
            switch(reqScanner){
                case "Lisaa" :
                    System.out.println("Nimi:");
                    birdName = lukija.nextLine();
                    
                    System.out.println("Latinankielinen nimi:");
                    String birdNameLatin = lukija.nextLine();
                    
                    birdsDb.add(birdName, birdNameLatin);
                    
                    break;
                case "Havainto" :
                    System.out.println("Mikä havaittu?");
                    
                    birdName = lukija.nextLine();

                    if( ! birdsDb.addFinding(birdName) ){
                        System.out.println("Ei ole lintu!");
                    }

                    break;
                case "Tilasto" :                                            
                    HashMap<String,ArrayList<String>> birds = birdsDb.getAllBirds();
                    for(Entry<String, ArrayList<String>> brd : birds.entrySet() ){
                        printBirdHashMap(brd);
                    }
                    break;

                case "Nayta" :
                    System.out.println("Mikä?");
                
                    birdName = lukija.nextLine();
                    ArrayList<String> bird = birdsDb.getBird( birdName );
                    
                    if( bird != null ){
                        printBird( birdName, bird.get(0), Integer.valueOf(bird.get(1)) );
                    }

                        break;
                
                case "Lopeta" :
                    // birdsDb.printBirds();
                    break loop;
            }
        }

    }// fn end

    
    private static void printBirdHashMap( Entry<String, ArrayList<String>> bird ){
        printBird( 
            bird.getKey(), 
            bird.getValue().get(0), 
            Integer.valueOf( bird.getValue().get(1))
        );
    }


    private static void printBird( String name, String latinName, int finding){
        System.out.println( name + " (" + latinName +"): " + finding + " havaintoa" );
    } 

}// Class END