
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int intVal = Integer.valueOf( lukija.nextLine() );

        tulostaLuvustaYhteen( intVal );


    }


    public static void tulostaLuvustaYhteen(int luku){
        
        for(int i = luku; i >= 1 ; i--){
            System.out.println(i);
        }

    }

}
