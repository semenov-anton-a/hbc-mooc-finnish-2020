
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public int hintaero(Asunto verrattava){
        int thisPrice = this.nelioita * this.neliohinta;
        int objPrice = verrattava.nelioita * verrattava.neliohinta;
        int res = thisPrice - objPrice;
        return ( res < 0 ) ? res * -1 : res;
    }

    public boolean kalliimpi(Asunto verrattava){
        int thisPrice = this.nelioita * this.neliohinta;
        int objPrice = verrattava.nelioita * verrattava.neliohinta;
        return ( thisPrice > objPrice );
    }

    public boolean suurempi(Asunto verrattava){
        return this.nelioita > verrattava.nelioita;
    }
}
