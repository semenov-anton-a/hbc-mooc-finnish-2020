
public class Kirja {

    private String nimi;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Kirja)) {
            return false;
        }

        Kirja tempObj = (Kirja) obj;

        if (this.nimi.equals(tempObj.nimi) && 
            this.getJulkaisuvuosi() == tempObj.getJulkaisuvuosi() ) {
            return true;
        }

        return false;        
    }
}
