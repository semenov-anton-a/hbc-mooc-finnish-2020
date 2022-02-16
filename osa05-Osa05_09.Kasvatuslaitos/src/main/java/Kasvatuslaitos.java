
public class Kasvatuslaitos {
    
    private int weightCount = 0;
    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        // return -1;
        // this.weightCount = this.weightCount + 1;
        this.weightCount = this.weightCount + 1;
        return (int) henkilo.getPaino();
    }


    public void syota(Henkilo henkilo){
        henkilo.setPaino( henkilo.getPaino() + 1 );
    }

    public int punnitukset() {
        return this.weightCount;
    }

}
