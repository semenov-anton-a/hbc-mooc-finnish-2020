import java.util.Arrays;

public class Paaohjelma {
    
    public static void main(String[] args) {
        // tee testikoodia tänne
        
        // TEST 1
        int[] luvut = { 6, 5, 8, 7, 11, 10, 50, 2 };
        System.out.println("Pienin: " + Paaohjelma.pienin(luvut));

        // // TEST 2
        int[] luvut1 = { 6, 5, 8, 7, 11, 10, 50 };
        System.out.println("Pienimmän indeksi: " + Paaohjelma.pienimmanIndeksi(luvut1));
        
        // // TEST 2
        int[] luvut3 = { -1, 3, 1, 2 };
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut3, 0));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut3, 1));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut3, 2));

        // // TEST 4
        int[] luvut4 = { 3, 2, 5, 4, 8 };
        System.out.println(Arrays.toString(luvut4));
        Paaohjelma.vaihda(luvut4, 1, 0);
        System.out.println(Arrays.toString(luvut4));
        Paaohjelma.vaihda(luvut4, 0, 3);
        System.out.println(Arrays.toString(luvut4));
        
        // TEST 5
        int[] luvut5 = { 8, 3, 7, 9, 1, 2, 4 };
        Paaohjelma.jarjesta(luvut5);

    }

    public static int pienin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int pienimmanIndeksi(int[] arr) {
        int val = Paaohjelma.pienin(arr);
        int inx = 0;
        while (inx < arr.length) {
            if (arr[inx] == val) {
                return inx;
            }
            inx++;
        }

        return -1;
    }

    public static int pienimmanIndeksiAlkaen(int[] arr, int aloitusIndeksi) {
        int val = arr[aloitusIndeksi];
        int inx = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < arr.length; i++) {
            if (arr[i] < val) {
                inx = i;
                val = arr[i];
            }
        }
        return inx;
    }

    public static void vaihda(int[] arr, int inx1, int inx2) {
        int helpVar = arr[inx1];
        arr[inx1] = arr[inx2];
        arr[inx2] = helpVar;
    }

    public static void jarjesta(int[] arr) {
        int indeksi = 0;
        // System.out.println( Arrays.toString(arr) );
        
        for (int i = 0; i < arr.length; i++) {
            indeksi = Paaohjelma.pienimmanIndeksiAlkaen(arr, i);
            Paaohjelma.vaihda(arr, i, indeksi);
            System.out.println( Arrays.toString(arr) );
        }
    }

}
