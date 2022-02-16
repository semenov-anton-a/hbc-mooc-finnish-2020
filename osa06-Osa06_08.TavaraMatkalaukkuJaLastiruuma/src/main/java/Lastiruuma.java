import java.util.ArrayList;

public class Lastiruuma{
    
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Matkalaukku> productBoxes = new ArrayList<Matkalaukku>();
    
    /**
     * Constructor SET max Weight
     * @param maxWeight
     */
    public Lastiruuma( int maxWeight ){ this.maxWeight = maxWeight; }

    public void lisaaMatkalaukku(Matkalaukku laukku){
        
        System.out.println( laukku.yhteispaino() );

        int w = this.currentWeight + laukku.yhteispaino(); 
        if( w > this.maxWeight ){ return; }

        this.currentWeight = w;
        this.productBoxes.add( laukku );
    }

    public void tulostaTavarat(){
        for( Matkalaukku item : this.productBoxes ){
            // String s = item.tulostaTavarat();
            // System.out.println( s );
            item.tulostaTavarat();
        }
    }
    
    
    public String toString(){
        //Ex :  2 matkalaukkua (7 kg)    
        return productBoxes.size() + " matkalaukkua (" + this.currentWeight + " kg)";
    }

}