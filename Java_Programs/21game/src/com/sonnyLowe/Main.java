package com.sonnyLowe;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int gameCounter = 21;
        int turnCounter = 1;
        int playerTurn = 0;
        String winner = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Goal is to take turn taking sticks.");
        System.out.println("The person who has to take the last stick looses");
        System.out.println("Multiplayer == Type 1. Against Computer == Type 2");
        int playerChoice = scanner.nextInt();
        scanner.nextLine();

        if(playerChoice == 1 ){
            while (gameCounter != 0) {

                if (gameCounter == 1) {
                    System.out.println("Game Over");
                    if (turnCounter == 1) {
                        System.out.println("Player 1 has to take the last stick");
                        winner = "Player 2";
                    } else {
                        System.out.println("Player 2 has to take the last stick");
                        winner = "Player 1";
                    }
                    System.out.println("Winner is : " + winner);
                    break;
                } else {
                    if (turnCounter == 1) {
                        turnCounter = turnCounter * -1;
                        System.out.println("Player 1's Turn");
                        System.out.println("How many sticks would you like to take?");
                        System.out.println("There are " + gameCounter + " sticks.");
                        System.out.println("Type 1 , 2 , or 3");
                        playerTurn = scanner.nextInt();
                        scanner.nextLine();
                        if (playerTurn <= 3) {
                            gameCounter = gameCounter - playerTurn;
                        } else {
                            System.out.println("You are a cheater. Read Directions!");
                            break;
                        }
                    } else if (turnCounter == -1) {
                        System.out.println("How many sticks would you like to take?");
                        System.out.println("There are " + gameCounter + " sticks.");
                        System.out.println("Type 1 , 2 , or 3");
                        playerTurn = scanner.nextInt();
                        scanner.nextLine();
                        if (playerTurn <= 3) {
                            gameCounter = gameCounter - playerTurn;
                        } else {
                            System.out.println("You are a cheater. Read Directions!");
                            break;
                        }
                    }

                }
            }

        }else if(playerChoice == 2) {

            while (gameCounter != 0) {

                if (gameCounter == 1) {


                    System.out.println("Game Over");
                    if (turnCounter == 1) {
                        System.out.println("You have to take the last stick");
                        winner = "Computer";
                    } else {
                        System.out.println("Computer have to take the last stick");
                        winner = "You";
                    }
                    System.out.println("Winner is : " + winner);
                    break;

                } else {

                    if (turnCounter == 1) {
                        turnCounter = turnCounter * -1;
                        System.out.println("How many sticks would you like to take?");
                        System.out.println("There are " + gameCounter + " sticks.");
                        System.out.println("Type 1 , 2 , or 3");
                        playerTurn = scanner.nextInt();
                        scanner.nextLine();
                        if (playerTurn <= 3) {
                            gameCounter = gameCounter - playerTurn;
                        } else {
                            System.out.println("You are a cheater. Read Directions!");
                            break;
                        }
                    } else if (turnCounter == -1) {
                        turnCounter = turnCounter * -1;
                        gameCounter = gameCounter - (4 - playerTurn);
                        System.out.println("Computer's turn. The computer took " + (4 - playerTurn) + ".");
                        System.out.println(gameCounter + " sticks left.");
                    }

                }
            }
        }else{
            System.out.println("Type 1 or 2. Follow Directions!");
        }
        scanner.close();
    }
}
