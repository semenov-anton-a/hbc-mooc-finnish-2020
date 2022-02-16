

public class Velka {
    private double saldo ;
    private double procent;


    public Velka(double saldo, double procent){
        this.saldo = saldo;
        this.procent = procent;
    }

    public void tulostaSaldo(){
        System.out.println( saldo );
    }


    public void odotaVuosi(){
        this.saldo *= this.procent;
    }
}