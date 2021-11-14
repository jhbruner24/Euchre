package Core.Interfaces;

import Core.Player;
import Core.Models.Card;

public interface IPlayer {
    public void SetTeammate(Player teammate);

    public void PlayCard(Card card);

    public void TakeTrick();

    public int CountTricks();

    public void ResetTricks();

    public void RecieveCard(Card card);

    public void DealCards();
}
