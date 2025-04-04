public class Card {
    private String suit;
    private String rank;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of "+suit;
    }
}