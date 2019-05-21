/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asssesment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zissah
 */
public class RockPaperScissors {
    
//     int wins = 0;
//     int losses = 0;
//     int tie = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // gets input from keyboard

        //declare variables and initialize variables
//        int rounds = 0;
     
        int compChoice = 0;
        int rock = 1;
        int paper = 2;
        int scissors = 3;

        String userInput = "";//get users input
        int numOfRounds = 0;
        String playersChoice = "";
        int pChoice = 0;
        String stringCompChoice = "";// gets comp input 
        String results = "";
        boolean play = true;
        String playAgain = "Yes";

        System.out.println("How many rounds do you want to play?");
        userInput = sc.nextLine();
        numOfRounds = Integer.parseInt(userInput); // converts string into #
        
        if (numOfRounds < 1 || numOfRounds > 10) {
            System.out.println("Error, rounds must between 1 and 10");
        } else {
            while (play){
            for (int i = 0; i < numOfRounds; i++){// sets boundries and increments the rounds
                System.out.println("Enter choice of Rock, paper or scissors");
                playersChoice = sc.nextLine();
                Random randomizer = new Random(); // random used for computer input
                compChoice = randomizer.nextInt((3 - 1) + 1) + 1;// sets inclusive range choice of 1-3

                switch (compChoice) {//gets computer input options
                    case 1:
                        stringCompChoice = "Rock";
                        break;
                    case 2:
                        stringCompChoice = "Paper";
                        break;
                    case 3:
                        stringCompChoice = "Scissors";
                        break;

                }
                if (playersChoice.equalsIgnoreCase("Rock")) {
                    pChoice = rock;
                    System.out.println("You chose rock");
                    System.out.println("Computer chose " + stringCompChoice);
                    compare(pChoice, compChoice);
                } else if (playersChoice.equalsIgnoreCase("Paper")) {
                    pChoice = paper;
                    System.out.println("You chose paper");
                    System.out.println("Computer chose " + stringCompChoice);
                    compare(pChoice, compChoice);
                } else if (playersChoice.equalsIgnoreCase("Scissors")) {
                    pChoice = scissors;
                    System.out.println("You chose scissors");
                    System.out.println("Computer chose " + stringCompChoice);
                    compare(pChoice, compChoice);
                }
            }
//        }    
            System.out.println("Would you like to play again?");
            playAgain = sc.nextLine();
            if (playAgain.equalsIgnoreCase("Yes")) {
            System.out.println("How many rounds do you want to play?");
        userInput = sc.nextLine();
        numOfRounds = Integer.parseInt(userInput); // converts string into #
                play = true;
            }
            if (playAgain.equalsIgnoreCase("No")) {
                play = false;
                System.out.println("Thanks for playing!");
            }
        }
        }
        //            while (play == true); //

        // }
         

 
}
    
   public static void compare(int playerPicked, int compPicked) {//compares given
     int win = 0;
     int loss = 0;
     int tie = 0;
     
        String compareMsg = "";
        if (playerPicked == compPicked) {
            compareMsg = "We have a tie!";
            tie = tie + 1;
            System.out.println("Tie "+ tie + " " + compareMsg);
        } else if (playerPicked == 1 && compPicked == 2) {
            compareMsg = "Computer wins!";
            loss = loss + 1;
            System.out.println("Loss " + loss + " " + compareMsg);
        } else if (playerPicked == 2 && compPicked == 3) {
            compareMsg = "Computer wins!";
            loss = loss+ 1;
            System.out.println("Loss " + loss + " " + compareMsg);
        } else if (playerPicked == 3 && compPicked == 1) {
            compareMsg = "Computer wins!";
            loss= loss + 1;
            System.out.println("Loss " + loss + " " + compareMsg);
        } else if (playerPicked == 2 && compPicked == 1) {
            compareMsg = "User wins!";
            win = win + 1;
            System.out.println("Win " + win + " " + compareMsg);
        } else if (playerPicked == 3 && compPicked == 2) {
            compareMsg = "User wins!";
            win = win + 1;
            System.out.println("Win  " + win + " " + compareMsg);
        } else if (playerPicked == 1 && compPicked == 3) {
            compareMsg = "User wins!";
             win = win + 1;
            System.out.println("Win  " + win + " " + compareMsg);
        }
        
        
//        return compareMsg
    }
}