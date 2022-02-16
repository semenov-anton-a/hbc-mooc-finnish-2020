

public class Lahja{


    private int weight;
    private String name;

    public Lahja(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    public String getNimi(){
        return this.name;
    }
    public int getPaino(){        
        return this.weight;
    }

    public String toString(){
        return "Lahja: "+this.name+" ("+this.weight+" kg)";
    }




}