
public class Maksukortti {
    private double saldo;

    public Maksukortti(double alkusaldo) {
        // kirjoita koodia tähän
        this.saldo = alkusaldo;
    }

    public void syoEdullisesti() {
        // kirjoita koodia tähän
        if( this.saldo - 2.6 >= 0 ){
            this.saldo -= 2.6; 
        }

    }
    
    public void syoMaukkaasti() {
        // kirjoita koodia tähän
        if( this.saldo - 4.6 >= 0 ){
            this.saldo -= 4.6; 
        }
    }

    public void lataaRahaa(double rahamaara) {
        // kirjoita koodia tähän        
        if( rahamaara > 0 ){
            if( this.saldo + rahamaara > 150 ){
                this.saldo = 150;
            }else{
                this.saldo += rahamaara;
            }
        }
    }

    public String toString() {
        // kirjoita koodia tähän
        
        return "Kortilla on rahaa "+this.saldo+" euroa";
    }
}