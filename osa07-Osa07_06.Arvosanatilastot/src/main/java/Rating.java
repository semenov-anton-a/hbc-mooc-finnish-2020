import java.util.ArrayList;
import java.util.stream.Collectors;

public class Rating{

    private ArrayList<Integer> ratingBox = new ArrayList<Integer>();
    private final double[] average50 = {-1,0,0,0};

    public double getAllRating() {
        this.ratingBox.size();
        Integer sum = this.ratingBox.stream().reduce(0, Integer::sum);
        return (double)sum / this.ratingBox.size();
    }

    public double getApprovedRatingProcent(){ return this.average50[3]; }      
    
    /**
     * Get Average > 50 from @var ratingBox
     * @return [ filterCout, elmentsSumma, average, procent ]
     */
    private final boolean _getApprovedRating50Count(){
        
        // Begin Filter value > 50
        ArrayList<Integer> list = (ArrayList<Integer>) 
            this.ratingBox.stream().filter( i->i >= 50 ).collect( Collectors.toList() );
        // END filtering

        if( list.isEmpty() ){ return false; }

        this.average50[0] = list.size(); // Size of > 50
        this.average50[1] = list.stream().reduce(0, Integer::sum); // Sum of array
        this.average50[2] = this.average50[1] / this.average50[0]; // Average of array
        this.average50[3] = 100 * this.average50[0] / this.ratingBox.size(); // Procent average of array

        return true;
    } 
    
    public String getApprovedRating() {        

        if( ! this._getApprovedRating50Count() ){ return "-"; }
                
        return ""+(double)this.average50[2];
    }

    public void addRating(int scanerInt) {
        this.ratingBox.add(scanerInt);
    }

    public String printValues() {
        String delimiter = "*";
        
        StringBuilder v99Star = new StringBuilder(); 
        StringBuilder v89Star = new StringBuilder();
        StringBuilder v79Star = new StringBuilder();
        StringBuilder v69Star = new StringBuilder();
        StringBuilder v59Star = new StringBuilder();
        StringBuilder v49Star = new StringBuilder();
        
        this.ratingBox.stream().filter( i->i >=90 ).forEach( (i) -> {v99Star.append(delimiter);} );
        this.ratingBox.stream().filter( i->i < 90 && i >= 80 ).forEach( (i) -> {v89Star.append(delimiter);} );
        this.ratingBox.stream().filter( i->i < 80 && i >= 70 ).forEach( (i) -> {v79Star.append(delimiter);} );
        this.ratingBox.stream().filter( i->i < 70 && i >= 60 ).forEach( (i) -> {v69Star.append(delimiter);} );
        this.ratingBox.stream().filter( i->i < 60 && i >= 50 ).forEach( (i) -> {v59Star.append(delimiter);} );
        this.ratingBox.stream().filter( i->i < 50 ).forEach( (i) -> {v49Star.append(delimiter);} );

        return ( "\n"
            + "5: " +v99Star.toString() + "\n" 
            + "4: " +v89Star.toString() + "\n" 
            + "3: " +v79Star.toString() + "\n" 
            + "2: " +v69Star.toString() + "\n" 
            + "1: " +v59Star.toString() + "\n" 
            + "0: " +v49Star.toString()
        );
    }
    
}