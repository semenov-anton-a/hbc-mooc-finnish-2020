
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Code> codeArr = new ArrayList<Code>();
        
        while (true) {
            
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String strCode = lukija.nextLine();

            if( strCode.isEmpty() ){ break; }

            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String strName = lukija.nextLine();

            if( strName.isEmpty() ){ break; }

            Code code = new Code(strCode, strName);

            if( ! codeArr.contains(code) ){
                codeArr.add( code );
            }
        }

        System.out.println( "==Esineet==" );
        for( Code code : codeArr ){
            System.out.println( code.getCode() + ": "+code.getName() );
        }
    }
}
