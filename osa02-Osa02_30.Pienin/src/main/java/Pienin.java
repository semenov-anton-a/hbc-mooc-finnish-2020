
public class Pienin {

    public static int pienin(int luku1, int luku2) {
        // kirjoita koodia tähän
        // älä tulosta metodin sisällä mitään
        // lopussa oltava komento return
        
        if( luku1 < luku2 ) {
            return luku1;
        }else if( luku2 < luku1 ) {
            return luku2;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int vastaus = pienin(2, 7);
        System.out.println("Pienin: " + vastaus);
    }
}
