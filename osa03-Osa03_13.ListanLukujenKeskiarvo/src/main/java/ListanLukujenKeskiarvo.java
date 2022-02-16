
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville

        ArrayList<Integer> lista = new ArrayList<>();
        
        int summa = 0;
        double average = 0;
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                for(int i = 0; i < lista.size(); i++) {
                    summa = summa + lista.get(i);
                }
                average = (double)summa / lista.size() ;
                break;
            }
            lista.add(luettu);
        }

        System.out.println("");
        System.out.println("Keskiarvo : " + average);
    }
}
