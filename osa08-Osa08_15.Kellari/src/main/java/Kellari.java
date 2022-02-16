import java.util.ArrayList;
import java.util.HashMap;

public class Kellari{

    private HashMap<String,ArrayList<String>> kellariMap = new HashMap<String,ArrayList<String>>();

    public void lisaa(String komero, String tavara){
        this.kellariMap.putIfAbsent(komero, new ArrayList<String>());
        ArrayList<String> tList = this.kellariMap.get(komero);
        tList.add(tavara);
    }

    public ArrayList<String> sisalto(String komero) {
        return new ArrayList<String>();
    }

    public void poista(String komero, String tavara){}
    
    public ArrayList<String> komerot(){
        return new ArrayList<String>();
    }
}