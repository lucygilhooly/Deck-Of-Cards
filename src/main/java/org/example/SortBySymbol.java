package org.example;

import java.util.Comparator;

public class SortBySymbol implements Comparator<Card> {
    @Override
    public int compare(Card left, Card right) {
        if(left.getSymbol().equals(right.getSymbol())){
            return left.getValue() - right.getValue();
        }
        return left.getSymbol().compareTo(right.getSymbol());
    }
}
