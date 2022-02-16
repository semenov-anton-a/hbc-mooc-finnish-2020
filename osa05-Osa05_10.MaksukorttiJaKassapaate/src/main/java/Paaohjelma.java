
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia

        // task1();
        // task2();
        // task3();
        task4();
    }

    private static void task4() {
        Kassapaate unicafeExactum = new Kassapaate();
        System.out.println(unicafeExactum);

        Maksukortti antinKortti = new Maksukortti(2);

        System.out.println("kortilla rahaa " + antinKortti.saldo() + " euroa");

        boolean onnistuiko = unicafeExactum.syoMaukkaasti(antinKortti);
        System.out.println("riittikö raha: " + onnistuiko);

        unicafeExactum.lataaRahaaKortille(antinKortti, 100);

        onnistuiko = unicafeExactum.syoMaukkaasti(antinKortti);
        System.out.println("riittikö raha: " + onnistuiko);

        System.out.println("kortilla rahaa " + antinKortti.saldo() + " euroa");

        System.out.println(unicafeExactum);    
    }

    private static void task3() {
        //
        Kassapaate unicafeExactum = new Kassapaate();

        double vaihtorahaa = unicafeExactum.syoEdullisesti(10);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        Maksukortti antinKortti = new Maksukortti(7);

        boolean onnistuiko; 
        
        onnistuiko = unicafeExactum.syoMaukkaasti(antinKortti);
        System.out.println("riittikö raha: " + onnistuiko);
        
        onnistuiko = unicafeExactum.syoMaukkaasti(antinKortti);
        System.out.println("riittikö raha: " + onnistuiko);
    
        onnistuiko = unicafeExactum.syoEdullisesti(antinKortti);
        System.out.println("riittikö raha: " + onnistuiko);

        System.out.println(unicafeExactum);
    }

    private static void task2() {
        //
        Kassapaate unicafeExactum = new Kassapaate();

        // var init 
        double vaihtorahaa;

        vaihtorahaa = unicafeExactum.syoEdullisesti(10);
            System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        vaihtorahaa = unicafeExactum.syoEdullisesti(5);
            System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        vaihtorahaa = unicafeExactum.syoMaukkaasti(4.3);
            System.out.println("vaihtorahaa jäi " + vaihtorahaa);

            System.out.println(unicafeExactum);
    }

    private static void task1() {
        //
        Maksukortti pekanKortti = new Maksukortti(10);

        System.out.println("rahaa " + pekanKortti.saldo());
        boolean onnistuiko = pekanKortti.otaRahaa(8);
        System.out.println("onnistuiko otto: " + onnistuiko);
        System.out.println("rahaa " + pekanKortti.saldo());

        onnistuiko = pekanKortti.otaRahaa(4);
        System.out.println("onnistuiko otto: " + onnistuiko);
        System.out.println("rahaa " + pekanKortti.saldo());
    }
    }

