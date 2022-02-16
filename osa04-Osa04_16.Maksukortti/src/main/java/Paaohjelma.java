
public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);
        
        // Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!


        // task1();
        // task2();
        // task3();
        // task4();
        // task5();
        task6();


    }


    // task1
    private static void task1() {
        Maksukortti kortti = new Maksukortti(50);
        System.out.println(kortti);
    }
    
    // task2
    private static void task2() {
        Maksukortti kortti = new Maksukortti(50);
        System.out.println(kortti);

        kortti.syoEdullisesti();
        System.out.println(kortti);

        kortti.syoMaukkaasti();
        kortti.syoEdullisesti();
        System.out.println(kortti);
    }
    
    // task3
    private static void task3() {
        Maksukortti kortti = new Maksukortti(5);
        System.out.println(kortti);

        kortti.syoMaukkaasti();
        System.out.println(kortti);

        kortti.syoMaukkaasti();
        System.out.println(kortti);
    }
    
    // task4
    private static void task4() {
        Maksukortti kortti = new Maksukortti(10);
        System.out.println(kortti);

        kortti.lataaRahaa(15);
        System.out.println(kortti);

        kortti.lataaRahaa(10);
        System.out.println(kortti);

        kortti.lataaRahaa(200);
        System.out.println(kortti);
    }
    
    // task5
    private static void task5() {
        Maksukortti kortti = new Maksukortti(10);
        System.out.println("Pekka: " + kortti);
        kortti.lataaRahaa(-15);
        System.out.println("Pekka: " + kortti);
    }
    
    // task6
    private static void task6() {
        Maksukortti pekanKortti = new Maksukortti(20);
        Maksukortti matinKortti = new Maksukortti(30);

        pekanKortti.syoMaukkaasti();
        matinKortti.syoEdullisesti();
        System.out.println( "Pekka: "+pekanKortti );
        System.out.println( "Matti: "+matinKortti );
        
        pekanKortti.lataaRahaa(20);
        matinKortti.syoMaukkaasti();
        System.out.println( "Pekka: "+pekanKortti );
        System.out.println( "Matti: "+matinKortti );
        
        pekanKortti.syoEdullisesti();
        pekanKortti.syoEdullisesti();
        matinKortti.lataaRahaa(50);
        System.out.println( "Pekka: "+pekanKortti );
        System.out.println( "Matti: "+matinKortti );


    }
}