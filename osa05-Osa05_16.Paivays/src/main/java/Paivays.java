
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
                 this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

    public Paivays paivienPaasta(int paivia) {  

        // Paivays uusiPaivays = new Paivays( this.paiva, this.kuukausi, this.vuosi);
        Paivays uusiPaivays =  new Paivays( paiva , this.kuukausi, this.vuosi);
        // tehdään jotain...
        uusiPaivays.etene(paivia);
        // this.paiva += paiva;
        return uusiPaivays;
    }

    public void edista(int i){
        // new Paivays( this.paiva+i , this.kuukausi, this.vuosi);
        // this.etene(i);
        // this.paiva =+ i;   
    }

    public void etene(int montakoPaivaa) {
        while( --montakoPaivaa >= 0 ){
            this.etene();
        }

        /** **************
         *  OR THIS METHOD
         */

        // int day = this.paiva + montakoPaivaa;
        // if( day >= 30 ){
        //     this.monthAdd();
        //     day = day - 30;
        // }
        // this.paiva = day;
    }

    public void etene(){        
        if( this.paiva >= 30 ){
            this.monthAdd();
            this.paiva = 1;
            return;
        }else{
            this.paiva++;
        }
    }
    
    public void monthAdd(){
        if( this.kuukausi >= 12 ){
            this.kuukausi = 1;
            this.vuosi++;
            return;
        }
        this.kuukausi++;
    }

    



}
