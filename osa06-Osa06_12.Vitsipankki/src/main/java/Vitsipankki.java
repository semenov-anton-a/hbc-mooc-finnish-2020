
import java.util.ArrayList;
import java.util.Random;


public class Vitsipankki {

    private ArrayList<String> msgBox = new ArrayList<String>();
    
    public Vitsipankki(){
        this.msgBox = new ArrayList<String>();
    }

    // lisää vitsin vitsipankkiin.
    public void lisaaVitsi(String vitsi) {
        this.msgBox.add( vitsi );
    }

    public String arvoVitsi() {
        if( this.msgBox.isEmpty() ){
            return "Vitsit vähissä.";
        } 
    
        Random arpa = new Random();
        return this.msgBox.get( arpa.nextInt(this.msgBox.size()) );
    }

    // tulostaa vitsipankissa olevat vitsit.
    public void tulostaVitsit() {
        System.out.println("Tulostetaan vitsit.");
        for( String v : this.msgBox ){
            System.out.println(v);
        }
    }
}