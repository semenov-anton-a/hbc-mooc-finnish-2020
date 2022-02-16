

public class Elokuva{

    private String filmName;
    private int ageLimit; 

    public Elokuva( String filmName, int ageLimit ){
        this.filmName = filmName;
        this.ageLimit = ageLimit;
    }
    
    public String nimi(){
        return this.filmName;
    }

    public int ikaraja(){
        return this.ageLimit;
    }

}