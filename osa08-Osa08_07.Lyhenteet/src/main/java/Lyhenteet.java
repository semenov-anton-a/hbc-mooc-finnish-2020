import java.util.HashMap;

public class Lyhenteet{
    
    public HashMap<String, String> txt = new HashMap<>();
    
    public void lisaaLyhenne(String lyhenne, String selite){
        this.txt.put(lyhenne, selite);
    }

    public boolean onkoLyhennetta(String lyhenne){
        return this.txt.containsKey(lyhenne);
    }

    public String haeLyhenne(String lyhenne){
        return this.txt.get(lyhenne);
    }
}