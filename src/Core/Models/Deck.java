package Core.Models;

import static Core.Constants.Rules.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<Card>();

    public Deck() {
        for (Suit suit: Suit.values()) {
            for (int cardVal = LOW_CARD; cardVal <= HIGH_CARD; cardVal++) {
                cards.add(new Card(suit, cardVal));
            }
        }
    }

    public void ShuffleDeck() {
        Collections.shuffle(cards);
    }
}

