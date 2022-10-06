package org.example;

import java.util.Scanner;

public class Snap extends CardGame{
    public Snap(String name) {
        super(name);
    }
    Scanner scanner = new Scanner(System.in);
    Boolean gameActive = false;

   public void playSnap() {
       System.out.println("Welcome to Snap");
       shuffleDeck();
       sortDeckInNumberOrder();
       gameActive = true;
       while (gameActive) {
           System.out.println("Press enter to draw a card!");
           scanner.nextLine();
           System.out.println("The drawn card is ");
           dealCard();

           if(deltCards.size() > 1 && deltCards.get(0).getValue() == deltCards.get(1).getValue()){ //currently checking all three requirements, just want to check if symbol matches
               gameActive = false;
               System.out.println("SNAP!");
           }
       }

   }

    public static void main(String[] args) {
       Snap game = new Snap("SNAP");
       game.playSnap();
    }


    // Snap
    // Card deck should be shuffled
    // player hits enter key to deal a card
    // Card should then be delt
    // player hits enter key again
    // another card delt
    // delt cards all sorted by number and suit
    // if this card is the same suit or value as previous card
    //




}
