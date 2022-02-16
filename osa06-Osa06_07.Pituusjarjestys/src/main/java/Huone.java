
import java.util.ArrayList;
import java.util.Comparator;

public class Huone {

    private ArrayList<Henkilo> roomBox = new ArrayList<Henkilo>();

    // Constructor
    public Huone(){}

    // lisää huoneeseen parametrina annetun henkilön.
    public void lisaa(Henkilo henkilo) {
        //
        this.roomBox.add(henkilo);
    }

    // palauttaa boolean-tyyppisen arvon true tai false, joka kertoo onko huone
    // tyhjä.
    public boolean onTyhja() {
        return ( this.roomBox.isEmpty() );
    }

    // palauttaa listan huoneessa olevista henkilöistä.
    public ArrayList<Henkilo> getHenkilot() {
        return this.roomBox;
    }


    public Henkilo ota(){
        if( this.onTyhja() ){ return null; }
        Henkilo shortPerson = this.lyhin();
        int res = this.roomBox.indexOf( shortPerson );
        this.roomBox.remove( res );
        return shortPerson;
    } 

    public Henkilo lyhin() {
        
        if( this.onTyhja() ){ return null; }

        // Helpful msg
        // https://howtodoinjava.com/java/collections/arraylist/arraylist-sort-objects-by-field
        // https://www.baeldung.com/java-comparator-comparable
        
        // this.roomBox.sort( new HumanLenghtSort().reversed() );
        // this.roomBox.sort( new HumanLenghtSort() );
        ArrayList<Henkilo> cloneRoomBox =  (ArrayList<Henkilo>) this.roomBox.clone();
        
        cloneRoomBox.sort( new HumanLenghtSort() );        
        
        return cloneRoomBox.get( 0 );
        
    }

}