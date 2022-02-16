
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne

        Tili matinTili = new Tili("Matin tili", 1000.0);
        Tili omaTili = new Tili("Oma tili", 0.0);

        double count = 100.0;
        matinTili.otto( count );
        omaTili.pano( count );


        System.out.println(omaTili);
        System.out.println(matinTili);

    }
}
