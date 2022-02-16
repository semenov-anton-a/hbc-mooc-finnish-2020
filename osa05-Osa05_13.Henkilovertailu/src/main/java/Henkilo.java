
import java.util.Objects;

public class Henkilo {

    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;

    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;
        this.syntymaPaiva = syntymaPaiva;
        this.pituus = pituus;
        this.paino = paino;
    }

    public String getFormatBirsday(Henkilo obj) {
        String thisBirthday = obj.syntymaPaiva.getPaiva() + "." + obj.syntymaPaiva.getKuukausi() + "."
                + obj.syntymaPaiva.getVuosi();
        return thisBirthday;
    }

    public boolean equals(Object verrattava) {

        if (this == verrattava) {
            return true;
        }

        if (!(verrattava instanceof Henkilo)) {
            return false;
        }

        Henkilo tempObj = (Henkilo) verrattava;

        if (
            this.nimi == tempObj.nimi && 
            this.pituus == tempObj.pituus && 
            this.paino == tempObj.paino && 
            this.syntymaPaiva.equals(tempObj.syntymaPaiva)) {
            return true;
        }

        return false;
    }

    // toteuta tänne equals-metodi, jolla tarkastellaan olioiden samuutta
}
