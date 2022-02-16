
import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
import java.util.Comparator;

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

    public String pisin() {
        if( this.alkiot.isEmpty() ){
            return null;
        }
        this.alkiot.sort( Comparator.comparingInt(String::length).reversed() );
        return this.alkiot.get(0);
    }

}
