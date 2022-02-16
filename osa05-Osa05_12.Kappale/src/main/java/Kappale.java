
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }

    public boolean equals( Object verrattava ) {
        // jos muuttujat sijaitsevat samassa paikassa, ovat ne samat
        if ( this == verrattava ) {
            return true;
        }
        
        if( !( verrattava instanceof Kappale) ){
            return false;
        }

        Kappale tempObj = (Kappale) verrattava;

        return (
            this.esittaja.equals( tempObj.esittaja ) &&
            this.nimi.equals(tempObj.nimi)   &&
            this.pituusSekunteina == tempObj.pituusSekunteina
        );
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }


}
