import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Comparator;

public class ReseptFile {

    private HashMap<String, ArrayList<String>> reseptsCollection = new HashMap<String, ArrayList<String>>();
    public ReseptFile(String fileName) {

        
        ArrayList<String> reseptList = new ArrayList<String>();
        try {

            // Read file
            List<String> file = Files.readAllLines(Paths.get(fileName));

            int size = file.size() - 1;
            int i = 0;

            for (String line : file) {

                // add line
                reseptList.add(line);

                if (line.isEmpty() || i == size) {

                    // Get Resept Name index
                    int inx = (reseptList.get(0).equals("")) ? 1 : 0;

                    if (1 + i > size) {
                        reseptsCollection.put(reseptList.get(inx), reseptList);
                        break;
                    }
                    // Remove empty line from array
                    reseptList.remove(reseptList.size() - 1);
                    reseptsCollection.put(reseptList.get(inx), reseptList);

                    // unset array
                    reseptList = new ArrayList<String>();
                    // reseptList.clear();
                }

                i++;
            }

        } catch (Exception e) {
            System.out.println("ERROR read file: " + e.getMessage());
        }

    }// END

    /**
     * Show Options
     * 
     * @return String
     */
    public String printOptions() {
        return ("listaa - listaa reseptit \n" + "lopeta - lopettaa ohjelman\n"
                + "hae nimi - hakee reseptiä nimen perusteella\n"
                + "hae keittoaika - hakee reseptiä keittoajan perusteella\n"
                + "hae aine - hakee reseptiä raaka-aineen perusteella");
    }

    public void showReseptListHashMap() {
        System.out.println(this.reseptsCollection);
    }

    /**
     * List resepts
     */
    public void reseptList() {
        for (Entry<String, ArrayList<String>> resept : this.reseptsCollection.entrySet()) {
            this.printReseptWithTime(resept);
        }
    }

    /**
     * Helpful function. Print resepts with time
     * 
     * @param resept
     */
    private void printReseptWithTime(Entry<String, ArrayList<String>> resept) {
        System.out.println(this.printGetSting(resept));
    }

    private String printGetSting(Entry<String, ArrayList<String>> resept) {
        return resept.getKey() + ", keittoaika: " + resept.getValue().get(1);
    }

    /**
     * Find and Print resept by name
     * 
     * @param resept
     */
    public void reseptByName(String needleResept) {
        for (Entry<String, ArrayList<String>> resept : this.reseptsCollection.entrySet()) {
            if (resept.getKey().contains(needleResept)) {
                this.printReseptWithTime(resept);
            }
        }
    }

    /**
     * Find resept by time
     * 
     * @param int time
     */
    public void reseptByTime(int needleReseptTime) {
        HashMap<String, Integer> reseptMap = new HashMap<String, Integer>();

        for (Entry<String, ArrayList<String>> resept : this.reseptsCollection.entrySet()) {

            int time = Integer.parseInt(resept.getValue().get(1));

            if (time <= needleReseptTime) {

                reseptMap.put(this.printGetSting(resept), time);

                // this.printReseptWithTime(resept);
            }
        }

        ArrayList<String> list = new ArrayList<>( reseptMap.keySet() );
        list.sort( Comparator.comparing(reseptMap::get) );
        
        for ( String key : list ){
            System.out.println(key);
        }

    }   

    public void reseptByProduct(String reseptProduct) {
        for (Entry<String, ArrayList<String>> resept : this.reseptsCollection.entrySet()) {
            if (resept.getValue().contains(reseptProduct)) {
                this.printReseptWithTime(resept);
            }
        }
    }

}