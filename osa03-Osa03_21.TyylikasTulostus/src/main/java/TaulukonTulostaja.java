
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne

        int i = 0;
        
        for( int t : taulukko ) {
            i++;
            if( i == taulukko.length ){ 
                System.out.print( t ); 
            }else{
                System.out.print( t + ", " ); 
            }
        }        

    }
}
