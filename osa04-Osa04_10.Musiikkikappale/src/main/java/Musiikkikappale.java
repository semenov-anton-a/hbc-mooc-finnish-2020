

public class Musiikkikappale{

    private String nimi;
    private int length;

    public Musiikkikappale( String nimi, int length){
        this.nimi = nimi;
        this.length = length;   
    }

    public String nimi(){
        return this.nimi;
    }
    public int pituus(){
        return this.length ;
    }

}