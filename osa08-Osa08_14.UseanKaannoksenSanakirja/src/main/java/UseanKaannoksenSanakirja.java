import java.util.ArrayList;
import java.util.HashMap;

public class UseanKaannoksenSanakirja{

    private HashMap<String, ArrayList<String>> translateMap = new HashMap<String, ArrayList<String>>(); 
    private ArrayList<String> translateList = new ArrayList<String>();

    public void lisaa(String sana, String kaannos){
        
        this.translateMap.putIfAbsent(sana, new ArrayList<String>());
        ArrayList<String> tList = this.translateMap.get(sana);
        tList.add(kaannos);
    }

    public ArrayList<String> kaanna(String sana){
        if( this.translateMap.get(sana) != null ){
            return this.translateMap.get(sana);
        }

        return new ArrayList<String>();
    }

    public void poista(String sana){
        if( this.translateMap.get(sana) != null ){
            this.translateMap.remove(sana);
        }
    }


    // public void print(){
    //     System.out.println("\n===DEBUG");
    //     System.out.println(this.translateMap);
    // }

}