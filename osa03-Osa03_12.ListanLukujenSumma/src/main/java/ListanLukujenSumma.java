
import java.util.ArrayList;
import java.util.Scanner;


public class ListanLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        
        int summa = 0;

        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                

                for(int i = 0; i < lista.size(); i++) {
                    summa = summa + lista.get(i);
                }

                
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");
        System.out.println("Summa : " + summa);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
