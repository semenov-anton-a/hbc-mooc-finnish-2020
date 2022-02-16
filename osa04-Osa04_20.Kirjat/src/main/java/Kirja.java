

public class Kirja{

    private String name;
    private int pages;
    private int release;
    
    public Kirja(String bookName, int pages, int release){
        this.name = bookName;
        this.pages = pages;
        this.release = release;
    }

    public String getName(){
        return this.name;
    }

    public int getPages(){
        return this.pages;
    }
    
    public int getRelease(){
        return this.release;
    }
}