
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia

        // Paivays p = new Paivays(1, 2, 2000);
        // System.out.println( p.equals("heh") );
        // System.out.println( p.equals(new Paivays(5, 2, 2012)) );
        // System.out.println( p.equals(new Paivays(1, 2, 2000)) );


        boolean onko = new Paivays(3, 7, 2011).equals( new Paivays(3, 7, 2011) );
        System.out.println(onko);
    }
}
