

public class Kuutio{

    private int length;

    public Kuutio( int length ){
        this.length = length;
    }

    public int tilavuus(){
        return length * length * length;
    }

    public String toString(){
        return "Kuution särmän pituus on "+this.length+", tilavuus on "+this.tilavuus();
    }

}