
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!

        HashMap<String, String> mapNames = new HashMap<>();

        mapNames.put("matin", "mage");
        mapNames.put("mikaelin", "mixu");
        mapNames.put("arton", "arppa");

        System.out.println( mapNames.get("mikaelin") );
    }

}
