import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        // First compare by suit
        int suitComparison = Integer.compare(c1.getSuit().ordinal(), c2.getSuit().ordinal());
        if (suitComparison != 0) {
            return suitComparison;
        }
        // If suits are the same, compare by value
        return Integer.compare(c1.getValue(), c2.getValue());
    }
}