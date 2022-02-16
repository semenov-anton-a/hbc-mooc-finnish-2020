
import java.util.ArrayList;

public class Pakkaus{

    private ArrayList<Lahja> lahjat  = new ArrayList<>();


    // public ArrayList<Lahja> Pakkaus(){
    //     return this.lahjat;
    // }

    public void lisaaLahja( Lahja obj ){
        this.lahjat.add( obj );
    }


    public int yhteispaino(){
        int allWeght = 0;

        for( Lahja w : this.lahjat ){
            allWeght += w.getPaino();
        }

        return allWeght;

    }

}