package Core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Core.Constants.Rules.*;
import Core.Interfaces.IGame;
import Core.Models.Deck;

public class Game implements IGame {
    public Map<Integer, Player> playerList = new HashMap<Integer, Player>();
    public Deck deck = new Deck();
    public int playersDeal;
    public int playersLead;
    public Player[] team1 = new Player[2];
    public Player[] team2 = new Player[2];
    public Map<Player[], Integer> scores = new HashMap<Player[], Integer>();
    public Map<Player[], Integer> tricksInRound = new HashMap<Player[], Integer>();
    

    public void SetTeams() {
        for (int playerNum = 1; playerNum <= NUM_PLAYERS; playerNum++) {
            playerList.put(playerNum, new Player(playerNum));
        }
        team1[0] = playerList.get(1);
        team1[1] = playerList.get(3);
        playerList.get(1).SetTeammate(playerList.get(3));
        playerList.get(3).SetTeammate(playerList.get(1));

        team2[0] = playerList.get(2);
        team2[1] = playerList.get(4);
        playerList.get(2).SetTeammate(playerList.get(4));
        playerList.get(4).SetTeammate(playerList.get(2));
    }

    public void StartRound() {
        while (!RoundIsOver()) {
            
        }
    }

    public void startGame() {
        SetTeams();
        RandmizeDeal();
        ResetScores();

        while (!GameIsOver()) {
            ResetRound();
            playerList.get(playersDeal).DealCards();
            playersLead = playersDeal == NUM_PLAYERS ? 1 : playersDeal + 1;
            StartRound();
        }
    }

    public boolean GameIsOver() {
        int team1Score = scores.get(team1);
        int team2Score = scores.get(team2);
        if (team1Score >= SCORE_TO_WIN || team2Score >= SCORE_TO_WIN) {
            return true;
        }
        return false;
    }

    public boolean RoundIsOver() {
        int team1Tricks = tricksInRound.get(team1);
        int team2Tricks = tricksInRound.get(team2);

        if (team1Tricks + team2Tricks >= 5) {
            return true;
        }
        return false;
    }

    public void RandmizeDeal() {
        playersDeal = (int) ((Math.random() * (NUM_PLAYERS - 1)) + 1);
    }
 
    public void ResetScores() {
        scores.put(team1, 0);
        scores.put(team2, 0);
    }

    public void ResetRound() {
        tricksInRound.put(team1, 0);
        tricksInRound.put(team2, 0);
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}