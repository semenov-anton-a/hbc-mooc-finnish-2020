import java.util.HashMap;

public class Velkakirja {

    private  HashMap<String,Double> mapCredit = new HashMap<String, Double>();

    public Velkakirja() {
    }

    public void asetaLaina(String kenelle, double maara) {
        this.mapCredit.put(kenelle, maara);
    }

    public double paljonkoVelkaa(String kuka) {
        // return this.mapCredit.get(kuka);
        return this.mapCredit.getOrDefault(kuka,(double) 0);
    
    }
}