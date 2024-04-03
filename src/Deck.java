import java.util.*;
public class Deck {
	private ArrayList<Card> cards;
	
	public Deck() {
		this.cards = new ArrayList<Card>();
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	public Card removeTopCard() {
		if(this.cards.size() == 0) {
			return null;
		}
		Card topCard = this.cards.get(0);
		this.cards.remove(0);
		return topCard;
	}
	public void printDeck() {
        for (Card card : this.cards) {
            System.out.print(card.getPicture() + ", ");
        }
    }
	public void add(Card x) {
		this.cards.add(x);
	}
}
