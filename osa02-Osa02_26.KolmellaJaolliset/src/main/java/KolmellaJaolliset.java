
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        kolmellaJaollisetValilta(3, 6);
        kolmellaJaollisetValilta(2, 10);

    }
    public static void kolmellaJaollisetValilta(int alku, int loppu){
        while (alku <= loppu) {
            if (alku % 3 == 0) {
                System.out.println(alku);
            }
            alku++;
        }   
    }
}
