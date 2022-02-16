import java.util.ArrayList;

public class Tehtavalista {

    // private HashMap<String, String> kaannokset;
    private ArrayList<String> taskList = new ArrayList<String>();

    public Tehtavalista(){}

    // lisää tehtävälistalle parametrina annetun tehtävän
    public void lisaa(String string) {
        this.taskList.add( string );    
    }

    // tulostaa tehtävät. Tulostuksessa jokaiselle tehtävällä on myös numero — käytä tässä tehtävän indeksiä (+1).
    public void tulosta() {
        int i = 1;
        for(String task : taskList){
            System.out.println( i++ +": "+task );
        }
    }

    // poistaa annettua numeroa vastaavan tehtävän; numero liittyy tulostuksessa nähtyyn tehtävän numeroon.
    public void poista(int i) {
        try {
            this.taskList.remove( i - 1 );
        } catch ( IndexOutOfBoundsException e ) {
            return ;
        }
    }

}
