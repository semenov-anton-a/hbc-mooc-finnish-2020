
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }

    public String toString() {
        int boxSize = this.getAlkiot().size();
        String str = "";
        if( boxSize == 0 ){ 
            return "Joukko "+this.nimi+" on tyhjä.";
        }
        str = ( boxSize == 1 )? "alkio:": "alkiota:";
        String strListOut = String.join( "\n", this.alkiot ).trim(); 
        return "Joukossa "+this.nimi+" on "+boxSize+" "+str +"\n"+strListOut;
    }
}
