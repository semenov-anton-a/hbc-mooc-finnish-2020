

public class Sekuntikello {

    private Viisari sec;
    private Viisari mSec;

    public Sekuntikello() {
        this.sec = new Viisari(60);
        this.mSec = new Viisari(100);
    }   

    public void etene(){
        this.mSec.etene();

        if( this.mSec.arvo() == 0 )
            this.sec.etene();
    }

    public String toString() {
        
        return this.sec + ":" + this.mSec;

        // String strMiliSec = (this.mSec < 10) 
        //         ? String.valueOf("0"+this.mSec) 
        //         : String.valueOf(this.mSec);
        
        // String strSec = (this.sec < 10) 
        //     ? String.valueOf("0"+this.sec) 
        //     : String.valueOf(this.sec);

        // return strSec + ":" + strMiliSec; 
        
    }

}