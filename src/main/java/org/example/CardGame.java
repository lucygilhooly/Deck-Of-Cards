package org.example;

import java.util.ArrayList;
import java.util.Random;

public class CardGame {
    enum suits {
        SPADES, HEARTS, CLUBS, DIAMONDS
    }

    private String name;
    private final String[] symbols = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final int[] values = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    static ArrayList<Card> cardDeck = new ArrayList<>();
    static ArrayList<Card> deltCards = new ArrayList<>();
    static ArrayList<Card> shuffledDeck = new ArrayList<>();

    public CardGame(String name) {
        this.name = name;
        populateCardDeck();
    }

    void populateCardDeck() {
        for (suits suit : suits.values()) {
            for (int i = 0; i < symbols.length; i++) {
                Card card = new Card(suit, symbols[i], values[i]);
                cardDeck.add(card);
            }
        }

        for (int i = 0; i < cardDeck.size(); i++) {
            System.out.println(cardDeck.get(i));
        }
    }

    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }

    void dealCard() {
        if (cardDeck.size() > 0) {
            deltCards.add(cardDeck.get(0));
            cardDeck.remove(0);
        } else {
            deltCards.add(shuffledDeck.get(0));
            shuffledDeck.remove(0);
        }
        System.out.println(deltCards);
        System.out.println(cardDeck);
    }

    void shuffleDeck() {
        while (cardDeck.size() > 0) {
            int index = (int) (Math.random() * cardDeck.size());
            Card removedCard = cardDeck.remove(index);
            shuffledDeck.add(removedCard);
        }
        System.out.println(cardDeck);
        System.out.println(shuffledDeck);
    }


    public static void main(String[] args) {
        CardGame cards = new CardGame("SNAP");
        cards.dealCard();
        cards.shuffleDeck();
        cards.dealCard();
    }

}
