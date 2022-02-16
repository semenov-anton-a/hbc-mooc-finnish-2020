public class Lukutilasto {
    private int lukujenMaara = 0;
    private int summa = 0;

    public Lukutilasto() {
        // alusta tässä muuttujat maara ja summa
        this.lukujenMaara = 0;
        this.summa = 0;
    }

    public void lisaaLuku(int luku) {
        // kirjoita koodia tähän
        this.summa += luku; 
        this.lukujenMaara++;
    }

    public int haeLukujenMaara() {
        // kirjoita koodia tähän
        return this.lukujenMaara;
    }

    public int summa() {
        // kirjoita koodia tähän
        return this.summa;
    }

    public double keskiarvo() {
        // kirjoita koodia tähän\
        if( this.summa == 0 ){
            return 0;
        }

        return ( (double) this.summa / (double) this.lukujenMaara );
    }

}