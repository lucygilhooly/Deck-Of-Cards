package org.example;
import java.util.ArrayList;
import java.util.Random;

public class CardGame {
    enum suits {
            SPADES, HEARTS, CLUBS, DIAMONDS
    }
    private String name;
    private final String[] symbols = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final int[] values = new int[] {2,3,4,5,6,7,8,9,10,11,12,13,14};
    static ArrayList<Card> cardDeck = new ArrayList<>();
    ArrayList<Card> deltCards = new ArrayList<>();

    public CardGame(String name) {
        this.name= name;
        populateCardDeck();
    }

    void populateCardDeck(){
        for(suits suit : suits.values()){
            for (int i = 0; i < symbols.length; i++) {
                Card card = new Card(suit,symbols[i],values[i]);
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
    void dealCard(){
        deltCards.add(cardDeck.get(0));
        cardDeck.remove(0);
        System.out.println(deltCards);
        System.out.println(cardDeck);
    }

//    private static final Random RANDOM = new Random();
//
//    Card shuffleDeck(){
//        return cardDeck.get(RANDOM.nextInt(cardDeck.size()));
//
//    }



    public static void main(String[] args) {
        CardGame cards = new CardGame("SNAP");
        cards.dealCard();
        cards.dealCard();
        System.out.println(cards.deltCards);
    }

}
