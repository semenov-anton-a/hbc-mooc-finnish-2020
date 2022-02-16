
public class Paaohjelma {

    public static void main(String[] args) {
        // esimerkkipääohjelma tehtävän ensimmäiseen kohtaan
        // task1();
        // task2();
        task3();
    }

    private static void task3() {
        // esimerkkipääohjelma tehtävän ensimmäiseen kohtaan

        Kasvatuslaitos haaganNeuvola = new Kasvatuslaitos();

        Henkilo eero = new Henkilo("Eero", 1, 110, 7);
        Henkilo pekka = new Henkilo("Pekka", 33, 176, 85);

        System.out.println("punnituksia tehty " + haaganNeuvola.punnitukset()) ;

        haaganNeuvola.punnitse(eero);
        haaganNeuvola.punnitse(pekka);

        System.out.println("punnituksia tehty " + haaganNeuvola.punnitukset());

        haaganNeuvola.punnitse(eero);
        haaganNeuvola.punnitse(eero);
        haaganNeuvola.punnitse(eero);
        haaganNeuvola.punnitse(eero);

        System.out.println("punnituksia tehty " + haaganNeuvola.punnitukset());

    }

    private static void task2() {
        Kasvatuslaitos haaganNeuvola = new Kasvatuslaitos();

        Henkilo eero = new Henkilo("Eero", 1, 110, 7);
        Henkilo pekka = new Henkilo("Pekka", 33, 176, 85);

        System.out.println(eero.getNimi() + " paino: " + haaganNeuvola.punnitse(eero) + " kiloa");
        System.out.println(pekka.getNimi() + " paino: " + haaganNeuvola.punnitse(pekka) + " kiloa");

        haaganNeuvola.syota(eero);
        haaganNeuvola.syota(eero);
        haaganNeuvola.syota(eero);

        System.out.println("");

        System.out.println(eero.getNimi() + " paino: " + haaganNeuvola.punnitse(eero) + " kiloa");
        System.out.println(pekka.getNimi() + " paino: " + haaganNeuvola.punnitse(pekka) + " kiloa");

    }

    public static void task1() {
        Kasvatuslaitos haaganNeuvola = new Kasvatuslaitos();

        Henkilo eero = new Henkilo("Eero", 1, 110, 7);
        Henkilo pekka = new Henkilo("Pekka", 33, 176, 85);

        System.out.println(eero.getNimi() + " paino: " + haaganNeuvola.punnitse(eero) + " kiloa");
        System.out.println(pekka.getNimi() + " paino: " + haaganNeuvola.punnitse(pekka) + " kiloa");

    }
}
