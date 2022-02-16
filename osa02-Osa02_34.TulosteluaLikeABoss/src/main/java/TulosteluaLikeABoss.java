
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        for(int i=0 ; i < maara; i++) {
            System.out.print("*");
        }
        System.out.println();  
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        for(int i=0 ; i < maara; i++) {
            System.out.print(" ");
        }
    }

    // tulostaKolmio
    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2;
        int j = koko;
        for(int i=1 ; i <= koko; ++i){
            tulostaTyhjaa(--j);
            tulostaTahtia(i);
        }
    }   

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        int j = korkeus;
        int i2 = -1;
        for(int i=1 ; i <= korkeus; i++){
            tulostaTyhjaa(--j);
            i2=i2+2;
            tulostaTahtia( i2 );          
        }
        
        int position = (i2/2)-1;
        tulostaTyhjaa(position);
        tulostaTahtia(3);
        
        tulostaTyhjaa(position);
        tulostaTahtia(3);
        
    }
    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        
        // tulostaTahtia(5);
        // System.out.println();
        // System.out.println("---");

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
