import java.util.*;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card.toString());
        }
    }

    public void sort() {
        Collections.sort(cards); // Uses the compareTo method of Card
    }

    @Override
    public int compareTo(Hand other) {
        int thisSum = this.cards.stream().mapToInt(Card::getValue).sum();
        int otherSum = other.cards.stream().mapToInt(Card::getValue).sum();
        return Integer.compare(thisSum, otherSum);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
