package assignment;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String rock;
        String paper;
        String scissors;
        String player1;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Rock/Paper/Scissors");


        player1 = input.next();
        String com;
        int myList = rand.nextInt(3) + 1;
        if (myList == 1) {
            com = "rock";
        } else if (myList == 2) {
            com = "paper";
        } else {
            com = "scissors";
        }

        if (player1 == com) {
            System.out.println(" It's a tie");
        } else if (player1 == "rock") {
            if (com == "scissors") {
                System.out.println("PLayer One Wins!");
            } else if (com == "paper") {
                System.out.println("Computer Wins!");
            }
        }
        else if (player1 == "paper") {
            if (com == "rock")
                System.out.println("PLayer One Wins!");
        }
            else if()
        }
        elif Player1 == "scissors":
        if com == "paper":
        print("PLayer One Wins")
        player_Score += 1
        elif com == "rock":
        print("Computer Wins!")
        computer_Score += 1
    else:
        print("Please Type a Valid Move")

    }
}