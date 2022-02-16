import java.util.Scanner;

public class Tekstikayttoliittyma{

    private Scanner scanner;
    private Sanakirja word;   

    public Tekstikayttoliittyma( Scanner scanner, Sanakirja word ){
        this.scanner = scanner;
        this.word = word;
    }

    public void kaynnista(){
        
        while(true){
            System.out.println("Komento:");
            String str = scanner.nextLine();
            
            switch(str){
                case "lopeta" :
                    System.out.println("Hei hei!");
                    // break loop;
                    return;
                case "lisaa" :
                    System.out.println( "Sana:" );
                    String lineWord = scanner.nextLine();
                    
                    System.out.println( "Käännös:" );
                    String lineTranslite = scanner.nextLine();                
                    this.word.lisaa(lineWord, lineTranslite);
                    
                    break;
                case "hae" :
                    System.out.println( "Haettava:" );
                    String fiedWord = scanner.nextLine();
                    String resultWord = this.word.kaanna(fiedWord);
                    
                    if( resultWord == null ){
                        System.out.println("Sanaa "+fiedWord+" ei löydy");
                        break;
                    }

                    System.out.println( "Käännös: "+resultWord );
                    break;
                    
                default:
                    System.out.println("Tuntematon komento");
            }

            // if( str.equals("lopeta") ){ 
            //     System.out.println("Hei hei!");
            //     break; 
            // }
            
            // if( str.equals("lisaa") ){
            //     System.out.println( "Sana:" );
            //     String lineWord = scanner.nextLine();
                
            //     System.out.println( "Käännös:" );
            //     String lineTranslite = scanner.nextLine();                
            //     this.word.lisaa(lineWord, lineTranslite);
            // }




           
        }
    }
    
}