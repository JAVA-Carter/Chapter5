package examples;

import java.util.Scanner;

public class AgeInsultGenerator {
    public static void main(String[] args){
        int age;

        Scanner input = new Scanner(System.in);
        System.out.print("What is your age >>> ");
        age = input.nextInt();

        if ( age < 0){
            System.out.println("Age not valid");
        }
        else if (age >= 12){
            System.out.println("Little baby");
        }
        else if (age >= 13 || age <= 20){
            System.out.println("Dumb Teenager");
        }
        else if (age >= 21 || age < 29){
            System.out.println("You think you know better but you still have a lot to learn");
        }
        else if (age >= 30 || age <= 45){
            System.out.println("Your Prime years are behind you");
        }
        else if (age >= 46 || age <= 55){
            System.out.println("Oldhead");
        }
        else {
            System.out.println("Congrats on your senior pass");
        }

    }
}
