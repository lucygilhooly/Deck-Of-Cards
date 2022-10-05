package org.example;

import java.util.Scanner;

public class Snap extends CardGame{
    public Snap(String name) {
        super(name);
    }
    Scanner scanner = new Scanner(System.in);
    Boolean gameActive;


   public void playSnap(){
        CardGame cards = new CardGame("Snap");
       System.out.println("Welcome to Snap");
       cards.shuffleDeck();
//       while(gameActive){
       System.out.println("Press enter to draw a card!");
       String player = scanner.nextLine();
       System.out.println(player + " The drawn card is ");
       cards.dealCard();
       cards.dealCard();
       cards.dealCard();
       cards.sortBySuit();
       cards.sortDeckInNumberOrder();

       }


    public static void main(String[] args) {
       Snap cards = new Snap("SNAP");
       cards.playSnap();
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
