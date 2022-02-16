
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        ArrayList<Henkilo> henkilot = lueHenkilot(tiedosto);
        System.out.println("Henkilöitä: " + henkilot.size());
        System.out.println("Henkilöt:");
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);

        }
    }

    public static ArrayList<Henkilo> lueHenkilot(String tiedosto) {
        ArrayList<Henkilo> henkilot = new ArrayList<>();

        // toteuta henkilöiden lukeminen ja luominen tänne

        try( Scanner file = new Scanner(Paths.get(tiedosto)) ) {

            while( file.hasNextLine() ) {
                String[] lineArr = file.nextLine().split(",");
                int ageInt = Integer.valueOf( lineArr[1] );
                henkilot.add( new Henkilo(lineArr[0], ageInt) ); 
            }

        }catch( Exception e ) {
            System.out.println("Error read file.");
        }


        return henkilot;

    }
}
