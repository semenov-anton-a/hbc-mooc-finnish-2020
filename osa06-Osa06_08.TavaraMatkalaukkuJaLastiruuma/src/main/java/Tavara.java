import java.util.Comparator;

public class Tavara implements Comparator<Tavara>{
// public class Tavara {

    private String productName;
    private int productWeight;

    public Tavara(){}
    public Tavara(String productName, int productWeight) {
        this.productName = productName;
        this.productWeight = productWeight;
    }

    // , joka palauttaa tavaran nimen
    public String getNimi() {
        return this.productName;
    }

    // joka palauttaa tavaran painon
    public int getPaino() {
        return this.productWeight;
    }

    // joka palauttaa merkkijonon muotoa "nimi (paino kg)"
    public String toString() {
        return this.productName + " (" + this.productWeight + " kg)";
    }

    
    /** ---------------COMPATE TESTs---------------------- */
    
    
    // public static Comparator<Tavara> sortByWeight = new Comparator<Tavara>() {
    //     public int compare(Tavara o1, Tavara o2) {
    //         return Integer.compare(o1.getPaino(), o2.getPaino());
    //     }
    // };
        
    
    /*******************************
     * Comparator for sorting the list by roll no
     * @helpful https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/ 
     */
    // @Override
    public int compare(Tavara o1, Tavara o2) {
        return Integer.compare(o1.getPaino(), o2.getPaino());
    }
}