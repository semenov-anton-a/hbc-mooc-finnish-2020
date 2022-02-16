import java.util.Scanner;

public class Kayttoliittyma{

    private Scanner scanner;
    private Tehtavalista taskList;

    public Kayttoliittyma( Tehtavalista task,  Scanner scanner ){
        this.scanner = scanner;
        this.taskList = task;
    }

    public void kaynnista(){       

        int scannerIntValue = -1;
        String scannerStrValue = "";
        
        loop : while(true){

            System.out.println( "Komento:" );

            scannerStrValue = scanner.nextLine();

            switch( scannerStrValue ){
                case "lopeta" : 
                    break loop;
                case "listaa" :
                    this.taskList.tulosta();
                    break;                
                case "lisaa" :
                    System.out.println( "Lisättävä:" );
                    scannerStrValue = scanner.nextLine();
                    this.taskList.lisaa( scannerStrValue );
                    break;
                case "poista" :
                    scannerIntValue = Integer.valueOf( scanner.nextLine() );
                    System.out.println("Mikä poistetaan?");
                    this.taskList.poista( scannerIntValue );
                    break;            
            }

        }

    }// method end

}//class end

