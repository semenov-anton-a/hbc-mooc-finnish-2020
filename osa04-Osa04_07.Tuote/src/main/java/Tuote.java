

public class Tuote {

    private String productName;
    private double productPrice;
    private int productCount;

    public Tuote( String name, double price, int count ){
        this.productName = name;
        this.productPrice = price;
        this.productCount = count;
    }


    public void tulostaTuote() {
        System.out.println(
            this.productName + ", " 
            + this.productPrice + ", "
            + this.productCount + " kpl"
        ) ;
    }

}