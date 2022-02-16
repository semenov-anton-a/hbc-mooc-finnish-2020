
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while(true){

            String name = lukija.nextLine();

            if( name.isEmpty() ){

                for( Henkilotieto user : henkilotiedot ){
                    System.out.println(user.getEtunimi()+" "+user.getSukunimi());   
                }

                break;
            }

            String surname = lukija.nextLine();
            String hetu = lukija.nextLine();

            henkilotiedot.add( new Henkilotieto(name, surname, hetu) );

        }

    }
}
