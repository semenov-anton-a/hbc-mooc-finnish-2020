import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Matkalaukku{

    private int maxWeight;
    private int allWeight;

    private ArrayList<Tavara> productBox = new ArrayList<>();

    public Matkalaukku( int maxWeight ){
        this.maxWeight = maxWeight;
    }

    // joka lisää parametrina annettavan tavaran matkalaukkuun. Metodi ei palauta mitään arvoa.
    public void lisaaTavara(Tavara tavara){
        int w = this.allWeight + tavara.getPaino(); 

        if( w > this.maxWeight ){  return ; }

        this.allWeight = w;
        this.productBox.add( tavara );
    }

    
    public Tavara raskainTavara(){

        if( this.productBox.isEmpty() ){ return null;  }

        // COMPARATOR method for sort a ArraList obj
        // if use this method  obj Tavara need was a empty Constructor
        // and  implemet Comarator
        this.productBox.sort( new Tavara().reversed() );
        
        // this.productBox.sort( Tavara.sortByWeight.reversed() );
        // OR this method
        // Collections.sort( this.productBox, Tavara.sortByWeight.reversed() );
        System.out.println(this.productBox);
        
        return this.productBox.get(0);
    }

    //  joka palauttaa merkkijonon muotoa "x tavaraa (y kg)"
    public String toString(){
        int s = this.productBox.size();        
        String str = ( s == 0 ) ? "ei tavaroita" : (s == 1) ? s + " tavara" : s + " tavaraa";
        return  str + " ("+this.allWeight+" kg)";    
    }

    //metodi tulostaTavarat, joka tulostaa kaikki matkalaukussa olevat tavarat
    public void tulostaTavarat() {
        for( Tavara item : this.productBox ){
            System.out.println( item.getNimi() + " (" +item.getPaino()+" kg)" );
        }
    }

    //metodi yhteispaino, joka palauttaa tavaroiden yhteispainon
    public int yhteispaino() {
        return this.allWeight; 
    }

}