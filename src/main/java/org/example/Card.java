package org.example;

import java.util.Arrays;

public class Card {
// need a card to be generated with a suit, a value and a symbol
    //possibly using enums for the suit

    private final CardGame.suits suit;

    private final String symbol;// ={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};;
    private final int value;// = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    public Card(CardGame.suits suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public CardGame.suits getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                '}';
    }
}
