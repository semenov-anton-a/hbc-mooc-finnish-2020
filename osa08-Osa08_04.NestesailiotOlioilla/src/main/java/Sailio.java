
public class Sailio{

    final private int maxTank = 100;
    private int currentTankValue = 0;

    public void Sailio(){}


    public void lisaa(int addValue) {
        if( ! (addValue > 0) ) return;
        
        if( this.currentTankValue + addValue >= this.maxTank  ){
            this.currentTankValue = this.maxTank;
            return;
        }

        this.currentTankValue += addValue;
    }

    public void poista(int removeValue) {
        if( ! (removeValue > 0) ) return;
        
        if( this.currentTankValue - removeValue <= 0 ){
            this.currentTankValue = 0;
            return;
        }

        this.currentTankValue -= removeValue;
    }
    
    public int sisalto(){
        return this.currentTankValue;
    }
    public String toString() {
        return this.currentTankValue + "/" + this.maxTank;
    }
   


}