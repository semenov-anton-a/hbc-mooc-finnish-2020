import java.util.Comparator;

public class HumanLenghtSort implements Comparator<Henkilo>  {
    // Comparig for String
    // @Override
    // public int compare(Henkilo o1, Henkilo o2) {
        // return o2.getNimi().compareTo( o1.getNimi() );
    // }

    @Override
    public int compare(Henkilo o1, Henkilo o2) {
        return Integer.compare(o1.getPituus(), o2.getPituus());
    }

    // @Override
    // public int compare(Henkilo o1, Henkilo o2) {
    //     return Integer.compare(o1.getPituus(), o2.getPituus());
    // }
}
