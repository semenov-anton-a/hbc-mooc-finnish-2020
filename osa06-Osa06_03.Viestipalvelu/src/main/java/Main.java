
public class Main {

    public static void main(String[] args) {

        // Kokeile luokkaasi täällä
        Viestipalvelu vp = new Viestipalvelu();
        
        Viesti msg = new Viesti("sender@bc.fi", "lem4");
        Viesti msg2 = new Viesti("sender@bc.fi", "MessageLen>5");

        vp.lisaa(msg);
        
        System.out.println( msg );
        System.out.println( vp );

    }
}