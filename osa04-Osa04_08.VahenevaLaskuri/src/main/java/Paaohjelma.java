public class Paaohjelma {
    public static void main(String[] args) {
        VahenevaLaskuri laskuri = new VahenevaLaskuri(10);

        laskuri.nollaa();
        laskuri.tulostaArvo();


        laskuri.vahene();
        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();
        
        laskuri.vahene();
        laskuri.tulostaArvo();
    }
}