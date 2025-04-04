import java.util.*;

public class Dealer {
    private List<Card> deck;

    public Dealer() {
        deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King"
        };

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card pickCard() {
        if (deck.isEmpty()) {
            return null;
        }
        return deck.remove(new Random().nextInt(deck.size()));
    }

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.shuffleDeck();
        Card pickedCard = dealer.pickCard();
        System.out.println("Picked card: " + pickedCard);
    }
}