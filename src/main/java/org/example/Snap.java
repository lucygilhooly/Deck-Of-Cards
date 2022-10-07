package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    public Snap(String name) {
        super(name);
    }

    Scanner scanner = new Scanner(System.in);
    Boolean gameActive = false;

    void playAgain() {
        System.out.println("Would you like to play again? Enter Yes or No");
        String playAgain = scanner.nextLine();
        if (playAgain.equals("yes")) {
            shuffleDeck();
            gameActive = true;
        } else {
            System.out.println("Thank you for playing Snap!");
            gameActive = false;
        }
    }

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
            playingCards();

            if (deltCards.size() > 1 && deltCards.get(0).getValue() == deltCards.get(1).getValue()) {
                gameActive = false;
                System.out.println("SNAP!");
                playAgain();
            }
            if (deltCards.size() >= 52 || shuffledDeck.size() == 0) {
                gameActive = false;
                System.out.println("No cards left! Game Over.");
                playAgain();
            }

        }

    }

    public static void main(String[] args) {
        Snap game = new Snap("SNAP");
        game.playSnap();
    }
}
