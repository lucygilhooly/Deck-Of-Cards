package org.example;

import java.util.Arrays;

public class Card {

    private final String[] suit;// = {"spades", "hearts", "clubs", "diamonds"};

    private final String[] symbol;// ={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};;
    private final int[] value;// = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    public Card(String[] suit, String[] symbol, int[] value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + Arrays.toString(suit) +
                ", symbol=" + Arrays.toString(symbol) +
                ", value=" + Arrays.toString(value) +
                '}';
    }
}
