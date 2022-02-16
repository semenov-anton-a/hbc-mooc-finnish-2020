import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;

public class Birds{

    // HashMap { "Name"={latinName, finding} }
    private HashMap<String,ArrayList<String>> birdsDB = new HashMap<String,ArrayList<String>>();

    public Birds(){}

    /**
     * Add Bird
     * @param name
     * @param nameLatin
     */
    public void add( String name, String nameLatin ){
        if( ! this.birdExists(name) ) // add if not fount in DB
        {
            ArrayList<String> bird = new ArrayList<String>();
            bird.add(nameLatin);
            bird.add( String.valueOf(0) );
            
            // Add to 
            this.birdsDB.put(name, bird);
        }
    }

    /**
     * Add finding count +1
     * @param name
     */
    public boolean addFinding( String name ){
        if( this.birdExists(name) ) // Bird exist, add +1 finding
        {
            int count = Integer.parseInt( this.birdsDB.get( name ).get(1) ); 
            count++;
            this.birdsDB.get( name ).set(1, String.valueOf(count) );
            
            return true;
        }
        return false;
    }

    /**
     * 
     */
    public HashMap<String,ArrayList<String>> getAllBirds(){
        return this.birdsDB;
    }

    /**
     * Check key exist
     * @param name
     * @return boolean
     */
    private boolean birdExists( String name ){
        return this.birdsDB.containsKey( name );
    }

    // Debud methods
    public void printBirds(){
        System.out.println(this.birdsDB);
    }

    public ArrayList<String> getBird(String name) {
        
        if( this.birdExists(name) ){
            return this.birdsDB.get( name );
        }

        return null;
    }


}