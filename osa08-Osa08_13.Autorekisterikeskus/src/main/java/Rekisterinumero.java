
import java.util.Objects;

public class Rekisterinumero {

    
    // älä muuta luokan jo valmiina olevia osia

    // oliomuuttujille on lisätty määre final, jolloin niiden arvoa ei asetuksen
    // jälkeen voi enää muuttaa
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }

    public String getMaa() {
        return maa;
    }

    public String getRekNro() {
        return rekNro;
    }
    

    @Override
    public boolean equals(Object olio) {
        if (olio == null) {
            return false;
        }

        if (getClass() != olio.getClass()) {
            return false;
        }

        Rekisterinumero verrattava = (Rekisterinumero) olio;
        
        if (this.maa == null || !this.maa.equals(verrattava.getMaa())) {
            return false;
        }

        if (this.rekNro == null || !this.rekNro.equals(verrattava.getRekNro())) {
            return false;
        }

        return true;
    }


    public int hashCode() {
        return ( this.maa.hashCode() + this.rekNro.hashCode() ) * 31;
    }
}
