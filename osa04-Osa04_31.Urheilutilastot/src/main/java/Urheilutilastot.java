
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // task1( lukija );
        task2(lukija);
    }

    public static ArrayList<String> task1(Scanner lukija) {

        System.out.println("Minkä niminen tiedosto luetaan?");
        String fileName = lukija.nextLine();

        ArrayList<String> fileList = getFileLines(fileName);

        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String findRowName = lukija.nextLine();

        int count = 0;
        for (int i = 0; i < fileList.size(); i++) {
            if (fileList.get(i).contains(findRowName)) {
                count++;
            }
        }
        System.out.println("Otteluita: " + count);
        return fileList;

    }

    public static void task2(Scanner lukija) {

        System.out.println("Minkä niminen tiedosto luetaan?");
        String fileName = lukija.nextLine();

        ArrayList<String> fileList = getFileLines(fileName);

        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String findRowName = lukija.nextLine();

        
        int count = 0;
        int winCount = 0;
        int lossCount = 0;
        for (int i = 0; i < fileList.size(); i++) {
            
            if ( fileList.get(i).contains(findRowName) ) {

                String[] tempArr = fileList.get(i).split(",");
                int tempNum_1 = Integer.valueOf(tempArr[2]);
                int tempNum_2 = Integer.valueOf(tempArr[3]);

                if (tempArr[0].equals(findRowName)) {
                    
                    if ( tempNum_1 > tempNum_2 ) {
                        winCount++;
                    } else {
                        lossCount++;
                    }
                }

                if ( tempArr[1].equals(findRowName) ) {

                    if ( tempNum_1 < tempNum_2 ) {
                        winCount++;
                    } else {
                        lossCount++;
                    }
                }

                // Name Find Count
                count++;
            }

        }

        // System.out.println( myList.get(0).getName() );

        System.out.println("Otteluita: "+ count );
        System.out.println("Voittoja: " + winCount );
        System.out.println("Tappioita: " + lossCount );
    }

    public static ArrayList getFileLines(String fileName) {

        ArrayList<String> lines = new ArrayList<String>();

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                lines.add(file.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error reading file :" + fileName);
        }

        return lines;
    }
}
