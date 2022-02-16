
public class Laskuri {

    private int value;

    public Laskuri (){
        this.value = 0;
    } 

    public Laskuri (int value) {
        this.value = value;
    }

    public int arvo(){
        return this.value;
    }
    
    public void lisaa(){
        this.value++;
    }
    public void lisaa( int value ){
        if( value >= 0 )
            this.value += value;   
    }

    public void vahenna(){
        this.value--;
    }
    public void vahenna( int value ){
        if( value >= 0 )
        this.value -= value;
    }

}