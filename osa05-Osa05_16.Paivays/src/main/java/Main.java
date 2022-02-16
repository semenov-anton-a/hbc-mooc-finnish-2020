
public class Main {

    public static void main(String[] args) {

        // Paivays pvm = new Paivays(13, 2, 2015);
        // System.out.println("Tarkistellun viikon perjantai on " + pvm);
    
        // Paivays uusiPvm = pvm.paivienPaasta(7);
        // int vk = 1;
        // while (vk <= 7) {
        //     System.out.println("Perjantai " + vk + " viikon kuluttua on " + uusiPvm);
        //     uusiPvm = uusiPvm.paivienPaasta(7);
    
        //     vk = vk + 1;
        // }
    
        // System.out.println("Päivämäärä 790:n päivän päästä tarkistellusta perjantaista on ... kokeile itse!");
        // System.out.println("Kokeile " + pvm.paivienPaasta(790));

        // Paivays nyt = new Paivays(30, 12, 2011);
        
        Paivays nyt = new Paivays(13, 2, 2015);
        Paivays viikonPaasta = nyt;
        viikonPaasta.edista(7);

        System.out.println("Nyt: " + nyt);
        System.out.println("Viikon päästä: " + viikonPaasta);
        

        Paivays muokattava = new Paivays(30, 12, 2011); 
        Paivays uusi = muokattava.paivienPaasta(5);
        System.out.println( uusi );
    
    }

}
