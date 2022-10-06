package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Card implements Comparable<Card> {

    private final CardGame.suits suit;

    private final String symbol;
    private final int value;

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
        return symbol + " of " + suit;
    }

    @Override
    public int compareTo(Card o) {
        //deck number order
        //2222
        if(this.value < o.value){
            return -1;
        }
        if (this.value > o.value){
            return 1;
        }
        return 0;
    }
}
