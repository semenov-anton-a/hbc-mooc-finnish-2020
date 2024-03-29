
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> listValue;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.listValue = new ArrayList<>();
    }

    public double arvosanojenKeskiarvo(){
        
        if( this.arvosanat.isEmpty() ) return -1;
        
        double sumOut = 0.0;
        for( double d : this.arvosanat ){
            sumOut += d;
        }

        // System.out.println( "Arvosanojen  keskiarvo:" + sumOut / this.arvosanat.size());
        return sumOut / this.arvosanat.size();
        
    }

    public double koepisteidenKeskiarvo(){
        if( this.arvosanat.isEmpty() ) return -1;

        double sumOut = 0.0;
        for( double d : this.listValue ){
            sumOut += d;
        }

        // System.out.println( "Koepisteiden keskiarvo:" + sumOut / this.listValue.size());
        return sumOut / this.listValue.size();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.arvosanat.add( pisteetArvosanaksi(pisteet) );
        this.listValue.add( pisteet );
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
}
