import java.util.ArrayList;

public class Viestipalvelu{


    private ArrayList<Viesti> msgService = new ArrayList<Viesti>();

    public ArrayList<Viesti> Viestipalvelu(){
        // return this.msgService;
        // return this;
        return this.msgService;
    }

    public void lisaa(Viesti viesti){
        // if( this.msgService == null && this.msgService.size() < 0 ){
        //     // Viestipalvelu vp = new Viestipalvelu();
        // }

        if( viesti.getSisalto().length() <= 280 ){
            this.msgService.add( viesti );
        }
    }
    
    public ArrayList<Viesti> getViestit(){
        return this.msgService;
    }
}