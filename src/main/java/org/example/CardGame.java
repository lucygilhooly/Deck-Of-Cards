package org.example;
import java.util.ArrayList;

public class CardGame {

    private enum suits {
            SPADES, HEARTS, CLUBS, DIAMONDS
    }
    static ArrayList<Card> cardDeck = new ArrayList<>();

    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }

    public static void main(String[] args) {

    }

}
