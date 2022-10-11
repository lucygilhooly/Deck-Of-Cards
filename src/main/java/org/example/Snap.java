package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {
    public Snap(String name) {
        super(name);
    }

    Scanner scanner = new Scanner(System.in);
    Boolean gameActive = false;

    Player currentPlayer;
    Player player1;
    Player player2;
    void setPlayers() {
        System.out.println("How many players for this round? enter 1 or 2");
        String p = scanner.nextLine();

        if (p.equals("1")) {
            System.out.println("One player Snap!");
        } else if (p.equals("2")) {
            System.out.println("Two player Snap!");
            System.out.println("Player 1, please enter your name: ");
            String p1 = scanner.nextLine();
            player1 = new Player(p1);
            System.out.println("Player 2, please enter your name: ");
            String p2 = scanner.nextLine();
            player2 = new Player(p2);
            System.out.println("Best of luck, " + p1 + " and " + p2 + " Lets play!");
            currentPlayer = player1;
        }
        System.out.println(player1.getName()+ " Starts the game");

    }

    void switchPlayers(){
        if (currentPlayer == player2){
            currentPlayer = player1;
        }else {
            currentPlayer = player2;
        }
    }

    void playerCardDraw(){
        System.out.println(currentPlayer.getName() + "'s go!");
        System.out.println("Press enter to draw a card!");
        scanner.nextLine();
        System.out.println("The drawn card is ");
        dealCard();
        playingCards();

        if (deltCards.size() > 1 && deltCards.get(0).getValue() == deltCards.get(1).getValue()) {
            gameActive = false;
            System.out.println("SNAP!" + currentPlayer.getName()+ " Wins!!");
            playAgain();
        }
        if (deltCards.size() >= 52 || shuffledDeck.size() == 0) {
            gameActive = false;
            System.out.println("No cards left! Game Over.");
            playAgain();
        }
    }


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
        setPlayers();
        shuffleDeck();
        sortDeckInNumberOrder();
        gameActive = true;
        while (gameActive) {
            playerCardDraw();
            switchPlayers();
        }

    }

    public static void main(String[] args) {
        Snap game = new Snap("SNAP");
        game.playSnap();
    }
}
