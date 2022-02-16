

public class Kirja {
    
    private String name;
    private String author;
    private Integer pages;

    public Kirja(String kirjailija, String nimi, int sivuja){
        this.author = kirjailija;
        this.name = nimi;
        this.pages = sivuja;
    }

    public String getKirjailija(){
        return this.author;
    }

    public String getNimi(){
        return this.name;
    }
    public int getSivuja(){
        return this.pages;
    }

    public String toString(){
        return this.author 
            + ", "
            + this.name 
            + ", "+this.pages+" sivua";
    }
}