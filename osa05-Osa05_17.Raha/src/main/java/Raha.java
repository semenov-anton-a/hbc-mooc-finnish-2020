
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }


    public Raha plus(Raha lisattava) {
        int eur = this.euroa + lisattava.euroa;
        int sent = this.senttia + lisattava.senttia;
        Raha uusi = new Raha( eur, sent ); // luodaan uusi Raha-olio jolla on oikea arvo
        return uusi;
    }


    public Raha miinus( Raha verrattava ){
        int eur = this.euroa - verrattava.euroa;
        int sent = this.senttia - verrattava.senttia;

        if (eur < 0) {
            return new Raha(0, 0);
        }

        return new Raha( eur -= 1, sent += 100 );
    }

    public boolean vahemman(Raha verrattava){
        return ( 
            this.euroa < verrattava.euroa
            || this.euroa - verrattava.euroa <= 0 
            && this.senttia - verrattava.senttia <= 0
        );
    }


    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

}
