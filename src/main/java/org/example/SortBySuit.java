package org.example;

import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {

    @Override
    public int compare(Card left, Card right) {
        //compare by suit and then by value
        // suits same...
        if(left.getSuit().equals(right)){
            //order by value
            return left.getValue() - right.getValue();
        }
        return left.getSuit().compareTo(right.getSuit());
    }
}
