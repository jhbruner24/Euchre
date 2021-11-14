package Core.Models;

public class Card {
    private Suit suit;
    private int value;
    
    public Card(Suit suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public Suit GetSuit() {
        return suit;
    }

    public int GetValue() {
        return value;
    }
}
