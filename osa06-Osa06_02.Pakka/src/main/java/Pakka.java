import java.util.ArrayList;

public class Pakka{

    private ArrayList<String> boxArr;

    public boolean onTyhja(){
        return ( this.boxArr == null || this.boxArr.size() == 0);
    }

    public void lisaa(String arvo){
        if( this.onTyhja() ){
            this.boxArr = new ArrayList<String>();
        }  
        boxArr.add(arvo);
    }

    public String ota(){
        String str = boxArr.get(this.boxArr.size()-1);
        boxArr.remove( this.boxArr.size()-1 );
        return str;
    }

    public ArrayList<String> arvot(){
        if( ! this.onTyhja() ){
            return boxArr;
        }        
        return this.boxArr = new ArrayList<String>();
    }


    

}