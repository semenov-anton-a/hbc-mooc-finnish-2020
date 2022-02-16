
public class Kassapaate {

    private double rahaa; // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat; // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        // kassassa on aluksi 1000 euroa rahaa
        this.rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja
        // metodi palauttaa koko summan
        // return -1;
        double price = 2.50;
        double diff = maksu - price;
        if (maksu < price) {
            return maksu; 
        }

        this.rahaa += price;

        this.edulliset++;
        return diff;
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        // edullinen lounas maksaa 2.50 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        double price = 2.50;
        
        if( kortti.otaRahaa(price) ){
            this.edulliset++;
            return true;
        }
        
        return false;

    }

    public double syoMaukkaasti(double maksu) {
        // maukas lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja
        // metodi palauttaa koko summan
        double price = 4.30;
        double diff = maksu - price;        
        if (maksu < price) {
            return maksu; 
        }
        this.rahaa += price;
        this.maukkaat++;
        return diff;
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        // maukas lounas maksaa 4.30 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        double price = 4.30;
        if( kortti.otaRahaa(price) ){
            this.maukkaat++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " + edulliset + " maukkaita lounaita myyty "
                + maukkaat;
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa)  {
        if (summa > 0){
            kortti.lataaRahaa( summa );
            this.rahaa += summa;
        }
    }
}
