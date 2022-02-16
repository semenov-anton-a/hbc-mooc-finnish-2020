
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        Scanner lineRequest = new Scanner(System.in);

        ArrayList<Kirja> booksArrList = new ArrayList<Kirja>();

        while (true) {

            String bookName = lineRequest.nextLine();
            
            if( bookName.isEmpty() ){
                
                System.out.println("Mitä tulostetaan?");
                String lReq = lineRequest.nextLine();

                if( lReq.equals("kaikki") ){

                    for( Kirja book : booksArrList ){
                        System.out.println( 
                            book.getName() + ", " 
                            + book.getPages() + " sivua, " 
                            + book.getRelease()
                        );
                    }

                }

                if( lReq.equals("nimi") ){
                    for( Kirja book : booksArrList ){
                        System.out.println( book.getName() );
                    }
                }
                

                break;
            }

            int bookPages   = Integer.valueOf( lineRequest.nextLine() ); 
            int bookRelease = Integer.valueOf( lineRequest.nextLine() ); 

            booksArrList.add( new Kirja(bookName, bookPages, bookRelease) );

        }
    }
}
