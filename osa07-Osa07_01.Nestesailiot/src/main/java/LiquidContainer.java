import java.util.ArrayList;

public class LiquidContainer {

    // Constanta
    final private int maxContainer = 100;
    private int liquidContainer;

    public void LiquidContainer() {
    }

    public void addLiquidQuantity(int liquidQuantity) {

        if (!this.positiveInteger(liquidQuantity)) {
            return;
        }

        if (liquidQuantity + this.liquidContainer >= this.maxContainer) {
            this.liquidContainer = this.maxContainer;
            return;
        }

        if (liquidQuantity >= this.maxContainer) {
            this.liquidContainer = this.maxContainer;
            return;
        }

        this.liquidContainer += liquidQuantity;
    }

    public void removeLiquidQuantity(Integer liquidQuantity) {

        if (!this.positiveInteger(liquidQuantity)) {
            return;
        }

        if (this.liquidContainer - liquidQuantity <= 0) {
            this.liquidContainer = 0;
            return;
        }

        this.liquidContainer -= liquidQuantity;
    }

    public void moveLiquidQuantity(LiquidContainer liquidContainer, int liquidQuantity) {
        if (!this.positiveInteger(liquidQuantity)) {
            return;
        }

        int maths = this.liquidContainer - liquidQuantity;
        
        if (maths < 0) {
            liquidContainer.addLiquidQuantity(this.liquidContainer);
            this.liquidContainer = 0;
            return ;
        } 
        
        // This object update
        this.liquidContainer -= liquidQuantity;

        // Request object update
        liquidContainer.addLiquidQuantity( liquidQuantity );
        
    }

    private boolean positiveInteger(int i) {
        return (i > 0);
    }

    public String toString() {
        return this.liquidContainer + "/" + this.maxContainer;
    }
}