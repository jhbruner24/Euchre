package Core;

import Core.Models.*;
import java.util.ArrayList;
import java.util.List;

import Core.Interfaces.IPlayer;

public class Player implements IPlayer {
    public int playerNum;
    public Player teammate;
    private List<Card> cards = new ArrayList<Card>();
    private int numTricks = 0;

    public Player(int playerNum) {
        this.playerNum = playerNum;
    }

    public void SetTeammate(Player teammate) {
        this.teammate = teammate;
    }

    public void PlayCard(Card card) {
        cards.remove(card);
    }

    public void TakeTrick() {
        numTricks += 1;
    }

    public int CountTricks() {
        return numTricks;
    }

    public void ResetTricks() {
        numTricks = 0;
    }

    public void RecieveCard(Card card) {
        cards.add(card);
    }

    public void DealCards() {
        
    }
}
