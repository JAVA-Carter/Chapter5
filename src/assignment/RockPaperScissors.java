package assignment;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args) {
        String player;
        String computer = "";
        int computerInt;
        String response;


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
            System.out.println("please enter a move\n" + "Rock = R, Paper" +
                    "= P, and Scissors = S.");

            System.out.println();
            computerInt = generator.nextInt(3) + 1;

            if (computerInt == 1)
                computer = "R";
            else if (computerInt == 2)
                computer = "P";
            else if (computerInt == 3)
                computer = "S";

            System.out.println("Enter your move: ");
            player = scan.next();
            player = player.toUpperCase();
            System.out.println("Computer's move is:\n " + computer);


            if (player.equals(computer))
                System.out.println("It's a tie!");
            else if (player.equals("R")) {
                if (computer.equals("S")) {
                    System.out.println("Rock crushes scissors. You win!!");

                } else if (computer.equals("P")) {
                    System.out.println("Paper eats rock. You lose!!");

                }
            } else if (player.equals("P")) {
                if (computer.equals("S")) {
                    System.out.println("Scissor cuts paper. You lose!!");

                } else if (computer.equals("R")) {
                    System.out.println("Paper eats rock. You win!!");

                }
            } else if (player.equals("S")) {
                if (computer.equals("P")) {
                    System.out.println("Scissor cuts paper. You win!!");

                } else if (computer.equals("R")) {
                    System.out.println("Rock breaks scissors. You lose!!");

                }
            } else
                System.out.println("Invalid user input.");
    }
}
