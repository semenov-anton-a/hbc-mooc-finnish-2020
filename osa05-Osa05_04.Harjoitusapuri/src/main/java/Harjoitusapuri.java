

public class Harjoitusapuri{

    private int age;
    private int normal;

    public Harjoitusapuri(int ika, int leposyke){

        this.age = ika;
        this.normal = leposyke;

    }

    public double tavoitesyke(double prosenttiaMaksimista){
        double max =  206.3 - (0.711 * this.age);
       return ( max - this.normal ) * (prosenttiaMaksimista) + this.normal;
    }

}