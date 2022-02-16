
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        

        while(true){
            String strLine = lukija.nextLine();
            String [] lineArr = strLine.split(" ");

            if( strLine.equals("") ){
                break;
            }else if( strLine.contains("av") ){
                if( lineArr.length > 1 ){
                    for(int i = 0; i < lineArr.length; i++){
                        if( lineArr[i].contains("av")){
                            System.out.println( lineArr[i] );
                        }
                    }
                }else{
                    System.out.println(strLine);
                }
            }
        }

        

    }
}
    